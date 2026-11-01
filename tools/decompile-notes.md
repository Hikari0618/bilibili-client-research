# 反编译流程（可复现）

目标：从 300 MB+ 的多 dex APK 里，快速定位某个字符串所在的 dex，并只反编译那一两个 dex。

全量反编译 33 个 dex 既慢又占内存；按 dex 定向反编译把单次分析压到 2–4 分钟。

---

## 1. 拆 split APK

`.apks` 是 zip，`base.apk` 在里面。

```bash
python3 -c "import zipfile; zipfile.ZipFile('bilibili_6.5.0.apks').extract('base.apk','.')"
```

## 2. 把 dex 摊出来

```bash
python3 - <<'EOF'
import zipfile, os
z = zipfile.ZipFile('base.apk')
os.makedirs('dex', exist_ok=True)
for i in z.infolist():
    if i.filename.endswith('.dex'):
        open('dex/' + i.filename, 'wb').write(z.read(i.filename))
EOF
```

## 3. 先搜字符串，再决定反编译谁

```bash
grep -l -a -F "history/report"      dex/*.dex
grep -l -a -F "click/android2"      dex/*.dex
grep -l -a -F "report/heartbeat/mobile" dex/*.dex
```

`-a` 必须加：dex 是二进制，不加会被当成 binary file 跳过。

## 4. 单 dex 反编译

```bash
JAVA_OPTS="-Xmx3g" ~/tools/jadx-1.5.6/bin/jadx \
  -d out --no-res --no-imports -j 4 dex/classes17.dex
```

- `--no-res`：不解资源，快很多
- `-j 4`：限制线程，控制在 3 GB 堆内
- 日志里的 `finished with errors, count: N` 是 jadx 对个别类还原失败（通常 <5%），不影响整体

## 5. 类索引（找「这个类在哪个 dex」）

多 dex 应用里最耗时的是「类 A 在哪个 dex」。用 class_defs 建索引：

```bash
python3 dexindex.py dex "hJ1/b"        # 按包名/类名子串查
python3 dexindex.py dex --all > all.tsv
```

原理：读 dex 头的 `string_ids` / `type_ids` / `class_defs`，把 `class_def` 的 `class_idx` 映射回类型描述符。

## 6. 单个类反编译（绕过 case 冲突）

混淆代码里常有只差大小写的类（`La0/a;` 和 `LA0/a;`），全量输出会互相覆盖。用：

```bash
jadx --single-class 'hJ1.b' --single-class-output hJ1b.java dex/classes27.dex
```

jadx 会打印它实际解析到的名字（例如 `p005hJ1.b`），以那个为准。

## 7. 签名 / 加密类怎么找

1. 搜算法字符串：`grep -l -a "AES/CBC" dex/*.dex`、`"HmacSHA"`、`"SHA-256"`
2. 搜调用点的返回类型：`--single-class` 打开调用方，看它引用的工具类
3. 工具类若被混淆成 `a.b.c`，用 `dexindex.py` 按「包名片段」定位
4. 实在找不到定义 dex，用 androguard 在调用方 dex 的 `method_ids` 里反查描述符：

```python
from androguard.core.dex import DEX
d = DEX(open('dex/classes26.dex','rb').read())
for m in d.get_methods():
    if m.get_name() == 'g' and '[B' in m.get_descriptor():
        print(m.get_class_name(), m.get_name(), m.get_descriptor())
```

## 8. 交叉验证两个 APK

同一份代码会编进不同 flavor（`tv.danmaku.bilibilihd` / `com.bilibili.app.in`），类名一致。用

```bash
for f in hd/*.dex; do grep -l -a -F "report/heartbeat/mobile" "$f"; done
```

确认关键接口在两边都存在，避免把某个 flavor 的特例当成通用实现。

## 9. 清理

反编译产物（dex + 源码树）通常 1–2 GB。分析结束后只保留：

- 被引用的关键类（`evidence/classes/`）
- 报告

其余删除。**注意**：删掉后想复查某个类需要重跑 2–4 分钟，重要结论请当场把类文件复制出来。
