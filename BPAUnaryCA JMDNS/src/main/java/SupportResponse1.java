// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BPAUnaryCA.proto

/**
 * Protobuf type {@code SupportResponse1}
 */
public  final class SupportResponse1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SupportResponse1)
    SupportResponse1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use SupportResponse1.newBuilder() to construct.
  private SupportResponse1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SupportResponse1() {
    courseStartJune14_ = "";
    courseStartJune28_ = "";
    courseStartAugust16_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SupportResponse1(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            courseStartJune14_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            courseStartJune28_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            courseStartAugust16_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BPAUnaryCA.internal_static_SupportResponse1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BPAUnaryCA.internal_static_SupportResponse1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SupportResponse1.class, SupportResponse1.Builder.class);
  }

  public static final int COURSE_START_JUNE_14_FIELD_NUMBER = 1;
  private volatile java.lang.Object courseStartJune14_;
  /**
   * <pre>
   * server streaming - many responses at one time
   * </pre>
   *
   * <code>string course_start_June_14 = 1;</code>
   */
  public java.lang.String getCourseStartJune14() {
    java.lang.Object ref = courseStartJune14_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      courseStartJune14_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * server streaming - many responses at one time
   * </pre>
   *
   * <code>string course_start_June_14 = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCourseStartJune14Bytes() {
    java.lang.Object ref = courseStartJune14_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      courseStartJune14_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COURSE_START_JUNE_28_FIELD_NUMBER = 2;
  private volatile java.lang.Object courseStartJune28_;
  /**
   * <code>string course_start_June_28 = 2;</code>
   */
  public java.lang.String getCourseStartJune28() {
    java.lang.Object ref = courseStartJune28_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      courseStartJune28_ = s;
      return s;
    }
  }
  /**
   * <code>string course_start_June_28 = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCourseStartJune28Bytes() {
    java.lang.Object ref = courseStartJune28_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      courseStartJune28_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COURSE_START_AUGUST_16_FIELD_NUMBER = 3;
  private volatile java.lang.Object courseStartAugust16_;
  /**
   * <code>string course_start_August_16 = 3;</code>
   */
  public java.lang.String getCourseStartAugust16() {
    java.lang.Object ref = courseStartAugust16_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      courseStartAugust16_ = s;
      return s;
    }
  }
  /**
   * <code>string course_start_August_16 = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCourseStartAugust16Bytes() {
    java.lang.Object ref = courseStartAugust16_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      courseStartAugust16_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getCourseStartJune14Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, courseStartJune14_);
    }
    if (!getCourseStartJune28Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, courseStartJune28_);
    }
    if (!getCourseStartAugust16Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, courseStartAugust16_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCourseStartJune14Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, courseStartJune14_);
    }
    if (!getCourseStartJune28Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, courseStartJune28_);
    }
    if (!getCourseStartAugust16Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, courseStartAugust16_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof SupportResponse1)) {
      return super.equals(obj);
    }
    SupportResponse1 other = (SupportResponse1) obj;

    boolean result = true;
    result = result && getCourseStartJune14()
        .equals(other.getCourseStartJune14());
    result = result && getCourseStartJune28()
        .equals(other.getCourseStartJune28());
    result = result && getCourseStartAugust16()
        .equals(other.getCourseStartAugust16());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COURSE_START_JUNE_14_FIELD_NUMBER;
    hash = (53 * hash) + getCourseStartJune14().hashCode();
    hash = (37 * hash) + COURSE_START_JUNE_28_FIELD_NUMBER;
    hash = (53 * hash) + getCourseStartJune28().hashCode();
    hash = (37 * hash) + COURSE_START_AUGUST_16_FIELD_NUMBER;
    hash = (53 * hash) + getCourseStartAugust16().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SupportResponse1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SupportResponse1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SupportResponse1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SupportResponse1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SupportResponse1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SupportResponse1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SupportResponse1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SupportResponse1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SupportResponse1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SupportResponse1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SupportResponse1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SupportResponse1 parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(SupportResponse1 prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SupportResponse1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SupportResponse1)
      SupportResponse1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BPAUnaryCA.internal_static_SupportResponse1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BPAUnaryCA.internal_static_SupportResponse1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SupportResponse1.class, SupportResponse1.Builder.class);
    }

    // Construct using SupportResponse1.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      courseStartJune14_ = "";

      courseStartJune28_ = "";

      courseStartAugust16_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BPAUnaryCA.internal_static_SupportResponse1_descriptor;
    }

    @java.lang.Override
    public SupportResponse1 getDefaultInstanceForType() {
      return SupportResponse1.getDefaultInstance();
    }

    @java.lang.Override
    public SupportResponse1 build() {
      SupportResponse1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public SupportResponse1 buildPartial() {
      SupportResponse1 result = new SupportResponse1(this);
      result.courseStartJune14_ = courseStartJune14_;
      result.courseStartJune28_ = courseStartJune28_;
      result.courseStartAugust16_ = courseStartAugust16_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof SupportResponse1) {
        return mergeFrom((SupportResponse1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SupportResponse1 other) {
      if (other == SupportResponse1.getDefaultInstance()) return this;
      if (!other.getCourseStartJune14().isEmpty()) {
        courseStartJune14_ = other.courseStartJune14_;
        onChanged();
      }
      if (!other.getCourseStartJune28().isEmpty()) {
        courseStartJune28_ = other.courseStartJune28_;
        onChanged();
      }
      if (!other.getCourseStartAugust16().isEmpty()) {
        courseStartAugust16_ = other.courseStartAugust16_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      SupportResponse1 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SupportResponse1) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object courseStartJune14_ = "";
    /**
     * <pre>
     * server streaming - many responses at one time
     * </pre>
     *
     * <code>string course_start_June_14 = 1;</code>
     */
    public java.lang.String getCourseStartJune14() {
      java.lang.Object ref = courseStartJune14_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        courseStartJune14_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * server streaming - many responses at one time
     * </pre>
     *
     * <code>string course_start_June_14 = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCourseStartJune14Bytes() {
      java.lang.Object ref = courseStartJune14_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        courseStartJune14_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * server streaming - many responses at one time
     * </pre>
     *
     * <code>string course_start_June_14 = 1;</code>
     */
    public Builder setCourseStartJune14(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      courseStartJune14_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * server streaming - many responses at one time
     * </pre>
     *
     * <code>string course_start_June_14 = 1;</code>
     */
    public Builder clearCourseStartJune14() {
      
      courseStartJune14_ = getDefaultInstance().getCourseStartJune14();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * server streaming - many responses at one time
     * </pre>
     *
     * <code>string course_start_June_14 = 1;</code>
     */
    public Builder setCourseStartJune14Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      courseStartJune14_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object courseStartJune28_ = "";
    /**
     * <code>string course_start_June_28 = 2;</code>
     */
    public java.lang.String getCourseStartJune28() {
      java.lang.Object ref = courseStartJune28_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        courseStartJune28_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string course_start_June_28 = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCourseStartJune28Bytes() {
      java.lang.Object ref = courseStartJune28_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        courseStartJune28_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string course_start_June_28 = 2;</code>
     */
    public Builder setCourseStartJune28(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      courseStartJune28_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string course_start_June_28 = 2;</code>
     */
    public Builder clearCourseStartJune28() {
      
      courseStartJune28_ = getDefaultInstance().getCourseStartJune28();
      onChanged();
      return this;
    }
    /**
     * <code>string course_start_June_28 = 2;</code>
     */
    public Builder setCourseStartJune28Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      courseStartJune28_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object courseStartAugust16_ = "";
    /**
     * <code>string course_start_August_16 = 3;</code>
     */
    public java.lang.String getCourseStartAugust16() {
      java.lang.Object ref = courseStartAugust16_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        courseStartAugust16_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string course_start_August_16 = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCourseStartAugust16Bytes() {
      java.lang.Object ref = courseStartAugust16_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        courseStartAugust16_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string course_start_August_16 = 3;</code>
     */
    public Builder setCourseStartAugust16(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      courseStartAugust16_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string course_start_August_16 = 3;</code>
     */
    public Builder clearCourseStartAugust16() {
      
      courseStartAugust16_ = getDefaultInstance().getCourseStartAugust16();
      onChanged();
      return this;
    }
    /**
     * <code>string course_start_August_16 = 3;</code>
     */
    public Builder setCourseStartAugust16Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      courseStartAugust16_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SupportResponse1)
  }

  // @@protoc_insertion_point(class_scope:SupportResponse1)
  private static final SupportResponse1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SupportResponse1();
  }

  public static SupportResponse1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SupportResponse1>
      PARSER = new com.google.protobuf.AbstractParser<SupportResponse1>() {
    @java.lang.Override
    public SupportResponse1 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SupportResponse1(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SupportResponse1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SupportResponse1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public SupportResponse1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
