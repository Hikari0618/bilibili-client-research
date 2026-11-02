package com.bilibili.pegasus.vm;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili2/dex/classes17.dex */
public final class LoadMoreAction implements com.bilibili.pegasus.A<NE0.c> {
    public final ME0.f a;
    public final com.bilibili.pegasus.request.g b;

    public LoadMoreAction(ME0.f fVar, com.bilibili.pegasus.request.g gVar) {
        this.a = fVar;
        this.b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bilibili.pegasus.A
    public final java.lang.Object a(com.bilibili.pegasus.Store<NE0.c> store, dy1.b<? super com.bilibili.pegasus.InterfaceC0514a> bVar) {
        com.bilibili.pegasus.vm.LoadMoreAction$run$1 loadMoreAction$run$1;
        if (bVar instanceof com.bilibili.pegasus.vm.LoadMoreAction$run$1) {
            loadMoreAction$run$1 = (com.bilibili.pegasus.vm.LoadMoreAction$run$1) bVar;
            int i = loadMoreAction$run$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loadMoreAction$run$1.label = i - Integer.MIN_VALUE;
            } else {
                loadMoreAction$run$1 = new com.bilibili.pegasus.vm.LoadMoreAction$run$1(this, bVar);
            }
        } else {
            loadMoreAction$run$1 = new com.bilibili.pegasus.vm.LoadMoreAction$run$1(this, bVar);
        }
        java.lang.Object objB = loadMoreAction$run$1.result;
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loadMoreAction$run$1.label;
        ME0.f fVar = this.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    kotlin.c.a(objB);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.a(objB);
                }
                ME0.b bVarAvoidEmptyWindow = com.bilibili.pegasus.vm.ActionsKt.avoidEmptyWindow(com.bilibili.pegasus.vm.A.a((Vg0.c) objB, fVar));
                return (bVarAvoidEmptyWindow.d() || bVarAvoidEmptyWindow.c().isEmpty()) ? new com.bilibili.pegasus.vm.e(bVarAvoidEmptyWindow) : new ME0.a(bVarAvoidEmptyWindow);
            }
            kotlin.c.a(objB);
            if (store.getState().c()) {
                return new com.bilibili.pegasus.vm.l("loadMore isLoading");
            }
            if (store.getState().a.a.size() >= ((java.lang.Number) com.bilibili.pegasus.vm.u.a.getValue()).intValue()) {
                return new com.bilibili.pegasus.vm.l("loadMore feeds size is max");
            }
            com.bilibili.pegasus.vm.i iVar = new com.bilibili.pegasus.vm.i(0);
            loadMoreAction$run$1.label = 1;
            if (store.u(iVar, loadMoreAction$run$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            com.bilibili.pegasus.request.g gVar = this.b;
            loadMoreAction$run$1.label = 2;
            objB = com.bilibili.pegasus.request.a.b(fVar, gVar, loadMoreAction$run$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            ME0.b bVarAvoidEmptyWindow2 = com.bilibili.pegasus.vm.ActionsKt.avoidEmptyWindow(com.bilibili.pegasus.vm.A.a((Vg0.c) objB, fVar));
            if (bVarAvoidEmptyWindow2.d()) {
            }
        } catch (java.lang.Exception e) {
            tv.danmaku.android.log.BLog.e("PegasusActions", "LoadMoreAction error", e);
            return new com.bilibili.pegasus.vm.e(new ME0.b(null, e, fVar, false));
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.bilibili.pegasus.vm.LoadMoreAction)) {
            return false;
        }
        com.bilibili.pegasus.vm.LoadMoreAction loadMoreAction = (com.bilibili.pegasus.vm.LoadMoreAction) obj;
        return kotlin.jvm.internal.n.f(this.a, loadMoreAction.a) && kotlin.jvm.internal.n.f(this.b, loadMoreAction.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "LoadMoreAction(requestParam=" + this.a + ", parser=" + this.b + ")";
    }
}
