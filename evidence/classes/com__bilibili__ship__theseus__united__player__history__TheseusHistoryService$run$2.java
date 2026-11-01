package com.bilibili.ship.theseus.united.player.history;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes16.dex */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2", f = "TheseusHistoryService.kt", l = {78, com.bilibili.studio.material.util.TypeConstant.CustomizeSticker_VALUE}, m = "invokeSuspend", v = 1)
final class TheseusHistoryService$run$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.bilibili.ship.theseus.united.player.history.b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2$1", f = "TheseusHistoryService.kt", l = {com.bilibili.studio.videoeditor.CaptionFx.RECYCLE_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;
        final /* synthetic */ com.bilibili.ship.theseus.united.player.history.b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2$1$a */
        /* JADX INFO: compiled from: BL */
        public static final class a<T> implements kotlinx.coroutines.flow.e {
            public final /* synthetic */ com.bilibili.ship.theseus.united.player.history.b b;

            public a(com.bilibili.ship.theseus.united.player.history.b bVar) {
                this.b = bVar;
            }

            public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                long j = ((kotlin.time.a) obj).b;
                int i = com.bilibili.ship.theseus.united.player.history.b.n;
                com.bilibili.ship.theseus.united.player.history.b bVar2 = this.b;
                com.bilibili.ship.theseus.keel.player.j jVar = bVar2.g;
                kotlin.time.a aVarM = jVar.l().m();
                if (aVarM != null) {
                    bVar2.k = new com.bilibili.ship.theseus.united.player.history.b.a(aVarM.b, jVar.l().y());
                }
                return Zx1.o.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.united.player.history.b bVar, dy1.b<? super com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2.AnonymousClass1> bVar2) {
            super(2, bVar2);
            this.this$0 = bVar;
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2.AnonymousClass1(this.this$0, bVar);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                kotlinx.coroutines.flow.d dVarL = this.this$0.g.l().L();
                com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2.AnonymousClass1.a aVar = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2.AnonymousClass1.a(this.this$0);
                this.label = 1;
                if (dVarL.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
            }
            return Zx1.o.a;
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, dy1.b<? super Zx1.o> bVar) {
            return create(coroutineScope, bVar).invokeSuspend(Zx1.o.a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2$2", f = "TheseusHistoryService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.bilibili.player.tangram.basic.PlayerAvailability, dy1.b<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;

        public AnonymousClass2(dy1.b<? super com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2.AnonymousClass2> bVar) {
            super(2, bVar);
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2.AnonymousClass2 anonymousClass2 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2.AnonymousClass2(bVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final java.lang.Object invoke(com.bilibili.player.tangram.basic.PlayerAvailability playerAvailability, dy1.b<? super java.lang.Boolean> bVar) {
            return create(playerAvailability, bVar).invokeSuspend(Zx1.o.a);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.a(obj);
            return java.lang.Boolean.valueOf(((com.bilibili.player.tangram.basic.PlayerAvailability) this.L$0) == com.bilibili.player.tangram.basic.PlayerAvailability.READY);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusHistoryService$run$2(com.bilibili.ship.theseus.united.player.history.b bVar, dy1.b<? super com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2> bVar2) {
        super(2, bVar2);
        this.this$0 = bVar;
    }

    public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
        com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2 theseusHistoryService$run$2 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2(this.this$0, bVar);
        theseusHistoryService$run$2.L$0 = obj;
        return theseusHistoryService$run$2;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.c.a(obj);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
            }
            return Zx1.o.a;
        }
        kotlin.c.a(obj);
        kotlinx.coroutines.g.d((kotlinx.coroutines.CoroutineScope) this.L$0, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2.AnonymousClass1(this.this$0, null), 3);
        kotlinx.coroutines.flow.d dVarA = this.this$0.g.a();
        com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2.AnonymousClass2 anonymousClass2 = new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$run$2.AnonymousClass2(null);
        this.label = 1;
        if (kotlinx.coroutines.flow.f.v(dVarA, anonymousClass2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        this.this$0.i = ol.d.d();
        com.bilibili.ship.theseus.united.player.history.b bVar = this.this$0;
        this.label = 2;
        bVar.getClass();
        if (kotlinx.coroutines.F.d(new com.bilibili.ship.theseus.united.player.history.TheseusHistoryService$runReport$2(bVar, null), this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return Zx1.o.a;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, dy1.b<? super Zx1.o> bVar) {
        return create(coroutineScope, bVar).invokeSuspend(Zx1.o.a);
    }
}
