package com.bilibili.pegasus.vm;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili3/dex/classes17.dex */
@androidx.annotation.Keep
public final class ActionsKt {
    private static final java.lang.String TAG = "PegasusActions";
    private static final Zx1.e enableRawWindowSizeTypeReport$delegate = kotlin.b.c(new CA0.c(19));

    /* JADX INFO: renamed from: com.bilibili.pegasus.vm.ActionsKt$fetchPreloadedPullDownRefreshAction$1, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.pegasus.vm.ActionsKt", f = "Actions.kt", l = {236, 239}, m = "fetchPreloadedPullDownRefreshAction", v = 1)
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(dy1.b<? super com.bilibili.pegasus.vm.ActionsKt.AnonymousClass1> bVar) {
            super(bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.bilibili.pegasus.vm.ActionsKt.fetchPreloadedPullDownRefreshAction(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ME0.b avoidEmptyWindow(ME0.b bVar) {
        java.lang.Object next;
        FE0.f fVar = bVar.a;
        java.util.List<com.bilibili.pegasus.PegasusHolderData> listD = fVar != null ? fVar.d() : null;
        com.bilibili.pegasus.PegasusWindowProfile.a aVar = com.bilibili.pegasus.PegasusWindowProfile.Companion;
        int i = bVar.c.j;
        aVar.getClass();
        java.util.Iterator it = com.bilibili.pegasus.PegasusWindowProfile.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((com.bilibili.pegasus.PegasusWindowProfile) next).getType() != i);
        com.bilibili.pegasus.PegasusWindowProfile pegasusWindowProfile = (com.bilibili.pegasus.PegasusWindowProfile) next;
        if (pegasusWindowProfile == null) {
            pegasusWindowProfile = com.bilibili.pegasus.PegasusWindowProfile.Normal;
        }
        int columns = pegasusWindowProfile.getColumns();
        java.util.List<com.bilibili.pegasus.PegasusHolderData> list = listD;
        if (list == null || list.isEmpty() || com.bilibili.app.comm.list.common.utils.m.a()) {
            return bVar;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        boolean z = false;
        boolean z2 = false;
        for (com.bilibili.pegasus.PegasusHolderData pegasusHolderData : listD) {
            if (pegasusHolderData.getHolderStyle().isSmallCard()) {
                arrayList2.add(pegasusHolderData);
                if (arrayList2.size() == columns) {
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                }
            } else {
                arrayList.add(pegasusHolderData);
                if (!arrayList2.isEmpty()) {
                    reportDiscard((com.bilibili.pegasus.PegasusHolderData) arrayList2.get(0));
                    arrayList2.clear();
                    z2 = true;
                }
            }
            if (!z) {
                FE0.a aVar2 = pegasusHolderData instanceof FE0.a ? (FE0.a) pegasusHolderData : null;
                if (!kotlin.jvm.internal.n.f(aVar2 != null ? aVar2.r() : null, "v5")) {
                    z = false;
                }
            }
            z = true;
        }
        com.bilibili.app.comm.list.common.feed.FeedbackEventType feedbackEventType = com.bilibili.app.comm.list.common.feed.FeedbackEventType.PEGASUS_REQUEST;
        java.util.Map mapC = ac0.e.c("has_threrepoint_v", z ? com.bilibili.pegasus.api.modelv2.UGCInlineMenusConfig.FLAG_VISIBLE : "0");
        if (((java.lang.Boolean) Gj.s.a.getValue()).booleanValue()) {
            Zx1.e eVar = wg0.a.a;
            gr0.o.v(24, "pegasus.threepoint.state.track", kotlin.collections.J.z(kotlin.collections.J.x(new kotlin.Pair[]{new kotlin.Pair(com.bilibili.pegasus.api.modelv2.channel.ChannelSortItem.SORT_NEW, java.lang.String.valueOf(0)), new kotlin.Pair("type", java.lang.String.valueOf(feedbackEventType.getType()))}), mapC), (kotlin.jvm.functions.Function0) null, false);
        }
        if (!arrayList2.isEmpty()) {
            reportDiscard((com.bilibili.pegasus.PegasusHolderData) arrayList2.get(0));
            arrayList2.clear();
            z2 = true;
        }
        if (!z2) {
            return bVar;
        }
        FE0.f fVar2 = bVar.a;
        return ME0.b.a(bVar, fVar2 != null ? FE0.f.a(fVar2, arrayList, null, null, 6) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enableRawWindowSizeTypeReport_delegate$lambda$0() {
        java.lang.Integer numR;
        int iA = Dr0.f.a(1, 1000);
        java.lang.String strDd = com.bilibili.lib.dd.DeviceDecision.INSTANCE.dd("pegasus.raw_window_size_type_report_sample_rate", "100");
        return iA <= ((strDd == null || (numR = kotlin.text.p.r(10, strDd)) == null) ? 100 : numR.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object fetchPreloadedPullDownRefreshAction(ME0.f fVar, com.bilibili.pegasus.request.g gVar, dy1.b<? super com.bilibili.pegasus.InterfaceC0514a> bVar) {
        com.bilibili.pegasus.vm.ActionsKt.AnonymousClass1 anonymousClass1;
        if (bVar instanceof com.bilibili.pegasus.vm.ActionsKt.AnonymousClass1) {
            anonymousClass1 = (com.bilibili.pegasus.vm.ActionsKt.AnonymousClass1) bVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.bilibili.pegasus.vm.ActionsKt.AnonymousClass1(bVar);
            }
        } else {
            anonymousClass1 = new com.bilibili.pegasus.vm.ActionsKt.AnonymousClass1(bVar);
        }
        java.lang.Object objB = anonymousClass1.result;
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fVar = (ME0.f) anonymousClass1.L$0;
                    kotlin.c.a(objB);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.a(objB);
                }
                ME0.b bVar2 = (ME0.b) objB;
                return (bVar2.d() || bVar2.c().isEmpty()) ? postPreloadedPullDownRefreshErrorAction(bVar2) : new ME0.d(bVar2, false);
            }
            kotlin.c.a(objB);
            anonymousClass1.L$0 = fVar;
            anonymousClass1.label = 1;
            objB = com.bilibili.pegasus.request.a.b(fVar, gVar, anonymousClass1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            ME0.b bVarAvoidEmptyWindow = avoidEmptyWindow(com.bilibili.pegasus.vm.A.a((Vg0.c) objB, fVar));
            kotlin.jvm.functions.Function0<java.lang.String> function0 = fVar.h;
            java.lang.String str = function0 != null ? (java.lang.String) function0.invoke() : null;
            anonymousClass1.L$0 = fVar;
            anonymousClass1.label = 2;
            objB = com.bilibili.pegasus.components.topview.a.a(bVarAvoidEmptyWindow, str, anonymousClass1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            ME0.b bVar3 = (ME0.b) objB;
            if (bVar3.d()) {
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            tv.danmaku.android.log.BLog.e(TAG, "fetchPreloadedPullDownRefreshAction error", e2);
            return postPreloadedPullDownRefreshErrorAction(new ME0.b(null, e2, fVar, false));
        }
    }

    private static final boolean getEnableRawWindowSizeTypeReport() {
        return ((java.lang.Boolean) enableRawWindowSizeTypeReport$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.bilibili.pegasus.InterfaceC0514a postPreloadedPullDownRefreshErrorAction(ME0.b bVar) {
        return ((java.lang.Boolean) com.bilibili.pegasus.common.n.b.getValue()).booleanValue() ? new com.bilibili.pegasus.vm.C0654a(bVar) : new com.bilibili.pegasus.vm.e(bVar);
    }

    private static final void reportDiscard(com.bilibili.pegasus.PegasusHolderData pegasusHolderData) {
        java.lang.String trackId;
        tv.danmaku.android.log.BLog.w(TAG, "discard card:" + pegasusHolderData);
        com.bilibili.pegasus.components.customreporter.EventType eventType = com.bilibili.pegasus.components.customreporter.EventType.DISCARD_CARD;
        kotlin.Pair pair = new kotlin.Pair("card_type", pegasusHolderData.getHolderType());
        FE0.a aVar = pegasusHolderData instanceof FE0.a ? (FE0.a) pegasusHolderData : null;
        if (aVar == null || (trackId = aVar.getTrackId()) == null) {
            trackId = "";
        }
        com.bilibili.pegasus.components.customreporter.g.a(eventType, kotlin.collections.J.v(new kotlin.Pair[]{pair, new kotlin.Pair("track_id", trackId), new kotlin.Pair("index", java.lang.String.valueOf(pegasusHolderData.getExtra().a)), new kotlin.Pair("card_data", new com.google.gson.Gson().p(pegasusHolderData))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportPreApiRawWindowSizeType(int i) {
        if (com.bilibili.pegasus.request.a.f < 0) {
            return;
        }
        int i2 = com.bilibili.pegasus.request.a.f;
        com.bilibili.pegasus.request.a.f = -1;
        if (i2 != i && getEnableRawWindowSizeTypeReport()) {
            gr0.o.q("tm_raw_window_size_type_compare", kotlin.collections.J.v(new kotlin.Pair[]{new kotlin.Pair("pre_api_value", java.lang.String.valueOf(i2)), new kotlin.Pair("seg_value", java.lang.String.valueOf(i))}), false);
        }
    }
}
