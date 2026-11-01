package tv.danmaku.biliplayerimpl.report.heartbeat;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes26.dex */
public final class HeartbeatParams extends com.bilibili.api.base.util.ParamsMap {
    public HeartbeatParams(long j, java.lang.String str, long j2, long j3, long j4, java.lang.String str2, long j5, java.lang.String str3, int i, int i2, long j6, long j7, long j8, long j9, java.lang.String str4, int i3, long j10, long j11, int i4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, long j12, int i5, long j13, long j14, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, boolean z, boolean z2, java.util.Map<java.lang.String, java.lang.String> map) {
        putParams(new java.lang.String[]{"start_ts", java.lang.String.valueOf(j)});
        putParams(new java.lang.String[]{"session", str});
        putParams(new java.lang.String[]{"mid", java.lang.String.valueOf(j2)});
        putParams(new java.lang.String[]{"aid", java.lang.String.valueOf(j3)});
        putParams(new java.lang.String[]{"cid", java.lang.String.valueOf(j4)});
        putParams(new java.lang.String[]{"sid", str2});
        putParams(new java.lang.String[]{"epid", java.lang.String.valueOf(j5)});
        putParams(new java.lang.String[]{"type", str3});
        putParams(new java.lang.String[]{"sub_type", java.lang.String.valueOf(i)});
        putParams(new java.lang.String[]{"quality", java.lang.String.valueOf(i2)});
        putParams(new java.lang.String[]{"total_time", java.lang.String.valueOf(j6)});
        putParams(new java.lang.String[]{"paused_time", java.lang.String.valueOf(j7)});
        putParams(new java.lang.String[]{"played_time", java.lang.String.valueOf(j8)});
        putParams(new java.lang.String[]{"video_duration", java.lang.String.valueOf(j9)});
        putParams(new java.lang.String[]{"play_type", str4});
        putParams(new java.lang.String[]{"network_type", java.lang.String.valueOf(i3)});
        putParams(new java.lang.String[]{"last_play_progress_time", java.lang.String.valueOf(j10)});
        putParams(new java.lang.String[]{"max_play_progress_time", java.lang.String.valueOf(j11)});
        putParams(new java.lang.String[]{"from", java.lang.String.valueOf(i4)});
        putParams(new java.lang.String[]{"from_spmid", str5});
        putParams(new java.lang.String[]{"spmid", str6});
        putParams(new java.lang.String[]{"epid_status", str7});
        putParams(new java.lang.String[]{"play_status", str8});
        putParams(new java.lang.String[]{"user_status", str9});
        putParams(new java.lang.String[]{"actual_played_time", java.lang.String.valueOf(j12)});
        putParams(new java.lang.String[]{"auto_play", java.lang.String.valueOf(i5)});
        putParams(new java.lang.String[]{"list_play_time", java.lang.String.valueOf(j13)});
        putParams(new java.lang.String[]{"miniplayer_play_time", java.lang.String.valueOf(j14)});
        if (str10 != null && str10.length() != 0) {
            putParams(new java.lang.String[]{"play_mode", str10});
        }
        putParams(new java.lang.String[]{"cur_language", str11 == null ? "" : str11});
        putParams(new java.lang.String[]{"perfer_type", str12 != null ? str12 : ""});
        putParams(new java.lang.String[]{"track_id", str13});
        putParams(new java.lang.String[]{"oaid", str14});
        putParams(new java.lang.String[]{"polaris_action_id", str15});
        putParams(new java.lang.String[]{"is_auto_qn", z ? "1" : "0"});
        putParams(new java.lang.String[]{"is_audio_play", z2 ? "1" : "2"});
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                putParams(new java.lang.String[]{entry.getKey(), entry.getValue()});
            }
        }
    }

    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.String) {
            return containsKey((java.lang.String) obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.String) {
            return containsValue((java.lang.String) obj);
        }
        return false;
    }

    public final /* bridge */ java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> entrySet() {
        return getEntries();
    }

    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.String) {
            return get((java.lang.String) obj);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> getEntries() {
        return super/*java.util.AbstractMap*/.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ java.util.Set<java.lang.String> getKeys() {
        return super/*java.util.AbstractMap*/.keySet();
    }

    public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj == null ? true : obj instanceof java.lang.String) ? obj2 : getOrDefault((java.lang.String) obj, (java.lang.String) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ int getSize() {
        return super/*java.util.AbstractMap*/.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ java.util.Collection<java.lang.String> getValues() {
        return super/*java.util.AbstractMap*/.values();
    }

    public final /* bridge */ java.util.Set<java.lang.String> keySet() {
        return getKeys();
    }

    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.String) {
            return remove((java.lang.String) obj);
        }
        return null;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ java.util.Collection<java.lang.String> values() {
        return getValues();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ boolean containsKey(java.lang.String str) {
        return super/*java.util.AbstractMap*/.containsKey((java.lang.Object) str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ boolean containsValue(java.lang.String str) {
        return super/*java.util.AbstractMap*/.containsValue((java.lang.Object) str);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public final /* bridge */ java.lang.String m279get(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.String) {
            return get((java.lang.String) obj);
        }
        return null;
    }

    public final /* bridge */ java.lang.String getOrDefault(java.lang.Object obj, java.lang.String str) {
        return !(obj == null ? true : obj instanceof java.lang.String) ? str : getOrDefault((java.lang.String) obj, str);
    }

    /* JADX INFO: renamed from: remove, reason: collision with other method in class */
    public final /* bridge */ java.lang.String m280remove(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.String) {
            return remove((java.lang.String) obj);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ java.lang.String get(java.lang.String str) {
        return (java.lang.String) super/*java.util.AbstractMap*/.get((java.lang.Object) str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ java.lang.String getOrDefault(java.lang.String str, java.lang.String str2) {
        return (java.lang.String) super/*java.util.HashMap*/.getOrDefault((java.lang.Object) str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ java.lang.String remove(java.lang.String str) {
        return (java.lang.String) super/*java.util.AbstractMap*/.remove((java.lang.Object) str);
    }

    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if (!(obj == null ? true : obj instanceof java.lang.String)) {
            return false;
        }
        if (obj2 != null ? obj2 instanceof java.lang.String : true) {
            return remove((java.lang.String) obj, (java.lang.String) obj2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ boolean remove(java.lang.String str, java.lang.String str2) {
        return super/*java.util.HashMap*/.remove((java.lang.Object) str, (java.lang.Object) str2);
    }
}
