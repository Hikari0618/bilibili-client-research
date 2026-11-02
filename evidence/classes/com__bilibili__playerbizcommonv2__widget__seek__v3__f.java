package com.bilibili.playerbizcommonv2.widget.seek.v3;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/seek/dex/classes17.dex */
public class f extends androidx.appcompat.widget.AppCompatSeekBar {
    public static final /* synthetic */ int o = 0;
    public java.lang.Object c;
    public int d;
    public java.util.List<com.bilibili.playerbizcommonv2.widget.seek.v3.f.a> e;
    public int f;
    public final com.bilibili.playerbizcommonv2.widget.seek.v3.f.b g;
    public boolean h;
    public boolean i;
    public boolean j;
    public float k;
    public float l;
    public final float m;
    public final com.bilibili.playerbizcommonv2.widget.seek.v3.j n;

    /* JADX INFO: compiled from: BL */
    public static final class a {
        public final com.bilibili.playerbizcommonv2.widget.seek.v3.r a;
        public final float b;
        public final int c;

        public a(com.bilibili.playerbizcommonv2.widget.seek.v3.r rVar, float f, int i) {
            this.a = rVar;
            this.b = f;
            this.c = i;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.bilibili.playerbizcommonv2.widget.seek.v3.f.a)) {
                return false;
            }
            com.bilibili.playerbizcommonv2.widget.seek.v3.f.a aVar = (com.bilibili.playerbizcommonv2.widget.seek.v3.f.a) obj;
            return kotlin.jvm.internal.n.f(this.a, aVar.a) && java.lang.Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c;
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.c) + Ne.i.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AccessibleDot(dot=");
            sb.append(this.a);
            sb.append(", centerX=");
            sb.append(this.b);
            sb.append(", timeMs=");
            return C.r.b(this.c, ")", sb);
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class b extends android.view.accessibility.AccessibilityNodeProvider {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, com.bilibili.playerbizcommonv2.widget.seek.v3.f, java.lang.Object] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            boolean z = false;
            ?? r3 = com.bilibili.playerbizcommonv2.widget.seek.v3.f.this;
            if (i == -1) {
                int i2 = com.bilibili.playerbizcommonv2.widget.seek.v3.f.o;
                r3.getClass();
                android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfoObtain = android.view.accessibility.AccessibilityNodeInfo.obtain();
                r3.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                accessibilityNodeInfoObtain.setSource(r3);
                accessibilityNodeInfoObtain.setPackageName(r3.getContext().getPackageName());
                if (r3.getVisibility() == 0 && r3.isShown()) {
                    z = true;
                }
                accessibilityNodeInfoObtain.setVisibleToUser(z);
                return accessibilityNodeInfoObtain;
            }
            com.bilibili.playerbizcommonv2.widget.seek.v3.f.a aVar = (com.bilibili.playerbizcommonv2.widget.seek.v3.f.a) kotlin.collections.x.l0(i, r3.e);
            if (aVar == null) {
                return null;
            }
            int paddingLeft = (int) (r3.getPaddingLeft() + aVar.b);
            android.graphics.Rect rect = new android.graphics.Rect(paddingLeft - 24, 0, paddingLeft + 24, r3.getHeight());
            int[] iArr = new int[2];
            r3.getLocationOnScreen(iArr);
            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfoObtain2 = android.view.accessibility.AccessibilityNodeInfo.obtain();
            accessibilityNodeInfoObtain2.setSource(r3, i);
            accessibilityNodeInfoObtain2.setParent(r3);
            accessibilityNodeInfoObtain2.setPackageName(r3.getContext().getPackageName());
            accessibilityNodeInfoObtain2.setClassName("android.widget.ImageView");
            accessibilityNodeInfoObtain2.setContentDescription(r3.getContext().getString(2131899331, Oo.b.c(((long) aVar.c) + ((long) 999))));
            accessibilityNodeInfoObtain2.setClickable(true);
            accessibilityNodeInfoObtain2.setEnabled(r3.isEnabled());
            accessibilityNodeInfoObtain2.setFocusable(true);
            accessibilityNodeInfoObtain2.setVisibleToUser(r3.getVisibility() == 0 && r3.isShown());
            accessibilityNodeInfoObtain2.setAccessibilityFocused(r3.f == i);
            accessibilityNodeInfoObtain2.setBoundsInParent(rect);
            android.graphics.Rect rect2 = new android.graphics.Rect(rect);
            rect2.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoObtain2.setBoundsInScreen(rect2);
            accessibilityNodeInfoObtain2.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            accessibilityNodeInfoObtain2.addAction(accessibilityNodeInfoObtain2.isAccessibilityFocused() ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CLEAR_ACCESSIBILITY_FOCUS : android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_ACCESSIBILITY_FOCUS);
            return accessibilityNodeInfoObtain2;
        }

        /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View, com.bilibili.playerbizcommonv2.widget.seek.v3.f] */
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i2, android.os.Bundle bundle) {
            ?? r8 = com.bilibili.playerbizcommonv2.widget.seek.v3.f.this;
            com.bilibili.playerbizcommonv2.widget.seek.v3.f.a aVar = (com.bilibili.playerbizcommonv2.widget.seek.v3.f.a) kotlin.collections.x.l0(i, r8.e);
            if (aVar == null) {
                return false;
            }
            if (i2 == 16) {
                if (!r8.isEnabled()) {
                    return false;
                }
                java.lang.Boolean bool = (java.lang.Boolean) aVar.a.f.invoke(java.lang.Float.valueOf(aVar.b));
                if (bool.booleanValue()) {
                    com.bilibili.playerbizcommonv2.widget.seek.v3.f.k(r8, i, 1);
                }
                return bool.booleanValue();
            }
            if (i2 == 64) {
                int i3 = r8.f;
                if (i3 == i) {
                    return false;
                }
                r8.f = i;
                if (i3 != -1) {
                    com.bilibili.playerbizcommonv2.widget.seek.v3.f.k(r8, i3, 65536);
                }
                com.bilibili.playerbizcommonv2.widget.seek.v3.f.k(r8, i, 32768);
            } else {
                if (i2 != 128 || r8.f != i) {
                    return false;
                }
                r8.f = -1;
                com.bilibili.playerbizcommonv2.widget.seek.v3.f.k(r8, i, 65536);
            }
            return true;
        }
    }

    public f(android.content.Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(com.bilibili.playerbizcommonv2.widget.seek.v3.f fVar, int i, int i2) {
        if (fVar.isShown()) {
            android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain(i2);
            accessibilityEventObtain.setPackageName(fVar.getContext().getPackageName());
            accessibilityEventObtain.setClassName("android.widget.ImageView");
            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = fVar.g.createAccessibilityNodeInfo(i);
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfoCreateAccessibilityNodeInfo != null ? accessibilityNodeInfoCreateAccessibilityNodeInfo.getContentDescription() : null);
            accessibilityEventObtain.setEnabled(fVar.isEnabled());
            accessibilityEventObtain.setSource(fVar, i);
            android.view.ViewParent parent = fVar.getParent();
            if (parent != null) {
                parent.requestSendAccessibilityEvent(fVar, accessibilityEventObtain);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(android.graphics.Canvas canvas) {
        try {
            super/*android.view.View*/.draw(canvas);
        } catch (java.lang.Exception e) {
            tv.danmaku.android.log.BLog.e("PlayerDotSeekBar", e);
        }
    }

    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return this.g;
    }

    public final com.bilibili.playerbizcommonv2.widget.seek.v3.j getSeekbarProgressDrawable() {
        return this.n;
    }

    public final void onDraw(android.graphics.Canvas canvas) {
        com.bilibili.playerbizcommonv2.widget.seek.v3.j jVar = this.n;
        boolean z = jVar.B;
        android.graphics.Paint paint = jVar.x;
        android.graphics.Rect rect = jVar.q;
        if (z) {
            paint.setColor(jVar.f);
            canvas.drawRect(rect, paint);
        } else {
            paint.setColor(jVar.g);
            canvas.drawRect(rect, paint);
        }
        paint.setColor(jVar.h);
        canvas.drawRect(jVar.r, paint);
        super.onDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            accessibilityNodeInfo.addChild(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        } catch (java.lang.Exception unused) {
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        com.bilibili.playerbizcommonv2.widget.seek.v3.j jVar = this.n;
        jVar.k = width;
        jVar.l = height;
        jVar.m = paddingLeft;
        jVar.n = paddingTop;
        jVar.o = paddingRight;
        jVar.p = paddingBottom;
        com.bilibili.playerbizcommonv2.widget.seek.v3.j.c(jVar, this.h, false, 2);
        u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!isEnabled() || getVisibility() != 0 || motionEvent == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.i = false;
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float progress = (getProgress() / getMax()) - ((x - getPaddingLeft()) / width);
            if (java.lang.Math.abs(progress * width) > getThumbOffset()) {
                progress = 0.0f;
            }
            this.j = java.lang.Math.abs(progress) > 0.0f;
            this.k = x;
            float fMin = ((java.lang.Math.min(getProgress() + 1, getMax()) / getMax()) * width) + getPaddingLeft();
            this.l = fMin;
            motionEvent.setLocation(fMin, y);
            super/*android.view.View*/.onTouchEvent(motionEvent);
        } else if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (!this.j) {
                    motionEvent.setLocation((x - this.k) + this.l, y);
                }
                super/*android.view.View*/.onTouchEvent(motionEvent);
            } else {
                if (!this.i && java.lang.Math.abs(this.k - x) >= this.m) {
                    this.i = true;
                }
                if (!this.j) {
                    motionEvent.setLocation((x - this.k) + this.l, y);
                }
                super/*android.view.View*/.onTouchEvent(motionEvent);
            }
        } else if (this.i) {
            if (!this.j) {
                motionEvent.setLocation((x - this.k) + this.l, y);
            }
            super/*android.view.View*/.onTouchEvent(motionEvent);
        } else {
            com.bilibili.playerbizcommonv2.widget.seek.v3.j jVar = this.n;
            int i = jVar.s;
            kotlin.Pair pair = null;
            if (i > 0) {
                int i2 = jVar.k;
                int i3 = jVar.m;
                int i4 = (i2 - i3) - jVar.o;
                float f = x - i3;
                for (com.bilibili.playerbizcommonv2.widget.seek.v3.r rVar : jVar.t) {
                    if (rVar.c) {
                        int i5 = rVar.b;
                        int i6 = rVar.a;
                        float f2 = i;
                        float f3 = i4;
                        float f4 = (((i5 + i6) / 2.0f) / f2) * f3;
                        float fMax = java.lang.Math.max(24.0f, ((i5 - i6) / f2) * f3) / 2;
                        float f5 = f4 - fMax;
                        if (f <= fMax + f4 && f5 <= f) {
                            pair = new kotlin.Pair(rVar, java.lang.Float.valueOf(f4));
                            break;
                        }
                    }
                }
            }
            if (pair != null) {
                motionEvent.setLocation(this.l, y);
            }
            super/*android.view.View*/.onTouchEvent(motionEvent);
            if (pair != null) {
                ((com.bilibili.playerbizcommonv2.widget.seek.v3.r) pair.getFirst()).f.invoke(pair.getSecond());
            }
        }
        return true;
    }

    public final void setSeeking(boolean z) {
        this.h = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        if (this.d <= 0) {
            this.e = kotlin.collections.EmptyList.INSTANCE;
            this.f = -1;
        } else {
            this.e = kotlin.sequences.a.C(new ty1.z(kotlin.sequences.a.m(new kotlin.collections.w((java.lang.Iterable) this.c), new JH.i(this, 11)), new com.bilibili.playerbizcommonv2.widget.seek.v3.e(this, (getWidth() - getPaddingLeft()) - getPaddingRight())));
            sendAccessibilityEvent(2048);
        }
    }

    public f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, 2130971036);
        kotlin.collections.EmptyList emptyList = kotlin.collections.EmptyList.INSTANCE;
        this.c = emptyList;
        this.e = emptyList;
        this.f = -1;
        this.g = new com.bilibili.playerbizcommonv2.widget.seek.v3.f.b();
        com.bilibili.playerbizcommonv2.widget.seek.v3.j jVar = new com.bilibili.playerbizcommonv2.widget.seek.v3.j(getContext().getColor(2131100136), getContext().getColor(2131100139), getContext().getColor(com.bilibili.lib.theme.R.color.Pi5_u), getContext().getColor(com.bilibili.lib.theme.R.color.Ga5_u), getContext().getColor(com.bilibili.lib.theme.R.color.Wh0_u), getContext().getColor(com.bilibili.lib.theme.R.color.Pi5_u), getContext().getColor(com.bilibili.lib.theme.R.color.Ga5_u), getContext().getColor(2131100136), Sy.d.h(1.0f), Sy.d.h(1.0f));
        this.n = jVar;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NH1.a.g);
            int i2 = typedArrayObtainStyledAttributes.getInt(0, 1);
            typedArrayObtainStyledAttributes.recycle();
            jVar.w = i2;
        }
        setSplitTrack(false);
        this.m = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
