package com.bilibili.playerbizcommonv2.widget.seek.v3;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/seek/dex/classes17.dex */
public final class PlayerSeekWidget3 extends com.bilibili.playerbizcommonv2.widget.seek.v3.f implements tv.danmaku.biliplayerv2.widget.b {
    public static final int W = Dz1.h.g(2.0f);
    public static final int a0 = Dz1.h.g(12.0f);
    public boolean A;
    public tv.danmaku.biliplayerv2.ScreenModeType B;
    public tv.danmaku.biliplayerv2.DisplayOrientation C;
    public final boolean D;
    public boolean E;
    public boolean F;
    public android.graphics.drawable.Drawable G;
    public boolean H;
    public boolean I;
    public androidx.constraintlayout.widget.ConstraintLayout.b J;
    public final Zx1.e K;
    public final Zx1.e L;
    public tv.danmaku.biliplayerv2.service.o M;
    public final com.bilibili.playerbizcommon.widget.control.seekbar.a N;
    public tv.danmaku.biliplayerv2.service.D O;
    public tv.danmaku.biliplayerv2.service.r P;
    public tv.danmaku.biliplayerv2.service.C0 Q;
    public p063hG0.s R;
    public tv.danmaku.biliplayerv2.service.a S;
    public QI1.a T;
    public p086kH0.b U;
    public final boolean V;
    public final com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.b p;
    public final com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.d q;
    public final com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.h r;
    public final com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.c s;
    public final com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.e t;
    public tv.danmaku.biliplayerv2.f u;
    public long v;
    public final com.bilibili.playerbizcommon.widget.control.seekbar.PlayerSeekbarThumbWrapper w;
    public tv.danmaku.biliplayerv2.service.o x;
    public boolean y;
    public boolean z;

    /* JADX INFO: compiled from: BL */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle.values().length];
            try {
                iArr[com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle.PLAN_A.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle.PLAN_B.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.bilibili.playerbizcommonv2.utils.SeekExpConfig.UiStyle.ONLINE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class b implements p063hG0.r {
        public int a;
        public int b;

        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0093  */
        /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:60:0x010e  */
        /* JADX WARN: Code duplicated, block: B:77:0x0152  */
        /* JADX WARN: Code duplicated, block: B:80:0x0157  */
        /* JADX WARN: Code duplicated, block: B:82:0x015b  */
        /* JADX WARN: Code duplicated, block: B:83:0x015d  */
        /* JADX WARN: Code duplicated, block: B:85:0x0168  */
        /* JADX WARN: Code duplicated, block: B:86:0x0178  */
        /* JADX WARN: Code duplicated, block: B:88:0x017f  */
        /* JADX WARN: Code duplicated, block: B:89:0x0190  */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.ProgressBar, com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p063hG0.r
        public final void a(float f, kotlin.Pair<java.lang.Float, java.lang.Float> pair) {
            float fFloatValue;
            java.lang.Float fValueOf;
            int iMin;
            ?? r0 = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this;
            if (r0.x != null) {
                int iG1 = r0.getGestureClient().G0();
                int iF2 = r0.getGestureClient().f2();
                float f2 = iG1;
                boolean z = ((java.lang.Number) pair.getFirst()).floatValue() < 0.1f * f2 && ((java.lang.Number) pair.getSecond()).floatValue() < ((float) iF2) * 0.3f;
                if (((java.lang.Number) pair.getFirst()).floatValue() > f2 * 0.9f && ((java.lang.Number) pair.getSecond()).floatValue() < iF2 * 0.3f) {
                    z = true;
                }
                if (r0.y != z) {
                    r0.y = z;
                    r0.z = true;
                }
            }
            com.bilibili.playerbizcommon.widget.control.seekbar.a aVar = r0.N;
            if (aVar.b) {
                float duration = r0.getPlayerCoreService().getDuration();
                float fAtan = 0.0f;
                if (duration != 0.0f) {
                    com.bilibili.playerbizcommonv2.utils.SeekExpConfig.a.getClass();
                    org.json.JSONObject jSONObjectB = com.bilibili.playerbizcommonv2.utils.SeekExpConfig.b();
                    if (jSONObjectB != null) {
                        java.lang.String strOptString = jSONObjectB.optString("ratio");
                        java.lang.String string = strOptString != null ? kotlin.text.u.G0(strOptString).toString() : null;
                        if (string == null) {
                            string = "";
                        }
                        if (string.length() == 0) {
                            fFloatValue = -1.0f;
                        } else if (kotlin.text.u.P(string, "/", false)) {
                            java.util.List listT0 = kotlin.text.u.t0(string, new java.lang.String[]{"/"}, 0, 6);
                            java.lang.String str = (java.lang.String) kotlin.collections.x.l0(0, listT0);
                            java.lang.Float fQ = str != null ? kotlin.text.p.q(str) : null;
                            java.lang.String str2 = (java.lang.String) kotlin.collections.x.l0(1, listT0);
                            java.lang.Float fQ2 = str2 != null ? kotlin.text.p.q(str2) : null;
                            if (listT0.size() != 2 || fQ == null || fQ2 == null || kotlin.jvm.internal.n.d(fQ2, 0.0f)) {
                                fFloatValue = -1.0f;
                            } else {
                                fFloatValue = fQ.floatValue() / fQ2.floatValue();
                            }
                        } else {
                            java.lang.Float fQ3 = kotlin.text.p.q(string);
                            if (fQ3 != null) {
                                fFloatValue = fQ3.floatValue();
                            } else {
                                fFloatValue = -1.0f;
                            }
                        }
                        if (fFloatValue <= 0.0f) {
                            fFloatValue = -1.0f;
                        }
                    } else {
                        fFloatValue = -1.0f;
                    }
                    if (fFloatValue == -1.0f) {
                        fValueOf = null;
                    } else {
                        fValueOf = java.lang.Float.valueOf(fFloatValue);
                        if (fFloatValue <= 0.0f) {
                            fValueOf = null;
                        }
                    }
                    float f3 = ((int) duration) / 1000.0f;
                    if (fValueOf == null) {
                        if (f3 >= 0.0f) {
                            if (f3 < 60.0f) {
                                fAtan = f3;
                            } else if (f3 < 1380.0f) {
                                fAtan = 100 - ((float) java.lang.Math.pow((f3 - 1380) / 209.0f, 2));
                            } else if (f3 < 2700.0f) {
                                fAtan = 100 + ((float) java.lang.Math.pow((f3 - 1380) / 295.0f, 2));
                            } else {
                                fAtan = (177 * ((float) java.lang.Math.atan((f3 - 2700.0f) / 1000))) + 120;
                            }
                        }
                        iMin = ((int) fAtan) * 1000;
                    } else {
                        java.lang.Float f4 = fValueOf.floatValue() > 0.0f ? fValueOf : null;
                        if (f4 != null) {
                            float fFloatValue2 = f4.floatValue();
                            if (f3 <= 0.0f) {
                                iMin = 0;
                            } else {
                                iMin = (int) (java.lang.Math.min(f3 <= 60.0f ? f3 : java.lang.Math.min(com.bapis.bilibili.app.dynamic.v2.U7.a(f3, 60.0f, fFloatValue2, 60.0f), fFloatValue2 * 7200.0f), f3) * 1000);
                            }
                        } else {
                            if (f3 >= 0.0f) {
                                if (f3 < 60.0f) {
                                    fAtan = f3;
                                } else if (f3 < 1380.0f) {
                                    fAtan = 100 - ((float) java.lang.Math.pow((f3 - 1380) / 209.0f, 2));
                                } else if (f3 < 2700.0f) {
                                    fAtan = 100 + ((float) java.lang.Math.pow((f3 - 1380) / 295.0f, 2));
                                } else {
                                    fAtan = (177 * ((float) java.lang.Math.atan((f3 - 2700.0f) / 1000))) + 120;
                                }
                            }
                            iMin = ((int) fAtan) * 1000;
                        }
                    }
                    aVar.a = iMin;
                    aVar.b = false;
                }
            }
            int i = (int) ((aVar.a * f) + this.a);
            this.b = i;
            int iMin2 = java.lang.Math.min(java.lang.Math.max(i, 0), r0.getMax());
            this.b = iMin2;
            r0.setProgress(iMin2);
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.C(r0, this.b);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.ProgressBar, com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p063hG0.r
        public final void b() {
            ?? r0 = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this;
            r0.getControlContainerService().V1();
            r0.setProgress(this.b);
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.R(r0);
        }

        @Override // p063hG0.r
        public final void onCancel() {
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.R(com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.ProgressBar, com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3, com.bilibili.playerbizcommonv2.widget.seek.v3.f] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p063hG0.r
        public final void p() throws kotlin.NoWhenBranchMatchedException {
            ?? r0 = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this;
            r0.getControlContainerService().i4();
            tv.danmaku.biliplayerv2.service.D playerCoreService = r0.getPlayerCoreService();
            int duration = playerCoreService.getDuration();
            int currentPosition = playerCoreService.getCurrentPosition();
            float fU = playerCoreService.U();
            if (currentPosition >= 0 && duration > 0) {
                if (currentPosition > duration) {
                    currentPosition = duration;
                }
                r0.setMax(duration);
                if (!r0.h) {
                    r0.setProgress(currentPosition);
                }
                r0.setSecondaryProgress((int) (duration * fU));
            }
            this.a = r0.getProgress();
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.L(r0, false);
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class c implements tv.danmaku.biliplayerv2.service.r0 {
        public c() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.ProgressBar, com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3, com.bilibili.playerbizcommonv2.widget.seek.v3.f] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void G(int i, int i2) {
            ?? r0 = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this;
            float fU = r0.getPlayerCoreService().U();
            r0.setMax(i2);
            if (!r0.h) {
                r0.setProgress(i);
            }
            r0.setSecondaryProgress((int) (i2 * fU));
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class d implements tv.danmaku.biliplayerv2.service.B0 {
        public d() {
        }

        public final void onSeekGestureEnableChange(boolean z) {
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3 playerSeekWidget3 = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this;
            if (z) {
                playerSeekWidget3.getGestureClient().v3(playerSeekWidget3.p);
            } else {
                playerSeekWidget3.getGestureClient().v3(null);
            }
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class e implements tv.danmaku.biliplayerv2.service.E0 {
        public e() {
        }

        public final void b(tv.danmaku.biliplayerv2.service.Video.e eVar, tv.danmaku.biliplayerv2.service.Video.e eVar2) {
            tv.danmaku.biliplayerv2.DisplayOrientation displayOrientation;
            tv.danmaku.biliplayerv2.service.Video.e eVarD;
            boolean zF = kotlin.jvm.internal.n.f(eVar2, eVar);
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3 playerSeekWidget3 = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this;
            if (!zF) {
                playerSeekWidget3.N.b = true;
            }
            tv.danmaku.biliplayerv2.f fVar = playerSeekWidget3.u;
            if (fVar == null || (eVarD = tv.danmaku.biliplayerv2.i.a(fVar).D()) == null || (displayOrientation = eVarD.A().i) == null) {
                displayOrientation = tv.danmaku.biliplayerv2.DisplayOrientation.LANDSCAPE;
            }
            playerSeekWidget3.C = displayOrientation;
        }

        public final void c(tv.danmaku.biliplayerv2.service.Video.e eVar) {
            int i = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.W;
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this.U();
        }

        public final void e(tv.danmaku.biliplayerv2.service.Video.e eVar) {
            int i = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.W;
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this.U();
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class f implements android.widget.SeekBar.OnSeekBarChangeListener {
        public f() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3 playerSeekWidget3 = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this;
            com.bilibili.playerbizcommon.widget.control.seekbar.b bVar = playerSeekWidget3.w.c;
            if (bVar != null) {
                bVar.a(i);
            }
            if (z) {
                com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.C(playerSeekWidget3, i);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3] */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(android.widget.SeekBar seekBar) throws kotlin.NoWhenBranchMatchedException {
            ?? r3 = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this;
            android.view.ViewParent parent = r3.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.L(r3, true);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3] */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(android.widget.SeekBar seekBar) {
            ?? r3 = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this;
            android.view.ViewParent parent = r3.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.R(r3);
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class g {
        public g() {
        }

        public final void a(android.graphics.drawable.Drawable drawable) {
            if (drawable == null) {
                return;
            }
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3 playerSeekWidget3 = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this;
            playerSeekWidget3.G = drawable;
            if (playerSeekWidget3.F || !playerSeekWidget3.E) {
                playerSeekWidget3.setThumbInternal(drawable);
            }
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class h implements PI1.a {
        public h() {
        }

        public final void h() {
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this.getGestureClient().v3(null);
        }

        public final void i() {
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3 playerSeekWidget3 = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.this;
            playerSeekWidget3.getGestureClient().v3(playerSeekWidget3.p);
        }
    }

    public PlayerSeekWidget3(android.content.Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3 playerSeekWidget3, int i) {
        iI1.a aVarU;
        playerSeekWidget3.getSeekService().k(i, playerSeekWidget3.getMax());
        tv.danmaku.biliplayerv2.service.o oVar = playerSeekWidget3.x;
        if (oVar == null || !playerSeekWidget3.z) {
            return;
        }
        playerSeekWidget3.z = false;
        com.bilibili.playerbizcommonv2.widget.seek.v3.k.a aVar = new com.bilibili.playerbizcommonv2.widget.seek.v3.k.a();
        aVar.c = playerSeekWidget3.y;
        if (playerSeekWidget3.Y()) {
            aVar.b = 1;
        } else {
            aVar.b = 2;
        }
        int[] iArr = new int[2];
        tv.danmaku.biliplayerv2.f fVar = playerSeekWidget3.u;
        if (fVar != null && (aVarU = fVar.u()) != null) {
            aVarU.e(playerSeekWidget3, iArr);
        }
        int i2 = iArr[0];
        aVar.d = new android.graphics.Rect(i2, iArr[1], playerSeekWidget3.getWidth() + i2, playerSeekWidget3.getHeight() + iArr[1]);
        playerSeekWidget3.getFunctionWidgetService().F6(oVar, aVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void L(com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3 playerSeekWidget3, boolean z) throws kotlin.NoWhenBranchMatchedException {
        PH1.e eVar;
        com.bilibili.playerbizcommonv2.utils.l listenModeDelegate;
        boolean zIsShowing = playerSeekWidget3.getControlContainerService().isShowing();
        playerSeekWidget3.setSeeking(true);
        playerSeekWidget3.getSeekService().j(true);
        int progress = playerSeekWidget3.getProgress();
        com.bilibili.playerbizcommon.widget.control.seekbar.b bVar = playerSeekWidget3.w.c;
        if (bVar != null) {
            bVar.b(progress);
        }
        com.bilibili.playerbizcommonv2.widget.seek.v3.k.a aVar = new com.bilibili.playerbizcommonv2.widget.seek.v3.k.a();
        aVar.a = z;
        tv.danmaku.biliplayerv2.service.o oVar = playerSeekWidget3.x;
        if (oVar == null || oVar.e) {
            tv.danmaku.biliplayerv2.widget.c.a aVar2 = new tv.danmaku.biliplayerv2.widget.c.a(-1, -1);
            aVar2.g = 32;
            aVar2.f = 1;
            aVar2.h = -1;
            aVar2.i = -1;
            playerSeekWidget3.x = playerSeekWidget3.getFunctionWidgetService().g5(com.bilibili.playerbizcommonv2.widget.seek.v3.k.class, aVar2, aVar);
        } else {
            playerSeekWidget3.getFunctionWidgetService().t3(playerSeekWidget3.x, aVar);
        }
        tv.danmaku.biliplayerv2.service.o oVar2 = playerSeekWidget3.getSeekService().i;
        playerSeekWidget3.A = oVar2 != null ? oVar2.d : false;
        playerSeekWidget3.getSeekService().d();
        if (!z && playerSeekWidget3.B == tv.danmaku.biliplayerv2.ScreenModeType.THUMB && ((listenModeDelegate = playerSeekWidget3.getListenModeDelegate()) == null || !listenModeDelegate.a())) {
            com.bilibili.playerbizcommonv2.utils.SeekExpConfig.a.getClass();
            int i = com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.a.a[com.bilibili.playerbizcommonv2.utils.SeekExpConfig.a().ordinal()];
            int i2 = W;
            if (i == 1) {
                playerSeekWidget3.H = zIsShowing;
                playerSeekWidget3.getSeekbarProgressDrawable().A = false;
                playerSeekWidget3.getSeekbarProgressDrawable().z = java.lang.Integer.valueOf(i2);
                playerSeekWidget3.X(a0, false, zIsShowing);
            } else if (i == 2) {
                playerSeekWidget3.H = false;
                playerSeekWidget3.getSeekbarProgressDrawable().A = true;
                playerSeekWidget3.getSeekbarProgressDrawable().z = java.lang.Integer.valueOf(i2);
                playerSeekWidget3.X(0, true, false);
                playerSeekWidget3.I = true;
                playerSeekWidget3.setThumbInternal(playerSeekWidget3.getTransparentThumb());
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                playerSeekWidget3.H = true;
            }
        }
        playerSeekWidget3.getSeekbarProgressDrawable().b(true, playerSeekWidget3.H, true);
        playerSeekWidget3.z = true;
        if (!playerSeekWidget3.Y() || (eVar = playerSeekWidget3.u) == null) {
            return;
        }
        eVar.k0().n6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void R(com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3 playerSeekWidget3) {
        if (!playerSeekWidget3.h) {
            tv.danmaku.android.log.BLog.i("PlayerSeekWidget3", "cancel stopTrackingTouch cause of not seeking");
            return;
        }
        tv.danmaku.biliplayerv2.service.o oVar = playerSeekWidget3.x;
        if (oVar != null) {
            playerSeekWidget3.getFunctionWidgetService().e3(oVar);
        }
        if (playerSeekWidget3.A) {
            playerSeekWidget3.getSeekService().p();
        }
        playerSeekWidget3.getSeekService().j(false);
        com.bilibili.playerbizcommon.widget.control.seekbar.b bVar = playerSeekWidget3.w.c;
        if (bVar != null) {
            bVar.c();
        }
        com.bilibili.playerbizcommonv2.widget.seek.v3.j.c(playerSeekWidget3.getSeekbarProgressDrawable(), false, playerSeekWidget3.H, 1);
        int state = playerSeekWidget3.getPlayerCoreService().getState();
        if (!playerSeekWidget3.y && (state == 4 || state == 5 || state == 6)) {
            int currentPosition = playerSeekWidget3.getPlayerCoreService().getCurrentPosition();
            int progress = playerSeekWidget3.getProgress() - currentPosition;
            if (progress > 2000 || progress < -500) {
                playerSeekWidget3.getPlayerCoreService().seekTo(playerSeekWidget3.getProgress());
            } else {
                playerSeekWidget3.setProgress(currentPosition);
            }
        }
        playerSeekWidget3.setSeeking(false);
        playerSeekWidget3.y = false;
        playerSeekWidget3.z = false;
        playerSeekWidget3.getSeekbarProgressDrawable().z = null;
        playerSeekWidget3.getSeekbarProgressDrawable().A = false;
        androidx.constraintlayout.widget.ConstraintLayout.b bVar2 = playerSeekWidget3.J;
        if (bVar2 != null) {
            if (playerSeekWidget3.H) {
                android.view.ViewParent parent = playerSeekWidget3.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    android.transition.TransitionManager.beginDelayedTransition(viewGroup, new android.transition.ChangeBounds().setDuration(300L));
                }
            }
            playerSeekWidget3.setLayoutParams(bVar2);
            playerSeekWidget3.J = null;
        }
        if (playerSeekWidget3.I) {
            playerSeekWidget3.I = false;
            android.graphics.drawable.Drawable drawable = playerSeekWidget3.G;
            if (drawable != null) {
                playerSeekWidget3.setThumbInternal(drawable);
            }
        }
        playerSeekWidget3.H = true;
    }

    private final com.bilibili.playerbizcommonv2.widget.base.i getContainerSizeDelegate() {
        p086kH0.b delegateStoreService = getDelegateStoreService();
        return (com.bilibili.playerbizcommonv2.widget.base.i) delegateStoreService.b.get(com.bilibili.playerbizcommonv2.widget.base.i.a.a);
    }

    private final android.graphics.drawable.Drawable getInactiveThumb() {
        return (android.graphics.drawable.Drawable) this.L.getValue();
    }

    private final com.bilibili.playerbizcommonv2.utils.l getListenModeDelegate() {
        p086kH0.b delegateStoreService = getDelegateStoreService();
        return (com.bilibili.playerbizcommonv2.utils.l) delegateStoreService.b.get(com.bilibili.playerbizcommonv2.utils.l.a.a);
    }

    private final com.bilibili.playerbizcommonv2.widget.seek.v3.p getSeekWidgetDelegate() {
        p086kH0.b delegateStoreService = getDelegateStoreService();
        return (com.bilibili.playerbizcommonv2.widget.seek.v3.p) delegateStoreService.b.get(com.bilibili.playerbizcommonv2.widget.seek.v3.p.a.a);
    }

    private final android.graphics.drawable.Drawable getTransparentThumb() {
        return (android.graphics.drawable.Drawable) this.K.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.bilibili.playerbizcommonv2.utils.p getUiStyleDelegate() {
        p086kH0.b delegateStoreService = getDelegateStoreService();
        return (com.bilibili.playerbizcommonv2.utils.p) delegateStoreService.b.get(com.bilibili.playerbizcommonv2.utils.p.a.a);
    }

    private final com.bilibili.playerbizcommonv2.utils.t getWindowSizeDelegate() {
        p086kH0.b delegateStoreService = getDelegateStoreService();
        return (com.bilibili.playerbizcommonv2.utils.t) delegateStoreService.b.get(com.bilibili.playerbizcommonv2.utils.t.a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSeekBarProcessDrawable(java.util.List<tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint> list) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int duration = getPlayerCoreService().getDuration() / 1000;
        boolean z = false;
        if (list != null) {
            java.util.List<tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint> list2 = list;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint) it.next()).getType() == 2) {
                        z = true;
                        break;
                    }
                }
            }
        }
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint) obj).getType() == 10001) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.EmptyList.INSTANCE;
        }
        com.bilibili.playerbizcommonv2.utils.p uiStyleDelegate = getUiStyleDelegate();
        if (uiStyleDelegate != null && uiStyleDelegate.b() && z) {
            if (arrayList.isEmpty()) {
                return;
            }
            java.util.ArrayList arrayList3 = arrayList;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.q.C(arrayList3, 10));
            java.util.Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(T((tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint) it2.next()));
            }
            W(duration, arrayList4);
            return;
        }
        if (list != null) {
            java.util.List<tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint> list3 = list;
            arrayList2 = new java.util.ArrayList(kotlin.collections.q.C(list3, 10));
            java.util.Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(T((tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint) it3.next()));
            }
        } else {
            arrayList2 = kotlin.collections.EmptyList.INSTANCE;
        }
        W(duration, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setThumbInternal(android.graphics.drawable.Drawable drawable) {
        if (!this.I || drawable == getTransparentThumb()) {
            setThumb(drawable);
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void z(com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3 playerSeekWidget3, boolean z) {
        if (!playerSeekWidget3.E || playerSeekWidget3.F == z) {
            return;
        }
        com.bilibili.playerbizcommon.widget.control.seekbar.b bVar = playerSeekWidget3.w.c;
        if (bVar != null) {
            bVar.d(z);
        }
        if (z) {
            android.graphics.drawable.Drawable drawable = playerSeekWidget3.G;
            if (drawable != null) {
                playerSeekWidget3.setThumbInternal(drawable);
            }
            com.bilibili.playerbizcommonv2.widget.seek.v3.j seekbarProgressDrawable = playerSeekWidget3.getSeekbarProgressDrawable();
            seekbarProgressDrawable.B = true;
            seekbarProgressDrawable.a(false);
            android.animation.ValueAnimator valueAnimator = seekbarProgressDrawable.u;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new En.j(seekbarProgressDrawable, 1));
            valueAnimatorOfFloat.addListener(new com.bilibili.playerbizcommonv2.widget.seek.v3.i(seekbarProgressDrawable));
            valueAnimatorOfFloat.start();
            seekbarProgressDrawable.u = valueAnimatorOfFloat;
        } else {
            playerSeekWidget3.setThumbInternal(playerSeekWidget3.getInactiveThumb());
            com.bilibili.playerbizcommonv2.widget.seek.v3.j seekbarProgressDrawable2 = playerSeekWidget3.getSeekbarProgressDrawable();
            if (seekbarProgressDrawable2.B) {
                seekbarProgressDrawable2.B = false;
                seekbarProgressDrawable2.a(false);
            }
        }
        playerSeekWidget3.setProgressDrawable((com.bilibili.playerbizcommonv2.widget.seek.v3.q) playerSeekWidget3.getSeekbarProgressDrawable().D.getValue());
        playerSeekWidget3.F = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.bilibili.playerbizcommonv2.widget.seek.v3.r T(tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo.WatchPoint watchPoint) {
        return new com.bilibili.playerbizcommonv2.widget.seek.v3.r(watchPoint.getFrom(), watchPoint.getTo(), watchPoint.getType() == 1, watchPoint.getType() == 10001 ? java.lang.Integer.valueOf(getContext().getColor(com.bilibili.lib.theme.R.color.Ye5_u)) : null, watchPoint.getType() == 10001 ? java.lang.Float.valueOf(Dz1.h.g(2.0f)) : null, new AW0.c(4, this, watchPoint));
    }

    public final void U() {
        com.bilibili.playerbizcommon.widget.control.seekbar.e eVar;
        tv.danmaku.android.log.BLog.i("PlayerSeekWidget3", "loadIcon");
        tv.danmaku.biliplayerv2.f fVar = this.u;
        tv.danmaku.biliplayerv2.service.Video.e eVarD = fVar != null ? tv.danmaku.biliplayerv2.i.a(fVar).D() : null;
        if (eVarD != null) {
            tv.danmaku.biliplayerv2.service.Video.b bVarA = eVarD.A();
            long j = bVarA.g;
            this.v = j;
            eVar = new com.bilibili.playerbizcommon.widget.control.seekbar.e(j, bVarA.j, bVarA.k, bVarA.l, bVarA.m, bVarA.n);
        } else {
            eVar = new com.bilibili.playerbizcommon.widget.control.seekbar.e(-1L, null, null, null, null, null);
        }
        this.w.a(eVar);
    }

    public final void W(int i, java.util.List list) {
        com.bilibili.playerbizcommonv2.widget.seek.v3.j seekbarProgressDrawable = getSeekbarProgressDrawable();
        seekbarProgressDrawable.s = i;
        java.util.ArrayList<com.bilibili.playerbizcommonv2.widget.seek.v3.r> arrayList = seekbarProgressDrawable.t;
        arrayList.clear();
        arrayList.addAll(list);
        for (com.bilibili.playerbizcommonv2.widget.seek.v3.g gVar : seekbarProgressDrawable.C) {
            if (gVar != null) {
                java.util.ArrayList<com.bilibili.playerbizcommonv2.widget.seek.v3.r> arrayList2 = gVar.d;
                arrayList2.clear();
                if (list != null) {
                    arrayList2.addAll(list);
                }
                gVar.e = i;
                gVar.invalidateSelf();
            }
        }
        this.c = list;
        this.d = i;
        u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X(int i, boolean z, boolean z2) {
        androidx.constraintlayout.widget.ConstraintLayout.b layoutParams = getLayoutParams();
        androidx.constraintlayout.widget.ConstraintLayout.b bVar = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.b ? layoutParams : null;
        if (bVar == null) {
            tv.danmaku.android.log.BLog.w("PlayerSeekWidget3", "seek ui style: parent is not ConstraintLayout, skip stretch");
            return;
        }
        if (this.J == null) {
            this.J = new androidx.constraintlayout.widget.ConstraintLayout.b(bVar);
        }
        if (z2) {
            android.view.ViewParent parent = getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                android.transition.TransitionManager.beginDelayedTransition(viewGroup, new android.transition.ChangeBounds().setDuration(300L));
            }
        }
        bVar.e = 0;
        bVar.h = 0;
        bVar.f = -1;
        bVar.g = -1;
        ((android.view.ViewGroup.MarginLayoutParams) bVar).leftMargin = i;
        ((android.view.ViewGroup.MarginLayoutParams) bVar).rightMargin = i;
        if (z) {
            bVar.l = 0;
            bVar.i = -1;
            bVar.j = -1;
            bVar.k = -1;
            ((android.view.ViewGroup.MarginLayoutParams) bVar).bottomMargin = 0;
        }
        setLayoutParams(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a A[RETURN] */
    public final boolean Y() {
        PH1.e eVar;
        com.bilibili.lib.tf.TfTypeExt typeExt;
        com.bilibili.playerbizcommonv2.widget.base.i containerSizeDelegate;
        int iA;
        k4.a aVar;
        if (this.B == tv.danmaku.biliplayerv2.ScreenModeType.THUMB && !this.D) {
            int availableWidth = getFunctionWidgetService().getAvailableWidth();
            int availableHeight = getFunctionWidgetService().getAvailableHeight();
            if (availableWidth > 0 && availableHeight > 0) {
                if (this.C == tv.danmaku.biliplayerv2.DisplayOrientation.LANDSCAPE) {
                    containerSizeDelegate = getContainerSizeDelegate();
                    if (containerSizeDelegate != null) {
                        iA = containerSizeDelegate.a();
                    } else {
                        iA = 0;
                    }
                    if (iA > 0) {
                        if (iA > availableHeight) {
                            return false;
                        }
                    } else if (availableHeight / availableWidth < 0.5525f) {
                        return false;
                    }
                } else {
                    com.bilibili.playerbizcommonv2.utils.t windowSizeDelegate = getWindowSizeDelegate();
                    if (windowSizeDelegate != null) {
                        Zx1.e eVar2 = com.bilibili.playerbizcommonv2.utils.s.a;
                        kotlinx.coroutines.flow.A aX = windowSizeDelegate.x();
                        if (aX != null && (aVar = (k4.a) aX.b.getValue()) != null && pw1.c.f(aVar)) {
                            containerSizeDelegate = getContainerSizeDelegate();
                            if (containerSizeDelegate != null) {
                                iA = containerSizeDelegate.a();
                            } else {
                                iA = 0;
                            }
                            if (iA > 0) {
                                if (iA > availableHeight) {
                                    return false;
                                }
                            } else if (availableHeight / availableWidth < 0.5525f) {
                                return false;
                            }
                        }
                    }
                    if (availableHeight / availableWidth < 1.0f) {
                        return false;
                    }
                }
            }
        }
        Mo.c cVarB = Mo.c.b();
        cVarB.a();
        int i = cVarB.c;
        return ((i == 2 && ((typeExt = com.bilibili.fd_service.FreeDataManager.c.a.m().getTypeExt()) == com.bilibili.lib.tf.TfTypeExt.U_CARD || typeExt == com.bilibili.lib.tf.TfTypeExt.T_CARD || typeExt == com.bilibili.lib.tf.TfTypeExt.C_CARD)) || i == 1) && (eVar = this.u) != null && eVar.k0().t1();
    }

    public final void bindPlayerContainer(tv.danmaku.biliplayerv2.f fVar) {
        this.u = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.bilibili.playerbizcommonv2.widget.seek.v3.p seekWidgetDelegate;
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && this.U != null && (seekWidgetDelegate = getSeekWidgetDelegate()) != null) {
            seekWidgetDelegate.b();
        }
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    public final tv.danmaku.biliplayerv2.service.r getControlContainerService() {
        tv.danmaku.biliplayerv2.service.r rVar = this.P;
        if (rVar != null) {
            return rVar;
        }
        kotlin.jvm.internal.n.m("controlContainerService");
        throw null;
    }

    public final p086kH0.b getDelegateStoreService() {
        p086kH0.b bVar = this.U;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.n.m("delegateStoreService");
        throw null;
    }

    public final tv.danmaku.biliplayerv2.service.a getFunctionWidgetService() {
        tv.danmaku.biliplayerv2.service.a aVar = this.S;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.n.m("functionWidgetService");
        throw null;
    }

    public final p063hG0.s getGestureClient() {
        p063hG0.s sVar = this.R;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.n.m("gestureClient");
        throw null;
    }

    public boolean getMembersInjector() {
        return this.V;
    }

    public final tv.danmaku.biliplayerv2.service.D getPlayerCoreService() {
        tv.danmaku.biliplayerv2.service.D d2 = this.O;
        if (d2 != null) {
            return d2;
        }
        kotlin.jvm.internal.n.m("playerCoreService");
        throw null;
    }

    public final QI1.a getReporterService() {
        QI1.a aVar = this.T;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.n.m("reporterService");
        throw null;
    }

    public final tv.danmaku.biliplayerv2.service.C0 getSeekService() {
        tv.danmaku.biliplayerv2.service.C0 c0 = this.Q;
        if (c0 != null) {
            return c0;
        }
        kotlin.jvm.internal.n.m("seekService");
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(dy1.b<? super Zx1.o> bVar) throws kotlin.KotlinNothingValueException {
        com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$1 playerSeekWidget3$bindToView$1;
        if (bVar instanceof com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$1) {
            playerSeekWidget3$bindToView$1 = (com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$1) bVar;
            int i = playerSeekWidget3$bindToView$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                playerSeekWidget3$bindToView$1.label = i - Integer.MIN_VALUE;
            } else {
                playerSeekWidget3$bindToView$1 = new com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$1(this, bVar);
            }
        } else {
            playerSeekWidget3$bindToView$1 = new com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$1(this, bVar);
        }
        java.lang.Object obj = playerSeekWidget3$bindToView$1.result;
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playerSeekWidget3$bindToView$1.label;
        if (i2 == 0) {
            kotlin.c.a(obj);
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$2 playerSeekWidget3$bindToView$2 = new com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$2(this, null);
            playerSeekWidget3$bindToView$1.label = 1;
            if (kotlinx.coroutines.F.d(playerSeekWidget3$bindToView$2, playerSeekWidget3$bindToView$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.a(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        com.bilibili.playerbizcommon.widget.control.seekbar.b bVar = this.w.c;
        if (bVar != null) {
            bVar.e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        com.bilibili.playerbizcommon.widget.control.seekbar.b bVar;
        com.bilibili.playerbizcommon.widget.control.seekbar.PlayerSeekbarThumbWrapper playerSeekbarThumbWrapper = this.w;
        com.bilibili.playerbizcommon.widget.control.seekbar.b bVar2 = playerSeekbarThumbWrapper.c;
        if ((bVar2 != null ? bVar2.i() : false) && (bVar = playerSeekbarThumbWrapper.c) != null) {
            bVar.f();
        }
        super/*android.view.View*/.onDetachedFromWindow();
    }

    @Override // com.bilibili.playerbizcommonv2.widget.seek.v3.f
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(java.util.Collections.singletonList(new android.graphics.Rect(0, 0, i, i2)));
        }
        this.z = true;
    }

    public final void setControlContainerService(tv.danmaku.biliplayerv2.service.r rVar) {
        this.P = rVar;
    }

    public final void setDelegateStoreService(p086kH0.b bVar) {
        this.U = bVar;
    }

    public final void setFunctionWidgetService(tv.danmaku.biliplayerv2.service.a aVar) {
        this.S = aVar;
    }

    public final void setGestureClient(p063hG0.s sVar) {
        this.R = sVar;
    }

    public final void setPlayerCoreService(tv.danmaku.biliplayerv2.service.D d2) {
        this.O = d2;
    }

    public final void setReporterService(QI1.a aVar) {
        this.T = aVar;
    }

    public final void setSeekService(tv.danmaku.biliplayerv2.service.C0 c0) {
        this.Q = c0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerSeekWidget3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.g gVar = new com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.g();
        this.p = new com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.b();
        com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.f fVar = new com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.f();
        this.q = new com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.d();
        this.r = new com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.h();
        this.s = new com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.c();
        this.t = new com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.e();
        this.w = new com.bilibili.playerbizcommon.widget.control.seekbar.PlayerSeekbarThumbWrapper(gVar);
        this.B = tv.danmaku.biliplayerv2.ScreenModeType.THUMB;
        this.C = tv.danmaku.biliplayerv2.DisplayOrientation.LANDSCAPE;
        this.D = Lo.j.k() != null ? Ig.k.g("MOBI_APP", "android_hd") : false;
        this.E = true;
        this.F = true;
        this.H = true;
        this.K = kotlin.b.c(new Gj.n(17));
        this.L = kotlin.b.c(new A40.o(this, 24));
        com.bilibili.playerbizcommon.widget.control.seekbar.a aVar = new com.bilibili.playerbizcommon.widget.control.seekbar.a();
        aVar.b = true;
        this.N = aVar;
        this.V = true;
        setThumb(new android.graphics.drawable.ColorDrawable(0));
        U();
        setOnSeekBarChangeListener(fVar);
        setAccessibilityDelegate(new com.bilibili.playerbizcommonv2.widget.seek.v3.n(this));
    }
}
