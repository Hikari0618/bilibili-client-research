package com.bapis.bilibili.app.card.v1;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili/dex/classes7.dex */
public final class DislikeReason extends com.google.protobuf.GeneratedMessageLite<com.bapis.bilibili.app.card.v1.DislikeReason, com.bapis.bilibili.app.card.v1.DislikeReason.b> implements m7.InterfaceC1723h {
    private static final com.bapis.bilibili.app.card.v1.DislikeReason DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.bapis.bilibili.app.card.v1.DislikeReason> PARSER;
    private long id_;
    private java.lang.String name_ = "";

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
    public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.bapis.bilibili.app.card.v1.DislikeReason, com.bapis.bilibili.app.card.v1.DislikeReason.b> implements m7.InterfaceC1723h {
        public /* synthetic */ b(int i) {
            this();
        }

        public com.bapis.bilibili.app.card.v1.DislikeReason.b clearId() {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.DislikeReason) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).clearId();
            return this;
        }

        public com.bapis.bilibili.app.card.v1.DislikeReason.b clearName() {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.DislikeReason) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).clearName();
            return this;
        }

        @Override // m7.InterfaceC1723h
        public long getId() {
            return ((com.bapis.bilibili.app.card.v1.DislikeReason) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).getId();
        }

        @Override // m7.InterfaceC1723h
        public java.lang.String getName() {
            return ((com.bapis.bilibili.app.card.v1.DislikeReason) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).getName();
        }

        @Override // m7.InterfaceC1723h
        public com.google.protobuf.ByteString getNameBytes() {
            return ((com.bapis.bilibili.app.card.v1.DislikeReason) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).getNameBytes();
        }

        public com.bapis.bilibili.app.card.v1.DislikeReason.b setId(long j) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.DislikeReason) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).setId(j);
            return this;
        }

        public com.bapis.bilibili.app.card.v1.DislikeReason.b setName(java.lang.String str) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.DislikeReason) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).setName(str);
            return this;
        }

        public com.bapis.bilibili.app.card.v1.DislikeReason.b setNameBytes(com.google.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.bapis.bilibili.app.card.v1.DislikeReason) ((com.google.protobuf.GeneratedMessageLite.Builder) this).instance).setNameBytes(byteString);
            return this;
        }

        private b() {
            super(com.bapis.bilibili.app.card.v1.DislikeReason.DEFAULT_INSTANCE);
        }
    }

    static {
        com.bapis.bilibili.app.card.v1.DislikeReason dislikeReason = new com.bapis.bilibili.app.card.v1.DislikeReason();
        DEFAULT_INSTANCE = dislikeReason;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.bapis.bilibili.app.card.v1.DislikeReason.class, dislikeReason);
    }

    private DislikeReason() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason.b newBuilder() {
        return (com.bapis.bilibili.app.card.v1.DislikeReason.b) DEFAULT_INSTANCE.createBuilder();
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.bapis.bilibili.app.card.v1.DislikeReason) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.bapis.bilibili.app.card.v1.DislikeReason) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.bapis.bilibili.app.card.v1.DislikeReason> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(java.lang.String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        switch (com.bapis.bilibili.app.card.v1.DislikeReason.a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.bapis.bilibili.app.card.v1.DislikeReason();
            case 2:
                return new com.bapis.bilibili.app.card.v1.DislikeReason.b(0);
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002Ȉ", new java.lang.Object[]{"id_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (com.bapis.bilibili.app.card.v1.DislikeReason.class) {
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

    @Override // m7.InterfaceC1723h
    public long getId() {
        return this.id_;
    }

    @Override // m7.InterfaceC1723h
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // m7.InterfaceC1723h
    public com.google.protobuf.ByteString getNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason.b newBuilder(com.bapis.bilibili.app.card.v1.DislikeReason dislikeReason) {
        return (com.bapis.bilibili.app.card.v1.DislikeReason.b) DEFAULT_INSTANCE.createBuilder(dislikeReason);
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.bapis.bilibili.app.card.v1.DislikeReason) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.bapis.bilibili.app.card.v1.DislikeReason) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.bapis.bilibili.app.card.v1.DislikeReason) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.bapis.bilibili.app.card.v1.DislikeReason) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.bapis.bilibili.app.card.v1.DislikeReason) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.bapis.bilibili.app.card.v1.DislikeReason) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.bapis.bilibili.app.card.v1.DislikeReason) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.bapis.bilibili.app.card.v1.DislikeReason) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.bapis.bilibili.app.card.v1.DislikeReason) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.bapis.bilibili.app.card.v1.DislikeReason parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.bapis.bilibili.app.card.v1.DislikeReason) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
