// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BPAUnaryCA.proto

public final class BPAUnaryCA {
  private BPAUnaryCA() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SupportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SupportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SupportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SupportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SupportRequest1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SupportRequest1_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SupportResponse1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SupportResponse1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020BPAUnaryCA.proto\"!\n\016SupportRequest\022\017\n\007" +
      "payment\030\001 \001(\t\"\"\n\017SupportResponse\022\017\n\007card" +
      "Pay\030\001 \001(\t\"(\n\017SupportRequest1\022\025\n\ravailabl" +
      "e_day\030\001 \001(\t\"n\n\020SupportResponse1\022\034\n\024cours" +
      "e_start_June_14\030\001 \001(\t\022\034\n\024course_start_Ju" +
      "ne_28\030\002 \001(\t\022\036\n\026course_start_August_16\030\003 " +
      "\001(\t2\214\001\n\017CustomerSupport\0229\n\022GetCustomerSu" +
      "pport\022\017.SupportRequest\032\020.SupportResponse" +
      "\"\000\022>\n\023GetCustomerSupport1\022\020.SupportReque" +
      "st1\032\021.SupportResponse1\"\0000\001B\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SupportRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SupportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SupportRequest_descriptor,
        new java.lang.String[] { "Payment", });
    internal_static_SupportResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SupportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SupportResponse_descriptor,
        new java.lang.String[] { "CardPay", });
    internal_static_SupportRequest1_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SupportRequest1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SupportRequest1_descriptor,
        new java.lang.String[] { "AvailableDay", });
    internal_static_SupportResponse1_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SupportResponse1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SupportResponse1_descriptor,
        new java.lang.String[] { "CourseStartJune14", "CourseStartJune28", "CourseStartAugust16", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
