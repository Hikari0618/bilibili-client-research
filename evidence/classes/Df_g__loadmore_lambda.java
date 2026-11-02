// 节选：Df.g 是一个被合并的 lambda 容器类（classes10.dex），此处只保留与分页相关的一段。
// 调用点：PegasusFragment.onViewCreated → new com.bilibili.pegasus.widget.h(new Df.g(this, 14))
// 说明：switch(i) 的 case 14 即「上滑加载更多」的回调体。

            case 14:
                PegasusFragment pegasusFragment = (PegasusFragment) obj;
                PegasusViewModel.y0(pegasusFragment.Pl(), false, PegasusFlush.PULL_UP, (String) null, (String) null, (LE0.e) null, (String) null, pegasusFragment.Vl(), pegasusFragment.Ul(), (Function0) null, 316);
                return Zx1.o.a;
            case 15:
