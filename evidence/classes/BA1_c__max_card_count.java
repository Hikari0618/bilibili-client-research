// 节选：BA1.c 是被合并的 lambda 容器（classes26.dex），此处只保留 pegasus.max_card_count 一段。
// 调用点：com.bilibili.pegasus.vm.u.a = kotlin.b.c(new BA1.c(13))

            case AdditionUP.USER_INFO_FIELD_NUMBER /* 13 */:
                String str2 = (String) aA0.i.a(ConfigManager.b, "pegasus.max_card_count", (Object) null);
                return Integer.valueOf(str2 != null ? Integer.parseInt(str2) : 500);
            case AdditionUP.DYNAMIC_ID_FIELD_NUMBER /* 14 */:
