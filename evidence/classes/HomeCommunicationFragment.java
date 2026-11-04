package com.bilibili.bplus.im.communication;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/badge2/dex/classes13.dex */
public class HomeCommunicationFragment extends com.bilibili.bplus.im.communication.BaseConversationListFragment {
    public static final /* synthetic */ int m0 = 0;
    public androidx.recyclerview.widget.RecyclerView U;
    public com.bilibili.bplus.im.communication.widget.HomeLoadingView V;
    public android.view.View W;
    public android.view.View X;
    public android.view.View Y;
    public android.view.ViewStub Z;
    public androidx.media3.exoplayer.analytics.h a0;
    public com.bilibili.bplus.im.communication.M0 b0;
    public boolean c0 = true;
    public boolean d0 = true;

    @androidx.annotation.Nullable
    public com.bilibili.bplus.im.communication.C0710s0 e0 = null;
    public final com.bilibili.bplus.im.communication.L0 f0 = new com.bilibili.bplus.im.communication.L0(new Bn0.g(this, 9), new com.bilibili.bplus.im.communication.C0699m0(this));
    public final androidx.recyclerview.widget.ConcatAdapter g0 = new androidx.recyclerview.widget.ConcatAdapter(new androidx.recyclerview.widget.RecyclerView.Adapter[0]);
    public final com.bilibili.bplus.im.communication.HomeCommunicationFragment.a h0 = new com.bilibili.bplus.im.communication.HomeCommunicationFragment.a();
    public final com.bilibili.bplus.im.communication.HomeCommunicationFragment.f i0 = new com.bilibili.bplus.im.communication.HomeCommunicationFragment.f();
    public boolean j0 = false;
    public boolean k0 = false;
    public boolean l0 = false;

    /* JADX INFO: compiled from: BL */
    public class a implements Mo.c.d {
        public a() {
        }

        public final void onChanged(int i) {
            boolean zG = Mo.c.b().g();
            com.bilibili.bplus.im.communication.HomeCommunicationFragment homeCommunicationFragment = com.bilibili.bplus.im.communication.HomeCommunicationFragment.this;
            if (zG) {
                com.bilibili.bplus.im.communication.L0 l0 = homeCommunicationFragment.f0;
                l0.h = false;
                l0.notifyItemChanged(0);
            } else {
                com.bilibili.bplus.im.communication.L0 l1 = homeCommunicationFragment.f0;
                l1.h = true;
                l1.notifyItemChanged(0);
            }
        }
    }

    /* JADX INFO: compiled from: BL */
    public class f implements com.bilibili.bplus.im.service.m.c {
        public f() {
        }

        @Override // com.bilibili.bplus.im.service.m.c
        public final void a(com.bilibili.bplus.im.protobuf.Msg msg) {
            if (msg.msg_type.intValue() == com.bilibili.bplus.im.protobuf.MsgType.EN_MSG_TYPE_NOTIFY_ANTI_DISTURB.getValue()) {
                com.bilibili.bplus.im.communication.HomeCommunicationFragment homeCommunicationFragment = com.bilibili.bplus.im.communication.HomeCommunicationFragment.this;
                homeCommunicationFragment.Xl();
                com.bilibili.bplus.im.communication.HomeCommunicationFragment.em(homeCommunicationFragment);
            }
        }

        @Override // com.bilibili.bplus.im.service.m.c
        public final void b(com.bapis.bilibili.broadcast.message.im.Msg msg) {
            if (msg.getMsgType() == com.bilibili.bplus.im.protobuf.MsgType.EN_MSG_TYPE_NOTIFY_ANTI_DISTURB.getValue()) {
                com.bilibili.bplus.im.communication.HomeCommunicationFragment homeCommunicationFragment = com.bilibili.bplus.im.communication.HomeCommunicationFragment.this;
                homeCommunicationFragment.Xl();
                com.bilibili.bplus.im.communication.HomeCommunicationFragment.em(homeCommunicationFragment);
            }
        }
    }

    /* JADX INFO: compiled from: BL */
    public static class g {
        public java.lang.ref.WeakReference<com.bilibili.bplus.im.communication.HomeCommunicationFragment> a;
    }

    public static void em(com.bilibili.bplus.im.communication.HomeCommunicationFragment homeCommunicationFragment) {
        if (homeCommunicationFragment.j0) {
            homeCommunicationFragment.l0 = true;
            return;
        }
        homeCommunicationFragment.l0 = false;
        homeCommunicationFragment.k0 = true;
        if (homeCommunicationFragment.Y == null) {
            homeCommunicationFragment.Y = homeCommunicationFragment.Z.inflate();
        }
        homeCommunicationFragment.Y.findViewById(2131298828).setVisibility(8);
        homeCommunicationFragment.Y.findViewById(2131298815).setVisibility(0);
        com.airbnb.lottie.LottieAnimationView lottieAnimationViewFindViewById = homeCommunicationFragment.Y.findViewById(2131305622);
        lottieAnimationViewFindViewById.W(new com.bilibili.bplus.im.communication.C0708r0(homeCommunicationFragment));
        lottieAnimationViewFindViewById.n0();
    }

    @Override // com.bilibili.bplus.im.communication.BaseConversationListFragment
    public final java.util.HashMap<java.lang.String, java.lang.String> Ol(com.bilibili.bplus.im.entity.Conversation conversation) {
        java.util.HashMap<java.lang.String, java.lang.String> mapOl = super.Ol(conversation);
        mapOl.put("tab_name", Ul());
        return mapOl;
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void OnKickOut(p095q70.m mVar) {
        fm();
    }

    @Override // com.bilibili.bplus.im.communication.BaseConversationListFragment
    public final androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.C> Tl() {
        com.bilibili.bplus.im.communication.L0 l0 = this.f0;
        androidx.recyclerview.widget.ConcatAdapter concatAdapter = this.g0;
        concatAdapter.f0(l0);
        concatAdapter.f0(this.K);
        return concatAdapter;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.bilibili.bplus.im.communication.BaseConversationListFragment
    public final java.lang.String Ul() {
        if (this.e0 == null) {
            return "";
        }
        for (com.bilibili.bplus.im.setting.q qVar : ((com.bilibili.bplus.im.setting.n) com.bilibili.bplus.im.setting.QuickLinkDataStore.e.b.getValue()).d) {
            if (qVar.a == this.e0.b.getValue()) {
                if (qVar != null) {
                    return qVar.b;
                }
                return "";
            }
        }
        qVar = null;
        if (qVar != null) {
            return qVar.b;
        }
        return "";
    }

    @Override // com.bilibili.bplus.im.communication.BaseConversationListFragment
    public final void Vl() {
        if (this.k0) {
            return;
        }
        this.j0 = true;
        if (this.Y == null) {
            this.Y = this.Z.inflate();
        }
        this.Y.findViewById(2131298828).setVisibility(0);
        this.Y.findViewById(2131298815).setVisibility(8);
        this.Y.post(new TW0.i(this, 5));
    }

    @Override // com.bilibili.bplus.im.communication.BaseConversationListFragment
    public final void bm(boolean z) {
        if (!z) {
            this.W.setVisibility(8);
        } else {
            this.W.setVisibility(0);
            this.V.setState(com.bilibili.bplus.im.communication.widget.State.Empty);
        }
    }

    public final void fm() {
        this.K.h = 0;
        p078n70.b.d().getClass();
        this.f0.i = true;
        this.K.l0();
        bm(false);
    }

    public final void gm() {
        com.bilibili.lib.accounts.x.c(getActivity()).getClass();
        if (com.bilibili.lib.accounts.x.g()) {
            com.bilibili.lib.accounts.x.c(getApplicationContext()).getClass();
            long jK = com.bilibili.lib.accounts.x.k();
            com.bilibili.bplus.im.pblink.g.a("im-moss", new Iv1.f(com.bapis.bilibili.polymer.community.govern.v1.LoadAntiHarassmentSettingsReq.newBuilder().setBizType(com.bapis.bilibili.polymer.community.govern.v1.BizType.Im).setRecvMid(jK).setSendMid(jK).build(), 10)).n(Pi1.a.b()).a(new com.bilibili.bplus.im.communication.HomeCommunicationFragment.b());
        }
    }

    public final void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        com.bilibili.bplus.im.business.client.manager.C0664p c0664pB = com.bilibili.bplus.im.business.client.manager.C0664p.b();
        c0664pB.getClass();
        ((p078n70.b) ((Nz0.f) c0664pB).b).a(new com.bilibili.bplus.im.business.client.manager.RunnableC0665q(c0664pB));
        fm();
        tv.danmaku.android.log.BLog.i("im-home", ">>>>>>>>>>>>>>>>>>>>>>HomeCommunicationFragment onActivityCreated<<<<<<<<<<<<<<<<<<<<<<");
    }

    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super/*androidx.fragment.app.Fragment*/.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 2001) {
            gm();
        }
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onClickAddMore(com.bilibili.bplus.im.communication.J0 j0) {
        android.view.View viewFindViewById;
        if (getActivity() == null || activityDie() || (viewFindViewById = getActivity().getWindow().getDecorView().findViewById(2131306107)) == null) {
            return;
        }
        if (!Cy1.z.i(getApplicationContext())) {
            Cy1.z.l(2001, this);
            return;
        }
        p078n70.b.d().getClass();
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper((android.content.Context) getActivity(), 2131952780);
        androidx.appcompat.widget.U u = new androidx.appcompat.widget.U(contextThemeWrapper, viewFindViewById);
        p.g gVar = new p.g(contextThemeWrapper);
        androidx.appcompat.view.menu.i iVar = u.a;
        gVar.inflate(2131689484, iVar);
        android.graphics.drawable.Drawable drawableA = m.a.a(getActivity(), 2131235812);
        if (drawableA != null) {
            android.graphics.drawable.Drawable drawableMutate = drawableA.mutate();
            float f2 = 24;
            drawableMutate.setBounds(0, 0, (int) SK0.E0.a(f2, 1), (int) SK0.E0.a(f2, 1));
            drawableMutate.setTint(getActivity().getColor(com.bilibili.lib.theme.R.color.Graph_medium));
            drawableMutate.setTintMode(android.graphics.PorterDuff.Mode.SRC_ATOP);
            iVar.findItem(2131299208).setIcon(drawableMutate);
        }
        androidx.appcompat.view.menu.n nVar = new androidx.appcompat.view.menu.n(2130970702, contextThemeWrapper, viewFindViewById, iVar, false);
        nVar.setForceShowIcon(true);
        u.d = new com.bilibili.bplus.im.communication.C0701n0(this, u, nVar, viewFindViewById);
        if (p078n70.b.d().f().getBoolean("KEY_CLICKED_GROUP_NOTICE", false)) {
            iVar.findItem(2131302347).setIcon(2131235765);
        } else {
            iVar.findItem(2131302347).setIcon(2131235764);
        }
        if (com.bilibili.bplus.im.business.client.manager.d0.f().d.isAutoReplyAvailable() && !android.text.TextUtils.isEmpty(com.bilibili.bplus.im.business.client.manager.d0.f().d.autoReplyHtml)) {
            iVar.findItem(2131297005).setVisible(true);
            p083o70.a.p(null, "im.notify-message.top-entry-list.entry.show", "autoreply");
        }
        if (j0.a) {
            iVar.findItem(2131314413).setVisible(true);
            p083o70.a.p(null, "im.notify-message.top-entry-list.entry.show", "up-helper");
        }
        if (this.M) {
            iVar.findItem(2131296755).setVisible(true);
            p083o70.a.p(null, "im.notify-message.top-entry-list.entry.show", "live-helper");
        }
        if (!android.text.TextUtils.isEmpty(com.bilibili.bplus.im.business.client.manager.d0.f().d.contributeEnter)) {
            android.view.MenuItem visible = iVar.findItem(2131299334).setVisible(true);
            if (p078n70.b.d().f().getBoolean("KEY_CLICKED_CONTRIBUTE_ENTER_NOTICE", true)) {
                visible.setIcon(2131235308);
            } else {
                visible.setIcon(2131235307);
            }
            p083o70.a.p(null, "im.notify-message.top-entry-list.entry.show", "contribute");
        }
        p083o70.a.p(null, "im.notify-message.top-entry-list.entry.show", "msgSetting");
        p083o70.a.p(null, "im.notify-message.top-entry-list.entry.show", "endan");
        p083o70.a.p(null, "im.notify-message.top-entry-list.entry.show", "onebuttonread");
        if (nVar.b()) {
            return;
        }
        if (nVar.e == null) {
            throw new java.lang.IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        nVar.d(0, 0, false, false);
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onClickClear(com.bilibili.bplus.im.communication.C0700n c0700n) {
        if (getActivity() == null || getActivity().isFinishing()) {
            return;
        }
        tv.danmaku.bili.widget.dialog.BiliCommonDialog.Builder builder = new tv.danmaku.bili.widget.dialog.BiliCommonDialog.Builder(getActivity());
        builder.d = 1;
        builder.k(2131892770);
        builder.i = getActivity().getString(2131892861);
        builder.c = false;
        tv.danmaku.bili.widget.dialog.BiliCommonDialog.Builder.h(builder, 2131892974, new com.bilibili.bplus.im.communication.HomeCommunicationFragment.e(), true, 8);
        tv.danmaku.bili.widget.dialog.BiliCommonDialog.Builder.e(builder, 2131892909, new com.bilibili.bplus.im.communication.HomeCommunicationFragment.d(), true, 8);
        builder.a().show(getChildFragmentManager(), "akeyread");
    }

    public final void onCreate(@androidx.annotation.Nullable android.os.Bundle bundle) {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onCreate(bundle);
        v2.d dVar = new v2.d(getViewModelStore(), androidx.lifecycle.g0.b(this), androidx.lifecycle.g0.a(this));
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.t.a.getOrCreateKotlinClass(com.bilibili.bplus.im.communication.C0710s0.class);
        java.lang.String strC = D80.t.c(orCreateKotlinClass);
        if (strC == null) {
            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.e0 = (com.bilibili.bplus.im.communication.C0710s0) dVar.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), orCreateKotlinClass);
        if (bundle != null) {
            androidx.fragment.app.DialogFragment dialogFragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("akeyread");
            if (dialogFragmentFindFragmentByTag instanceof androidx.fragment.app.DialogFragment) {
                tv.danmaku.android.log.BLog.w("im-home", "Closing previous akeyread dialog on page restoring");
                dialogFragmentFindFragmentByTag.dismissAllowingStateLoss();
            }
        }
    }

    @androidx.annotation.Nullable
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, @androidx.annotation.Nullable android.os.Bundle bundle) throws java.lang.Throwable {
        android.view.View viewInflate = layoutInflater.inflate(2131497822, viewGroup, false);
        this.U = viewInflate.findViewById(2131309145);
        this.V = (com.bilibili.bplus.im.communication.widget.HomeLoadingView) viewInflate.findViewById(2131305555);
        this.W = viewInflate.findViewById(2131314802);
        this.X = viewInflate.findViewById(2131303036);
        this.Z = (android.view.ViewStub) viewInflate.findViewById(2131315011);
        Wl(1, 0L, this.U);
        com.bilibili.bplus.im.service.m.b().e.add(this.i0);
        boolean z = !Mo.c.b().g();
        com.bilibili.bplus.im.communication.L0 l0 = this.f0;
        l0.h = z;
        l0.notifyItemChanged(0);
        Mo.c.b().k(this.h0);
        if (!com.bilibili.bplus.im.business.client.manager.d0.f().d.isNewUpHelperLogic()) {
            p072m70.d dVar = m70.d.b.a;
            com.bilibili.bplus.im.communication.HomeCommunicationFragment.g gVar = new com.bilibili.bplus.im.communication.HomeCommunicationFragment.g();
            gVar.a = new java.lang.ref.WeakReference<>(this);
            dVar.b = gVar;
        }
        this.b0 = new com.bilibili.bplus.im.communication.M0((android.view.ViewStub) viewInflate.findViewById(2131315017));
        java.lang.String str = com.bilibili.bplus.im.business.client.manager.d0.f().d.autoReplyHtml;
        if (this.b0 != null && ub0.t.b(str)) {
            com.bilibili.bplus.im.communication.M0 m1 = this.b0;
            android.view.View view = m1.b;
            if ((view != null ? view.getVisibility() : 8) != 0) {
                m1.e = str;
                com.bilibili.bplus.im.communication.P0 p0 = new com.bilibili.bplus.im.communication.P0(m1);
                vB0.a<com.bilibili.okretro.GeneralResponse<com.bilibili.bplus.im.entity.AutoReplyConfig>> autoReplyToastConfig = com.bilibili.bplus.im.api.c.b().getAutoReplyToastConfig();
                com.bilibili.bplus.im.api.c.d(autoReplyToastConfig);
                autoReplyToastConfig.f(p0);
            }
        }
        p078n70.b.d().getClass();
        gm();
        this.U.setChildDrawingOrderCallback(new J5.D(5));
        return viewInflate;
    }

    public final void onDestroy() {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onDestroy();
        this.e0 = null;
    }

    @Override // com.bilibili.bplus.im.communication.BaseConversationListFragment
    public final void onDestroyView() {
        Mo.c.b().m(this.h0);
        com.bilibili.bplus.im.service.m mVarB = com.bilibili.bplus.im.service.m.b();
        mVarB.e.remove(this.i0);
        super.onDestroyView();
    }

    @Override // com.bilibili.bplus.im.communication.BaseConversationListFragment
    public final void onResume() {
        super.onResume();
        com.bilibili.bplus.im.communication.C0703o0 c0703o0 = new com.bilibili.bplus.im.communication.C0703o0(this);
        com.bilibili.bplus.im.communication.L0 l0 = this.f0;
        l0.j = c0703o0;
        l0.notifyItemChanged(0);
        if (!getUserVisibleHint() || isHidden()) {
            return;
        }
        com.bilibili.lib.accounts.x.c(getActivity()).getClass();
        if (!com.bilibili.lib.accounts.x.g()) {
            HL.g.g(com.bilibili.bplus.im.entity.IMShowTraceConfig.IM_UNLOGGED);
            this.U.setVisibility(8);
            this.W.setVisibility(0);
            this.V.setOnRetry(new GX.g(this, 7));
            this.V.setState(com.bilibili.bplus.im.communication.widget.State.NotLogin);
            return;
        }
        if (this.K != null) {
            l0.g = false;
        }
        this.U.setVisibility(0);
        com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore unreadCountDataStore = com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.a;
        com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.e();
        com.bilibili.bplus.im.notice.e eVar = new com.bilibili.bplus.im.notice.e(20, 1);
        eVar.g = new Bn.j(this, 3);
        eVar.b();
        if (com.bilibili.bplus.im.business.client.manager.d0.f().d.isNewUpHelperLogic()) {
            return;
        }
        m70.d.b.a.c(false);
    }

    @Override // com.bilibili.bplus.im.communication.BaseConversationListFragment
    public final void onSocketLogin(p095q70.q qVar) {
        super.onSocketLogin(qVar);
        com.bilibili.bplus.im.notice.e eVar = new com.bilibili.bplus.im.notice.e(20, 1);
        eVar.g = new Bn.j(this, 3);
        eVar.b();
        com.bilibili.bplus.im.setting.QuickLinkDataStore quickLinkDataStore = com.bilibili.bplus.im.setting.QuickLinkDataStore.a;
        com.bilibili.bplus.im.setting.QuickLinkDataStore.e();
        this.f0.i = true;
        this.K.l0();
    }

    public final void onStart() {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onStart();
        if (this.c0 && !this.d0) {
            tv.danmaku.android.log.BLog.i("im-home", "onStart: isAppForeground && !isFirstStart");
            com.bilibili.moduleservice.main.k kVar = (com.bilibili.moduleservice.main.k) B9.e.d(ki0.a.a, com.bilibili.moduleservice.main.k.class, "default");
            if (kVar != null) {
                kVar.G(getActivity(), "17");
            }
        }
        this.d0 = false;
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onUpAssistantUpdate(p095q70.r rVar) {
        if (com.bilibili.bplus.im.business.client.manager.d0.f().d.isNewUpHelperLogic()) {
            return;
        }
        com.bilibili.bplus.im.entity.Conversation conversationCreateUpAssistantConversation = com.bilibili.bplus.im.entity.Conversation.createUpAssistantConversation(rVar.a);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(conversationCreateUpAssistantConversation);
        Zl(linkedList);
    }

    @Override // com.bilibili.bplus.im.communication.BaseConversationListFragment
    public final void onViewCreated(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        kotlinx.coroutines.g.d(androidx.lifecycle.LifecycleKt.a(getLifecycle()), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.communication.CommunicationExtensionsKt$onAppForegroundChanged$1(new HI0.E(this, 8), null), 3);
        view.addOnLayoutChangeListener(new androidx.core.view.f0(new Rh.c(4)));
        com.bilibili.bplus.im.setting.QuickLinkDataStore quickLinkDataStore = com.bilibili.bplus.im.setting.QuickLinkDataStore.a;
        com.bilibili.bplus.im.setting.QuickLinkDataStore.e();
        com.bilibili.bplus.im.setting.o.b(this, new T60.a(this, 6));
        com.bilibili.bplus.im.communication.C0710s0 c0710s0 = this.e0;
        if (c0710s0 != null) {
            G10.A a2 = new G10.A(this, 3);
            kotlinx.coroutines.g.d(androidx.lifecycle.b0.a(c0710s0), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.communication.HomeCommunicationViewModel$getBubble$1(c0710s0, null), 3);
            kotlinx.coroutines.g.d(E81.f.j(getViewLifecycleOwner()), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.communication.HomeCommunicationViewModel$getBubble$2(c0710s0, a2, null), 3);
            com.bilibili.bplus.im.communication.C0710s0 c0710s1 = this.e0;
            Fb.s sVar = new Fb.s(this, 4);
            c0710s1.getClass();
            kotlinx.coroutines.g.d(E81.f.j(getViewLifecycleOwner()), (kotlin.coroutines.d) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.bplus.im.communication.HomeCommunicationViewModel$collectFilter$1(c0710s1, sVar, null), 3);
        }
        F80.e eVar = F80.e.a;
        new F80.a(X70.b.class).c(getViewLifecycleOwner(), new com.bilibili.bililive.room.ui.roomv3.player.controller.widget.o0(this, 3));
    }

    /* JADX INFO: compiled from: BL */
    public class e implements tv.danmaku.bili.widget.dialog.BiliCommonDialog.a {
        public e() {
        }

        public final void g(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull tv.danmaku.bili.widget.dialog.BiliCommonDialog biliCommonDialog) {
            p083o70.a.n("onebuttonread");
            com.bilibili.bplus.im.pblink.g.a("im-moss", new Ai.g(com.bapis.bilibili.im.interfaces.v1.UpdateUnreadScope.All, 16)).r(new io.reactivex.rxjava3.internal.schedulers.ExecutorScheduler(p078n70.b.d().k)).n(Pi1.a.b()).a(new com.bilibili.bplus.im.communication.HomeCommunicationFragment.e.a());
        }

        /* JADX INFO: compiled from: BL */
        public class a implements Qi1.q<X70.f<com.google.protobuf.Empty>> {
            public a() {
            }

            public final void onError(java.lang.Throwable th) {
                tv.danmaku.android.log.BLog.w("im-home", th);
                ub0.v.c(2131892945, com.bilibili.bplus.im.communication.HomeCommunicationFragment.this.getActivity(), 0);
            }

            public final void onNext(java.lang.Object obj) {
                tv.danmaku.android.log.BLog.i("im-home", "akeyread success");
                com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore unreadCountDataStore = com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.a;
                com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.b();
                int i = 0;
                while (true) {
                    com.bilibili.bplus.im.communication.HomeCommunicationFragment.e eVar = com.bilibili.bplus.im.communication.HomeCommunicationFragment.e.this;
                    int size = com.bilibili.bplus.im.communication.HomeCommunicationFragment.this.K.e.size();
                    com.bilibili.bplus.im.communication.HomeCommunicationFragment homeCommunicationFragment = com.bilibili.bplus.im.communication.HomeCommunicationFragment.this;
                    if (i >= size) {
                        ub0.v.c(2131892938, homeCommunicationFragment.getActivity(), 0);
                        return;
                    }
                    com.bilibili.bplus.im.entity.Conversation conversation = (com.bilibili.bplus.im.entity.Conversation) homeCommunicationFragment.K.e.get(i);
                    if (conversation.getType() == 104 && !com.bilibili.bplus.im.business.client.manager.d0.f().d.isNewUpHelperLogic()) {
                        m70.d.b.a.a(false);
                        homeCommunicationFragment.K.m0(i);
                    } else if (conversation.markRead()) {
                        homeCommunicationFragment.K.m0(i);
                    }
                    i++;
                }
            }

            public final void onComplete() {
            }

            public final void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            }
        }
    }

    /* JADX INFO: compiled from: BL */
    public class b implements Qi1.q<X70.f<com.bapis.bilibili.polymer.community.govern.v1.LoadAntiHarassmentSettingsRsp>> {
        public b() {
        }

        public final void onError(java.lang.Throwable th) {
            tv.danmaku.android.log.BLog.w("im-home", th);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bilibili.bplus.im.communication.p0] */
        public final void onNext(java.lang.Object obj) {
            com.bapis.bilibili.polymer.community.govern.v1.LoadAntiHarassmentSettingsRsp loadAntiHarassmentSettingsRsp = (com.bapis.bilibili.polymer.community.govern.v1.LoadAntiHarassmentSettingsRsp) ((X70.f) obj).a;
            if (loadAntiHarassmentSettingsRsp != null && loadAntiHarassmentSettingsRsp.getShowWindow() == 1 && loadAntiHarassmentSettingsRsp.hasAntiHarassmentSetting()) {
                final int i = 0;
                new com.bilibili.bplus.im.communication.widget.d(com.bilibili.bplus.im.communication.HomeCommunicationFragment.this.getActivity(), loadAntiHarassmentSettingsRsp.getAntiHarassmentSetting().getIm(), new kotlin.jvm.functions.Function2() { // from class: com.bilibili.bplus.im.communication.p0
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        java.lang.Object obj4 = this;
                        switch (i) {
                            case 0:
                                com.bilibili.bplus.im.communication.HomeCommunicationFragment homeCommunicationFragment = com.bilibili.bplus.im.communication.HomeCommunicationFragment.this;
                                com.bilibili.lib.accounts.x.c(homeCommunicationFragment.requireContext()).getClass();
                                com.bilibili.bplus.im.setting.fragment.g.b(homeCommunicationFragment, com.bilibili.lib.accounts.x.k(), ((java.lang.Integer) obj2).intValue(), (com.bilibili.bplus.im.setting.AntiDisturbingExpireTimePeriod) obj3);
                                return null;
                            case 1:
                                androidx.compose.runtime.Composer composer = (androidx.compose.runtime.Composer) obj2;
                                int iIntValue = ((java.lang.Integer) obj3).intValue();
                                kotlin.reflect.KProperty[] kPropertyArr = com.bilibili.pegasus.recommendlabel.RecommendLabelFirstActivity.j1;
                                if (composer.s(1 & iIntValue, (iIntValue & 3) != 2)) {
                                    com.bilibili.pegasus.recommendlabel.RecommendLabelFirstActivity recommendLabelFirstActivity = (com.bilibili.pegasus.recommendlabel.RecommendLabelFirstActivity) obj4;
                                    com.bilibili.compose.theme.BiliThemeKt.a((com.bilibili.compose.theme.ThemeStrategy) null, false, A0.u.c(835995154, new com.bilibili.pegasus.recommendlabel.r((com.bilibili.pegasus.recommendlabel.O) androidx.compose.runtime.w1.b(recommendLabelFirstActivity.eb().c, composer, 0).getValue(), recommendLabelFirstActivity), composer), composer, 384, 3);
                                } else {
                                    composer.f();
                                }
                                return Zx1.o.a;
                            default:
                                androidx.compose.runtime.Composer composer2 = (androidx.compose.runtime.Composer) obj2;
                                int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                                if (composer2.s(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                    im.session.model.IMSessionInfo iMSessionInfo = (im.session.model.IMSessionInfo) obj4;
                                    if (iMSessionInfo.g.length() > 0) {
                                        composer2.J(-1837553308);
                                        com.bilibili.compose.text.e.b(iMSessionInfo.g, i1.H.b(((com.bilibili.compose.theme.f) composer2.r(com.bilibili.compose.theme.BiliThemeKt.a)).e("T12"), ((com.bilibili.compose.theme.c) composer2.r(com.bilibili.compose.theme.BiliThemeKt.c)).B0, 0L, (androidx.compose.ui.text.font.x) null, (androidx.compose.ui.text.font.t) null, (androidx.compose.ui.text.font.m) null, (java.lang.String) null, 0L, (s1.a) null, (s1.k) null, 0L, (s1.h) null, (L0.p1) null, (androidx.compose.ui.graphics.drawscope.f) null, 0, 0, 0L, (s1.l) null, (i1.q) null, (s1.f) null, 0, 16777214), (androidx.compose.ui.l) null, 1, (com.bilibili.compose.text.b) null, (com.bilibili.compose.text.a) null, 2, 0L, composer2, 1575936, 180);
                                        composer2.i();
                                    } else {
                                        composer2.J(-1837219035);
                                        composer2.i();
                                    }
                                } else {
                                    composer2.f();
                                }
                                return Zx1.o.a;
                        }
                    }
                }).show();
            }
        }

        public final void onComplete() {
        }

        public final void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        }
    }

    /* JADX INFO: compiled from: BL */
    public class c implements Qi1.q<X70.f<com.google.protobuf.Empty>> {
        public final /* synthetic */ androidx.appcompat.widget.U b;
        public final /* synthetic */ android.view.View c;
        public final /* synthetic */ com.bilibili.bplus.im.communication.HomeCommunicationFragment d;

        public c(com.bilibili.bplus.im.communication.HomeCommunicationFragment homeCommunicationFragment, androidx.appcompat.widget.U u, android.view.View view) {
            this.b = u;
            this.c = view;
            this.d = homeCommunicationFragment;
        }

        public final void onError(java.lang.Throwable th) {
            tv.danmaku.android.log.BLog.w("im-home", th);
            ub0.v.c(2131892945, this.d.getActivity(), 0);
        }

        public final void onNext(java.lang.Object obj) {
            tv.danmaku.android.log.BLog.i("im-home", "akeyread success");
            if (p078n70.b.d().f().getBoolean("KEY_CLICKED_GROUP_NOTICE", false)) {
                this.b.a.findItem(2131302347).setIcon(2131235764);
                com.bilibili.bplus.im.business.client.manager.C0649a.a(false);
                this.c.findViewById(2131303200).setVisibility(4);
            }
            com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore unreadCountDataStore = com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.a;
            com.bilibili.bplus.im.business.client.manager.UnreadCountDataStore.b();
            int i = 0;
            while (true) {
                com.bilibili.bplus.im.communication.HomeCommunicationFragment homeCommunicationFragment = this.d;
                if (i >= homeCommunicationFragment.K.e.size()) {
                    ub0.v.c(2131892938, homeCommunicationFragment.getActivity(), 0);
                    return;
                }
                com.bilibili.bplus.im.entity.Conversation conversation = (com.bilibili.bplus.im.entity.Conversation) homeCommunicationFragment.K.e.get(i);
                if (conversation.getType() == 104 && !com.bilibili.bplus.im.business.client.manager.d0.f().d.isNewUpHelperLogic()) {
                    m70.d.b.a.a(false);
                    homeCommunicationFragment.K.m0(i);
                } else if (conversation.markRead()) {
                    homeCommunicationFragment.K.m0(i);
                }
                i++;
            }
        }

        public final void onComplete() {
        }

        public final void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        }
    }

    /* JADX INFO: compiled from: BL */
    public class d implements tv.danmaku.bili.widget.dialog.BiliCommonDialog.a {
        public final void g(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull tv.danmaku.bili.widget.dialog.BiliCommonDialog biliCommonDialog) {
        }
    }
}
