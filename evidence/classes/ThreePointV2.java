package com.bapis.bilibili.app.card.v1;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes7.dex */
public final class ThreePointV2 extends com.google.protobuf.GeneratedMessageLite<com.bapis.bilibili.app.card.v1.ThreePointV2, com.bapis.bilibili.app.card.v1.ThreePointV2.b> implements m7.b0 {
    private static final com.bapis.bilibili.app.card.v1.ThreePointV2 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.Parser<com.bapis.bilibili.app.card.v1.ThreePointV2> PARSER = null;
    public static final int REASONS_FIELD_NUMBER = 3;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 4;
    private long id_;
    private java.lang.String title_ = "";
    private java.lang.String subtitle_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.bapis.bilibili.app.card.v1.DislikeReason> reasons_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private java.lang.String type_ = "";

    /* JADX INFO: compiled from: BL */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                a[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                a[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                a[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                a[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                a[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                a[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: BL */
    public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.bapis.bilibili.app.card.v1.ThreePointV2, com.bapis.bilibili.app.card.v1.ThreePointV2.b> implements m7.b0 {
        public /* synthetic */ b(int i) {
            this();
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b addAllReasons(java.lang.Iterable<? extends com.bapis.bilibili.app.card.v1.DislikeReason> iterable) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).addAllReasons(iterable);
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b addReasons(com.bapis.bilibili.app.card.v1.DislikeReason dislikeReason) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).addReasons(dislikeReason);
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b clearId() {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).clearId();
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b clearReasons() {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).clearReasons();
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b clearSubtitle() {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).clearSubtitle();
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b clearTitle() {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).clearTitle();
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b clearType() {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).clearType();
            return this;
        }

        @Override // m7.b0
        public long getId() {
            return ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).getId();
        }

        @Override // m7.b0
        public com.bapis.bilibili.app.card.v1.DislikeReason getReasons(int i) {
            return ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).getReasons(i);
        }

        @Override // m7.b0
        public int getReasonsCount() {
            return ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).getReasonsCount();
        }

        @Override // m7.b0
        public java.util.List<com.bapis.bilibili.app.card.v1.DislikeReason> getReasonsList() {
            return java.util.Collections.unmodifiableList(((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).getReasonsList());
        }

        @Override // m7.b0
        public java.lang.String getSubtitle() {
            return ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).getSubtitle();
        }

        @Override // m7.b0
        public com.google.protobuf.ByteString getSubtitleBytes() {
            return ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).getSubtitleBytes();
        }

        @Override // m7.b0
        public java.lang.String getTitle() {
            return ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).getTitle();
        }

        @Override // m7.b0
        public com.google.protobuf.ByteString getTitleBytes() {
            return ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).getTitleBytes();
        }

        @Override // m7.b0
        public java.lang.String getType() {
            return ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).getType();
        }

        @Override // m7.b0
        public com.google.protobuf.ByteString getTypeBytes() {
            return ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).getTypeBytes();
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b removeReasons(int i) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).removeReasons(i);
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b setId(long j) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).setId(j);
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b setReasons(int i, com.bapis.bilibili.app.card.v1.DislikeReason dislikeReason) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).setReasons(i, dislikeReason);
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b setSubtitle(java.lang.String str) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).setSubtitle(str);
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b setSubtitleBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).setSubtitleBytes(byteString);
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b setTitle(java.lang.String str) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).setTitle(str);
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b setTitleBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).setTitleBytes(byteString);
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b setType(java.lang.String str) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).setType(str);
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b setTypeBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).setTypeBytes(byteString);
            return this;
        }

        private b() {
            super(com.bapis.bilibili.app.card.v1.ThreePointV2.DEFAULT_INSTANCE);
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b addReasons(int i, com.bapis.bilibili.app.card.v1.DislikeReason dislikeReason) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).addReasons(i, dislikeReason);
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b setReasons(int i, com.bapis.bilibili.app.card.v1.DislikeReason.b bVar) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).setReasons(i, (com.bapis.bilibili.app.card.v1.DislikeReason) bVar.build());
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b addReasons(com.bapis.bilibili.app.card.v1.DislikeReason.b bVar) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).addReasons((com.bapis.bilibili.app.card.v1.DislikeReason) bVar.build());
            return this;
        }

        public com.bapis.bilibili.app.card.v1.ThreePointV2.b addReasons(int i, com.bapis.bilibili.app.card.v1.DislikeReason.b bVar) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.ThreePointV2) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).addReasons(i, (com.bapis.bilibili.app.card.v1.DislikeReason) bVar.build());
            return this;
        }
    }

    static {
        com.bapis.bilibili.app.card.v1.ThreePointV2 threePointV2 = new com.bapis.bilibili.app.card.v1.ThreePointV2();
        DEFAULT_INSTANCE = threePointV2;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.bapis.bilibili.app.card.v1.ThreePointV2.class, threePointV2);
    }

    private ThreePointV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReasons(java.lang.Iterable<? extends com.bapis.bilibili.app.card.v1.DislikeReason> iterable) {
        ensureReasonsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(iterable, this.reasons_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReasons(com.bapis.bilibili.app.card.v1.DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureReasonsIsMutable();
        this.reasons_.add(dislikeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReasons() {
        this.reasons_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensureReasonsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.bapis.bilibili.app.card.v1.DislikeReason> protobufList = this.reasons_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.reasons_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2.b newBuilder() {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2.b) DEFAULT_INSTANCE.createBuilder();
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2 parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2 parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.bapis.bilibili.app.card.v1.ThreePointV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReasons(int i) {
        ensureReasonsIsMutable();
        this.reasons_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasons(int i, com.bapis.bilibili.app.card.v1.DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureReasonsIsMutable();
        this.reasons_.set(i, dislikeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(java.lang.String str) {
        str.getClass();
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subtitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(java.lang.String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(java.lang.String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.bapis.bilibili.app.card.v1.ThreePointV2.a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.bapis.bilibili.app.card.v1.ThreePointV2();
            case 2:
                return new com.bapis.bilibili.app.card.v1.ThreePointV2.b(0);
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005\u0002", new java.lang.Object[]{"title_", "subtitle_", "reasons_", com.bapis.bilibili.app.card.v1.DislikeReason.class, "type_", "id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (com.bapis.bilibili.app.card.v1.ThreePointV2.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // m7.b0
    public long getId() {
        return this.id_;
    }

    @Override // m7.b0
    public com.bapis.bilibili.app.card.v1.DislikeReason getReasons(int i) {
        return (com.bapis.bilibili.app.card.v1.DislikeReason) this.reasons_.get(i);
    }

    @Override // m7.b0
    public int getReasonsCount() {
        return this.reasons_.size();
    }

    @Override // m7.b0
    public java.util.List<com.bapis.bilibili.app.card.v1.DislikeReason> getReasonsList() {
        return this.reasons_;
    }

    public m7.InterfaceC1723h getReasonsOrBuilder(int i) {
        return (m7.InterfaceC1723h) this.reasons_.get(i);
    }

    public java.util.List<? extends m7.InterfaceC1723h> getReasonsOrBuilderList() {
        return this.reasons_;
    }

    @Override // m7.b0
    public java.lang.String getSubtitle() {
        return this.subtitle_;
    }

    @Override // m7.b0
    public com.google.protobuf.ByteString getSubtitleBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.subtitle_);
    }

    @Override // m7.b0
    public java.lang.String getTitle() {
        return this.title_;
    }

    @Override // m7.b0
    public com.google.protobuf.ByteString getTitleBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.title_);
    }

    @Override // m7.b0
    public java.lang.String getType() {
        return this.type_;
    }

    @Override // m7.b0
    public com.google.protobuf.ByteString getTypeBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.type_);
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2.b newBuilder(com.bapis.bilibili.app.card.v1.ThreePointV2 threePointV2) {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2.b) DEFAULT_INSTANCE.createBuilder(threePointV2);
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2 parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2 parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2 parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReasons(int i, com.bapis.bilibili.app.card.v1.DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureReasonsIsMutable();
        this.reasons_.add(i, dislikeReason);
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2 parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2 parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2 parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2 parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2 parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2 parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.bapis.bilibili.app.card.v1.ThreePointV2 parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.bapis.bilibili.app.card.v1.ThreePointV2) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
