import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *new service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: BPAUnaryCA.proto")
public final class CustomerSupportGrpc {

  private CustomerSupportGrpc() {}

  public static final String SERVICE_NAME = "CustomerSupport";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SupportRequest,
      SupportResponse> getGetCustomerSupportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerSupport",
      requestType = SupportRequest.class,
      responseType = SupportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SupportRequest,
      SupportResponse> getGetCustomerSupportMethod() {
    io.grpc.MethodDescriptor<SupportRequest, SupportResponse> getGetCustomerSupportMethod;
    if ((getGetCustomerSupportMethod = CustomerSupportGrpc.getGetCustomerSupportMethod) == null) {
      synchronized (CustomerSupportGrpc.class) {
        if ((getGetCustomerSupportMethod = CustomerSupportGrpc.getGetCustomerSupportMethod) == null) {
          CustomerSupportGrpc.getGetCustomerSupportMethod = getGetCustomerSupportMethod = 
              io.grpc.MethodDescriptor.<SupportRequest, SupportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerSupport", "GetCustomerSupport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SupportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SupportResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerSupportMethodDescriptorSupplier("GetCustomerSupport"))
                  .build();
          }
        }
     }
     return getGetCustomerSupportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SupportRequest1,
      SupportResponse1> getGetCustomerSupport1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerSupport1",
      requestType = SupportRequest1.class,
      responseType = SupportResponse1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<SupportRequest1,
      SupportResponse1> getGetCustomerSupport1Method() {
    io.grpc.MethodDescriptor<SupportRequest1, SupportResponse1> getGetCustomerSupport1Method;
    if ((getGetCustomerSupport1Method = CustomerSupportGrpc.getGetCustomerSupport1Method) == null) {
      synchronized (CustomerSupportGrpc.class) {
        if ((getGetCustomerSupport1Method = CustomerSupportGrpc.getGetCustomerSupport1Method) == null) {
          CustomerSupportGrpc.getGetCustomerSupport1Method = getGetCustomerSupport1Method = 
              io.grpc.MethodDescriptor.<SupportRequest1, SupportResponse1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CustomerSupport", "GetCustomerSupport1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SupportRequest1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SupportResponse1.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerSupportMethodDescriptorSupplier("GetCustomerSupport1"))
                  .build();
          }
        }
     }
     return getGetCustomerSupport1Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerSupportStub newStub(io.grpc.Channel channel) {
    return new CustomerSupportStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerSupportBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerSupportBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerSupportFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerSupportFutureStub(channel);
  }

  /**
   * <pre>
   *new service
   * </pre>
   */
  public static abstract class CustomerSupportImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *rpc's inside CustomerSupport
     *first service of the project : Customer Support
     * </pre>
     */
    public void getCustomerSupport(SupportRequest request,
        io.grpc.stub.StreamObserver<SupportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerSupportMethod(), responseObserver);
    }

    /**
     */
    public void getCustomerSupport1(SupportRequest1 request,
        io.grpc.stub.StreamObserver<SupportResponse1> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerSupport1Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerSupportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SupportRequest,
                SupportResponse>(
                  this, METHODID_GET_CUSTOMER_SUPPORT)))
          .addMethod(
            getGetCustomerSupport1Method(),
            asyncServerStreamingCall(
              new MethodHandlers<
                SupportRequest1,
                SupportResponse1>(
                  this, METHODID_GET_CUSTOMER_SUPPORT1)))
          .build();
    }
  }

  /**
   * <pre>
   *new service
   * </pre>
   */
  public static final class CustomerSupportStub extends io.grpc.stub.AbstractStub<CustomerSupportStub> {
    private CustomerSupportStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerSupportStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerSupportStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerSupportStub(channel, callOptions);
    }

    /**
     * <pre>
     *rpc's inside CustomerSupport
     *first service of the project : Customer Support
     * </pre>
     */
    public void getCustomerSupport(SupportRequest request,
        io.grpc.stub.StreamObserver<SupportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerSupportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerSupport1(SupportRequest1 request,
        io.grpc.stub.StreamObserver<SupportResponse1> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCustomerSupport1Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *new service
   * </pre>
   */
  public static final class CustomerSupportBlockingStub extends io.grpc.stub.AbstractStub<CustomerSupportBlockingStub> {
    private CustomerSupportBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerSupportBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerSupportBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerSupportBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *rpc's inside CustomerSupport
     *first service of the project : Customer Support
     * </pre>
     */
    public SupportResponse getCustomerSupport(SupportRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerSupportMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<SupportResponse1> getCustomerSupport1(
        SupportRequest1 request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCustomerSupport1Method(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *new service
   * </pre>
   */
  public static final class CustomerSupportFutureStub extends io.grpc.stub.AbstractStub<CustomerSupportFutureStub> {
    private CustomerSupportFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerSupportFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerSupportFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerSupportFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *rpc's inside CustomerSupport
     *first service of the project : Customer Support
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SupportResponse> getCustomerSupport(
        SupportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerSupportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_SUPPORT = 0;
  private static final int METHODID_GET_CUSTOMER_SUPPORT1 = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerSupportImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerSupportImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_SUPPORT:
          serviceImpl.getCustomerSupport((SupportRequest) request,
              (io.grpc.stub.StreamObserver<SupportResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_SUPPORT1:
          serviceImpl.getCustomerSupport1((SupportRequest1) request,
              (io.grpc.stub.StreamObserver<SupportResponse1>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CustomerSupportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerSupportBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BPAUnaryCA.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerSupport");
    }
  }

  private static final class CustomerSupportFileDescriptorSupplier
      extends CustomerSupportBaseDescriptorSupplier {
    CustomerSupportFileDescriptorSupplier() {}
  }

  private static final class CustomerSupportMethodDescriptorSupplier
      extends CustomerSupportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerSupportMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CustomerSupportGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerSupportFileDescriptorSupplier())
              .addMethod(getGetCustomerSupportMethod())
              .addMethod(getGetCustomerSupport1Method())
              .build();
        }
      }
    }
    return result;
  }
}
