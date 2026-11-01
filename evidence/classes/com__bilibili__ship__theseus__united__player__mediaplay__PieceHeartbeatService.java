package com.bilibili.ship.theseus.united.player.mediaplay;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes16.dex */
public final class PieceHeartbeatService {
    public final com.bilibili.ship.theseus.united.page.videopiece.b a;
    public final RI1.a b;
    public final com.bilibili.ship.theseus.keel.player.j c;
    public com.bilibili.ship.theseus.keel.player.o<?> d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService$1, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService$1", f = "PieceHeartbeatService.kt", l = {30}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService$1$a */
        /* JADX INFO: compiled from: BL */
        public static final class a<T> implements kotlinx.coroutines.flow.e {
            public final /* synthetic */ com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService b;

            public a(com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService pieceHeartbeatService) {
                this.b = pieceHeartbeatService;
            }

            public final java.lang.Object emit(java.lang.Object obj, dy1.b bVar) {
                com.bilibili.ship.theseus.keel.player.o<?> oVar = (com.bilibili.ship.theseus.keel.player.o) obj;
                if (oVar == null) {
                    return Zx1.o.a;
                }
                com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService pieceHeartbeatService = this.b;
                pieceHeartbeatService.getClass();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("new piece avid: ");
                long j = oVar.b;
                sb.append(j);
                sb.append(", cid: ");
                long j2 = oVar.c;
                sb.append(j2);
                sb.append(" hasStickerPieces:");
                boolean z = oVar.d;
                MY0.I0.a(sb, z, "PieceHeartbeatService");
                if (z) {
                    com.bilibili.ship.theseus.keel.player.o<?> oVar2 = pieceHeartbeatService.d;
                    RI1.a aVar = pieceHeartbeatService.b;
                    if (oVar2 != null && oVar2.b != j) {
                        aVar.n7();
                    }
                    tv.danmaku.biliplayerv2.service.Video.g gVarH = pieceHeartbeatService.c.w().H();
                    if (gVarH == null) {
                        tv.danmaku.android.log.BLog.e("PieceHeartbeatService", "piece report error");
                    } else {
                        long j3 = ((RI1.d) gVarH).a;
                        ((RI1.d) gVarH).s = RI1.e.b.a;
                        if (!(oVar.g instanceof com.bilibili.ship.theseus.keel.player.c.C0330c)) {
                            com.bilibili.ship.theseus.keel.player.d dVar = oVar.f;
                            if (dVar != null) {
                                ((RI1.d) gVarH).h = dVar.a;
                                ((RI1.d) gVarH).l = java.lang.String.valueOf(dVar.b);
                                ((RI1.d) gVarH).i = dVar.c;
                                ((RI1.d) gVarH).m = java.lang.String.valueOf(dVar.d);
                                ((RI1.d) gVarH).g = dVar.e;
                                ((RI1.d) gVarH).j = java.lang.String.valueOf(dVar.f);
                            }
                            ((RI1.d) gVarH).a = j;
                            ((RI1.d) gVarH).b = j2;
                        }
                        kotlin.collections.builders.MapBuilder mapBuilder = new kotlin.collections.builders.MapBuilder();
                        mapBuilder.put("attached_avid", java.lang.String.valueOf(j3));
                        java.util.Map map = ((RI1.d) gVarH).t;
                        if (map != null) {
                            mapBuilder.putAll(map);
                        }
                        ((RI1.d) gVarH).t = mapBuilder.build();
                        aVar.i6(gVarH);
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("piece report avid: ");
                        sb2.append(j);
                        J2.J.a(j2, ", cid: ", " attachAvid:", sb2);
                        androidx.recyclerview.widget.K.c(sb2, j3, "PieceHeartbeatService");
                    }
                }
                pieceHeartbeatService.d = oVar;
                return Zx1.o.a;
            }
        }

        public AnonymousClass1(dy1.b<? super com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService.AnonymousClass1> bVar) {
            super(2, bVar);
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            return com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService.this.new AnonymousClass1(bVar);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws kotlin.KotlinNothingValueException {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.c.a(obj);
                com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService pieceHeartbeatService = com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService.this;
                kotlinx.coroutines.flow.StateFlowImpl stateFlowImpl = pieceHeartbeatService.a.a;
                com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService.AnonymousClass1.a aVar = new com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService.AnonymousClass1.a(pieceHeartbeatService);
                this.label = 1;
                if (stateFlowImpl.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.a(obj);
            }
            throw new kotlin.KotlinNothingValueException();
        }

        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, dy1.b<? super Zx1.o> bVar) {
            return create(coroutineScope, bVar).invokeSuspend(Zx1.o.a);
        }
    }

    public PieceHeartbeatService(kotlinx.coroutines.CoroutineScope coroutineScope, com.bilibili.ship.theseus.united.page.videopiece.b bVar, RI1.a aVar, com.bilibili.ship.theseus.keel.player.j jVar) {
        this.a = bVar;
        this.b = aVar;
        this.c = jVar;
        kotlinx.coroutines.g.d(coroutineScope, (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.ship.theseus.united.player.mediaplay.PieceHeartbeatService.AnonymousClass1(null), 3);
    }
}
