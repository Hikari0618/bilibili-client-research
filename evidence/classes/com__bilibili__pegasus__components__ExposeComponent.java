package com.bilibili.pegasus.components;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes17.dex */
public final class ExposeComponent extends com.bilibili.pegasus.AbstractC0517b {
    public Wb0.d<androidx.recyclerview.widget.RecyclerView> l;
    public final androidx.lifecycle.c0 m;
    public final androidx.lifecycle.c0 n;
    public final androidx.lifecycle.c0 o;
    public final java.lang.String p;

    /* JADX INFO: compiled from: BL */
    public static final class a implements Zb0.e {
        public final /* synthetic */ android.graphics.Rect b;
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView c;

        public a(android.graphics.Rect rect, androidx.recyclerview.widget.RecyclerView recyclerView) {
            this.b = rect;
            this.c = recyclerView;
        }

        public final android.graphics.Rect a() {
            android.content.res.Resources resources;
            com.bilibili.pegasus.components.ExposeComponent exposeComponent = com.bilibili.pegasus.components.ExposeComponent.this;
            java.lang.Integer num = (java.lang.Integer) ((com.bilibili.lib.homepage.splash.BaseMainViewModel) exposeComponent.m.getValue()).c.d();
            int iIntValue = num != null ? num.intValue() : 0;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.c;
            int width = recyclerView.getWidth();
            int height = recyclerView.getHeight();
            android.content.Context contextG = exposeComponent.g();
            int dimensionPixelSize = (height - ((contextG == null || (resources = contextG.getResources()) == null) ? 0 : resources.getDimensionPixelSize(2131166262))) - iIntValue;
            android.graphics.Rect rect = this.b;
            rect.set(0, 0, width, dimensionPixelSize);
            return rect;
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class b implements kotlin.jvm.functions.Function0<androidx.lifecycle.e0> {
        public b() {
        }

        public final java.lang.Object invoke() {
            return com.bilibili.pegasus.components.ExposeComponent.this.d().getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class c implements kotlin.jvm.functions.Function0<androidx.lifecycle.d0.c> {
        public c() {
        }

        public final java.lang.Object invoke() {
            return com.bilibili.pegasus.components.ExposeComponent.this.d().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class d implements kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.a> {
        public d() {
        }

        public final java.lang.Object invoke() {
            return com.bilibili.pegasus.components.ExposeComponent.this.d().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class e implements kotlin.jvm.functions.Function0<androidx.lifecycle.e0> {
        public e() {
        }

        public final java.lang.Object invoke() {
            return com.bilibili.pegasus.components.ExposeComponent.this.d().getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class f implements kotlin.jvm.functions.Function0<androidx.lifecycle.d0.c> {
        public f() {
        }

        public final java.lang.Object invoke() {
            return com.bilibili.pegasus.components.ExposeComponent.this.d().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class g implements kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.a> {
        public g() {
        }

        public final java.lang.Object invoke() {
            return com.bilibili.pegasus.components.ExposeComponent.this.d().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class h implements kotlin.jvm.functions.Function0<androidx.lifecycle.e0> {
        public h() {
        }

        public final java.lang.Object invoke() {
            return com.bilibili.pegasus.components.ExposeComponent.this.d().getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class i implements kotlin.jvm.functions.Function0<androidx.lifecycle.d0.c> {
        public i() {
        }

        public final java.lang.Object invoke() {
            return com.bilibili.pegasus.components.ExposeComponent.this.d().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class j implements kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.a> {
        public j() {
        }

        public final java.lang.Object invoke() {
            return com.bilibili.pegasus.components.ExposeComponent.this.d().getDefaultViewModelCreationExtras();
        }
    }

    public ExposeComponent() {
        kotlin.jvm.internal.u uVar = kotlin.jvm.internal.t.a;
        this.m = new androidx.lifecycle.c0(uVar.getOrCreateKotlinClass(com.bilibili.lib.homepage.splash.BaseMainViewModel.class), new com.bilibili.pegasus.components.ExposeComponent.b(), new com.bilibili.pegasus.components.ExposeComponent.c(), new com.bilibili.pegasus.components.ExposeComponent.d());
        this.n = new androidx.lifecycle.c0(uVar.getOrCreateKotlinClass(com.bilibili.pegasus.vm.PegasusViewModel.class), new com.bilibili.pegasus.components.ExposeComponent.e(), new com.bilibili.pegasus.components.ExposeComponent.f(), new com.bilibili.pegasus.components.ExposeComponent.g());
        this.o = new androidx.lifecycle.c0(uVar.getOrCreateKotlinClass(com.bilibili.pegasus.components.C0577i.class), new com.bilibili.pegasus.components.ExposeComponent.h(), new com.bilibili.pegasus.components.ExposeComponent.i(), new com.bilibili.pegasus.components.ExposeComponent.j());
        this.p = "PegasusExposePlugin";
    }

    @Override // com.bilibili.pegasus.AbstractC0517b
    public final java.lang.String f() {
        return this.p;
    }

    @Override // com.bilibili.pegasus.AbstractC0517b
    public final void u(android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, com.bilibili.pegasus.q qVar) {
        super.u(view, recyclerView, qVar);
        com.bilibili.pegasus.components.ExposeComponent.a aVar = new com.bilibili.pegasus.components.ExposeComponent.a(new android.graphics.Rect(), recyclerView);
        FQ.d dVar = new FQ.d(new Zb0.c(recyclerView));
        dVar.b(0.5f);
        Wb0.a aVar2 = (Wb0.a) dVar.b;
        aVar2.b = aVar;
        aVar2.e = true;
        aVar2.g = new Xb0.d();
        this.l = dVar.a();
        androidx.lifecycle.A a2 = this.f;
        if (a2 != null) {
            kotlinx.coroutines.g.d(androidx.lifecycle.LifecycleKt.a(a2.getLifecycle()), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.pegasus.components.ExposeComponent$onViewCreated$1(this, null), 3);
        }
        androidx.lifecycle.A a3 = this.f;
        if (a3 != null) {
            kotlinx.coroutines.g.d(androidx.lifecycle.LifecycleKt.a(a3.getLifecycle()), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.pegasus.components.ExposeComponent$onViewCreated$2(this, null), 3);
        }
        androidx.lifecycle.A a4 = this.f;
        if (a4 != null) {
            kotlinx.coroutines.g.d(androidx.lifecycle.LifecycleKt.a(a4.getLifecycle()), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.pegasus.components.ExposeComponent$onViewCreated$3(this, null), 3);
        }
        androidx.lifecycle.A a5 = this.f;
        if (a5 != null) {
            kotlinx.coroutines.g.d(androidx.lifecycle.LifecycleKt.a(a5.getLifecycle()), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.pegasus.components.ExposeComponent$onViewCreated$4(this, null), 3);
        }
        androidx.lifecycle.A a6 = this.f;
        if (a6 != null) {
            kotlinx.coroutines.g.d(androidx.lifecycle.LifecycleKt.a(a6.getLifecycle()), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.pegasus.components.ExposeComponent$onViewCreated$5(this, null), 3);
        }
    }

    @Override // com.bilibili.pegasus.AbstractC0517b
    public final void w(boolean z) {
        super.w(z);
        if (((java.lang.Boolean) ((com.bilibili.pegasus.components.C0577i) this.o.getValue()).c.b.getValue()).booleanValue()) {
            if (!z) {
                Wb0.d<androidx.recyclerview.widget.RecyclerView> dVar = this.l;
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            }
            Wb0.d<androidx.recyclerview.widget.RecyclerView> dVar2 = this.l;
            if (dVar2 != null) {
                dVar2.d = true;
                dVar2.f();
            }
        }
    }
}
