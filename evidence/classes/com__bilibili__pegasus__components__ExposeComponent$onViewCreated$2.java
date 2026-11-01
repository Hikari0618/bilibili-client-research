package com.bilibili.pegasus.components;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.pegasus.components.ExposeComponent$onViewCreated$2", f = "ExposeComponent.kt", l = {75}, m = "invokeSuspend", v = 1)
public final class ExposeComponent$onViewCreated$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, dy1.b<? super Zx1.o>, java.lang.Object> {
    int label;
    final /* synthetic */ com.bilibili.pegasus.components.ExposeComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.ExposeComponent$onViewCreated$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: BL */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bilibili.pegasus.components.ExposeComponent$onViewCreated$2$1", f = "ExposeComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<EE0.a, dy1.b<? super Zx1.o>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ com.bilibili.pegasus.components.ExposeComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.pegasus.components.ExposeComponent exposeComponent, dy1.b<? super com.bilibili.pegasus.components.ExposeComponent$onViewCreated$2.AnonymousClass1> bVar) {
            super(2, bVar);
            this.this$0 = exposeComponent;
        }

        public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
            com.bilibili.pegasus.components.ExposeComponent$onViewCreated$2.AnonymousClass1 anonymousClass1 = new com.bilibili.pegasus.components.ExposeComponent$onViewCreated$2.AnonymousClass1(this.this$0, bVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final java.lang.Object invoke(EE0.a aVar, dy1.b<? super Zx1.o> bVar) {
            return create(aVar, bVar).invokeSuspend(Zx1.o.a);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.a(obj);
            EE0.a aVar = (EE0.a) this.L$0;
            Wb0.d<androidx.recyclerview.widget.RecyclerView> dVar = this.this$0.l;
            if (dVar != null) {
                dVar.e(aVar != null ? aVar.p() : 0.5f);
            }
            Wb0.d<androidx.recyclerview.widget.RecyclerView> dVar2 = this.this$0.l;
            float f = 0.8f;
            if (dVar2 != null) {
                float fQ = aVar != null ? aVar.q() : 0.8f;
                androidx.compose.runtime.s1.f("setExposeStartRatio:", "[Expose]ExposeClient", fQ);
                if (fQ <= 0.0f || fQ > 1.0f) {
                    fQ = 0.8f;
                }
                dVar2.i = fQ;
            }
            Wb0.d<androidx.recyclerview.widget.RecyclerView> dVar3 = this.this$0.l;
            if (dVar3 != null) {
                float fN = aVar != null ? aVar.n() : 0.8f;
                androidx.compose.runtime.s1.f("setDismissExposeRatio:", "[Expose]ExposeClient", fN);
                if (fN > 0.0f && fN <= 1.0f) {
                    f = fN;
                }
                dVar3.j = f;
            }
            Wb0.d<androidx.recyclerview.widget.RecyclerView> dVar4 = this.this$0.l;
            if (dVar4 != null) {
                boolean zBooleanValue = ((java.lang.Boolean) Gj.k.b.getValue()).booleanValue();
                SK0.v0.b("setSupportTimeExpose:", "[Expose]ExposeClient", zBooleanValue);
                dVar4.k = zBooleanValue;
            }
            return Zx1.o.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposeComponent$onViewCreated$2(com.bilibili.pegasus.components.ExposeComponent exposeComponent, dy1.b<? super com.bilibili.pegasus.components.ExposeComponent$onViewCreated$2> bVar) {
        super(2, bVar);
        this.this$0 = exposeComponent;
    }

    public final dy1.b<Zx1.o> create(java.lang.Object obj, dy1.b<?> bVar) {
        return new com.bilibili.pegasus.components.ExposeComponent$onViewCreated$2(this.this$0, bVar);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.c.a(obj);
            com.bilibili.pegasus.vm.PegasusViewModel pegasusViewModel = (com.bilibili.pegasus.vm.PegasusViewModel) this.this$0.n.getValue();
            com.bilibili.pegasus.components.ExposeComponent$onViewCreated$2.AnonymousClass1 anonymousClass1 = new com.bilibili.pegasus.components.ExposeComponent$onViewCreated$2.AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.f.i(pegasusViewModel.u, anonymousClass1, this) == coroutineSingletons) {
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
