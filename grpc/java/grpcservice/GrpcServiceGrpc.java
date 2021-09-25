package grpcservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: message.proto")
public final class GrpcServiceGrpc {

  private GrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "grpcservice.GrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpcservice.Message.RequestMsg,
      grpcservice.Message.ReplyMsg> getSimpleRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "simpleRequest",
      requestType = grpcservice.Message.RequestMsg.class,
      responseType = grpcservice.Message.ReplyMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcservice.Message.RequestMsg,
      grpcservice.Message.ReplyMsg> getSimpleRequestMethod() {
    io.grpc.MethodDescriptor<grpcservice.Message.RequestMsg, grpcservice.Message.ReplyMsg> getSimpleRequestMethod;
    if ((getSimpleRequestMethod = GrpcServiceGrpc.getSimpleRequestMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getSimpleRequestMethod = GrpcServiceGrpc.getSimpleRequestMethod) == null) {
          GrpcServiceGrpc.getSimpleRequestMethod = getSimpleRequestMethod =
              io.grpc.MethodDescriptor.<grpcservice.Message.RequestMsg, grpcservice.Message.ReplyMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "simpleRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcservice.Message.RequestMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcservice.Message.ReplyMsg.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("simpleRequest"))
              .build();
        }
      }
    }
    return getSimpleRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcservice.Message.RequestMsg,
      grpcservice.Message.ReplyMsg> getStreamRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamRequest",
      requestType = grpcservice.Message.RequestMsg.class,
      responseType = grpcservice.Message.ReplyMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpcservice.Message.RequestMsg,
      grpcservice.Message.ReplyMsg> getStreamRequestMethod() {
    io.grpc.MethodDescriptor<grpcservice.Message.RequestMsg, grpcservice.Message.ReplyMsg> getStreamRequestMethod;
    if ((getStreamRequestMethod = GrpcServiceGrpc.getStreamRequestMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getStreamRequestMethod = GrpcServiceGrpc.getStreamRequestMethod) == null) {
          GrpcServiceGrpc.getStreamRequestMethod = getStreamRequestMethod =
              io.grpc.MethodDescriptor.<grpcservice.Message.RequestMsg, grpcservice.Message.ReplyMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcservice.Message.RequestMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcservice.Message.ReplyMsg.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("streamRequest"))
              .build();
        }
      }
    }
    return getStreamRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcservice.Message.RequestMsg,
      grpcservice.Message.ReplyMsg> getStreamReplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamReply",
      requestType = grpcservice.Message.RequestMsg.class,
      responseType = grpcservice.Message.ReplyMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpcservice.Message.RequestMsg,
      grpcservice.Message.ReplyMsg> getStreamReplyMethod() {
    io.grpc.MethodDescriptor<grpcservice.Message.RequestMsg, grpcservice.Message.ReplyMsg> getStreamReplyMethod;
    if ((getStreamReplyMethod = GrpcServiceGrpc.getStreamReplyMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getStreamReplyMethod = GrpcServiceGrpc.getStreamReplyMethod) == null) {
          GrpcServiceGrpc.getStreamReplyMethod = getStreamReplyMethod =
              io.grpc.MethodDescriptor.<grpcservice.Message.RequestMsg, grpcservice.Message.ReplyMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamReply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcservice.Message.RequestMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcservice.Message.ReplyMsg.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("streamReply"))
              .build();
        }
      }
    }
    return getStreamReplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcservice.Message.RequestMsg,
      grpcservice.Message.ReplyMsg> getStreamRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamRoute",
      requestType = grpcservice.Message.RequestMsg.class,
      responseType = grpcservice.Message.ReplyMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpcservice.Message.RequestMsg,
      grpcservice.Message.ReplyMsg> getStreamRouteMethod() {
    io.grpc.MethodDescriptor<grpcservice.Message.RequestMsg, grpcservice.Message.ReplyMsg> getStreamRouteMethod;
    if ((getStreamRouteMethod = GrpcServiceGrpc.getStreamRouteMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getStreamRouteMethod = GrpcServiceGrpc.getStreamRouteMethod) == null) {
          GrpcServiceGrpc.getStreamRouteMethod = getStreamRouteMethod =
              io.grpc.MethodDescriptor.<grpcservice.Message.RequestMsg, grpcservice.Message.ReplyMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcservice.Message.RequestMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcservice.Message.ReplyMsg.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("streamRoute"))
              .build();
        }
      }
    }
    return getStreamRouteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceStub>() {
        @java.lang.Override
        public GrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceStub(channel, callOptions);
        }
      };
    return GrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceBlockingStub>() {
        @java.lang.Override
        public GrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return GrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceFutureStub>() {
        @java.lang.Override
        public GrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceFutureStub(channel, callOptions);
        }
      };
    return GrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void simpleRequest(grpcservice.Message.RequestMsg request,
        io.grpc.stub.StreamObserver<grpcservice.Message.ReplyMsg> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSimpleRequestMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpcservice.Message.RequestMsg> streamRequest(
        io.grpc.stub.StreamObserver<grpcservice.Message.ReplyMsg> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamRequestMethod(), responseObserver);
    }

    /**
     */
    public void streamReply(grpcservice.Message.RequestMsg request,
        io.grpc.stub.StreamObserver<grpcservice.Message.ReplyMsg> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamReplyMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpcservice.Message.RequestMsg> streamRoute(
        io.grpc.stub.StreamObserver<grpcservice.Message.ReplyMsg> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamRouteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSimpleRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpcservice.Message.RequestMsg,
                grpcservice.Message.ReplyMsg>(
                  this, METHODID_SIMPLE_REQUEST)))
          .addMethod(
            getStreamRequestMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                grpcservice.Message.RequestMsg,
                grpcservice.Message.ReplyMsg>(
                  this, METHODID_STREAM_REQUEST)))
          .addMethod(
            getStreamReplyMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                grpcservice.Message.RequestMsg,
                grpcservice.Message.ReplyMsg>(
                  this, METHODID_STREAM_REPLY)))
          .addMethod(
            getStreamRouteMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                grpcservice.Message.RequestMsg,
                grpcservice.Message.ReplyMsg>(
                  this, METHODID_STREAM_ROUTE)))
          .build();
    }
  }

  /**
   */
  public static final class GrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<GrpcServiceStub> {
    private GrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void simpleRequest(grpcservice.Message.RequestMsg request,
        io.grpc.stub.StreamObserver<grpcservice.Message.ReplyMsg> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSimpleRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpcservice.Message.RequestMsg> streamRequest(
        io.grpc.stub.StreamObserver<grpcservice.Message.ReplyMsg> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStreamRequestMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void streamReply(grpcservice.Message.RequestMsg request,
        io.grpc.stub.StreamObserver<grpcservice.Message.ReplyMsg> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamReplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpcservice.Message.RequestMsg> streamRoute(
        io.grpc.stub.StreamObserver<grpcservice.Message.ReplyMsg> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamRouteMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GrpcServiceBlockingStub> {
    private GrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpcservice.Message.ReplyMsg simpleRequest(grpcservice.Message.RequestMsg request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSimpleRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<grpcservice.Message.ReplyMsg> streamReply(
        grpcservice.Message.RequestMsg request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamReplyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GrpcServiceFutureStub> {
    private GrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcservice.Message.ReplyMsg> simpleRequest(
        grpcservice.Message.RequestMsg request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSimpleRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIMPLE_REQUEST = 0;
  private static final int METHODID_STREAM_REPLY = 1;
  private static final int METHODID_STREAM_REQUEST = 2;
  private static final int METHODID_STREAM_ROUTE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIMPLE_REQUEST:
          serviceImpl.simpleRequest((grpcservice.Message.RequestMsg) request,
              (io.grpc.stub.StreamObserver<grpcservice.Message.ReplyMsg>) responseObserver);
          break;
        case METHODID_STREAM_REPLY:
          serviceImpl.streamReply((grpcservice.Message.RequestMsg) request,
              (io.grpc.stub.StreamObserver<grpcservice.Message.ReplyMsg>) responseObserver);
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
        case METHODID_STREAM_REQUEST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamRequest(
              (io.grpc.stub.StreamObserver<grpcservice.Message.ReplyMsg>) responseObserver);
        case METHODID_STREAM_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamRoute(
              (io.grpc.stub.StreamObserver<grpcservice.Message.ReplyMsg>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpcservice.Message.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcService");
    }
  }

  private static final class GrpcServiceFileDescriptorSupplier
      extends GrpcServiceBaseDescriptorSupplier {
    GrpcServiceFileDescriptorSupplier() {}
  }

  private static final class GrpcServiceMethodDescriptorSupplier
      extends GrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrpcServiceFileDescriptorSupplier())
              .addMethod(getSimpleRequestMethod())
              .addMethod(getStreamRequestMethod())
              .addMethod(getStreamReplyMethod())
              .addMethod(getStreamRouteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
