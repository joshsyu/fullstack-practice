# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: message.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='message.proto',
  package='grpcservice',
  syntax='proto3',
  serialized_options=b'\n\024com.grpc.grpcserviceZ\014grpcservice/',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\rmessage.proto\x12\x0bgrpcservice\"%\n\nRequestMsg\x12\n\n\x02\x61p\x18\x01 \x01(\t\x12\x0b\n\x03msg\x18\x02 \x01(\t\"\'\n\x08ReplyMsg\x12\x0e\n\x06status\x18\x01 \x01(\t\x12\x0b\n\x03msg\x18\x02 \x01(\t2\x9d\x02\n\x0bGrpcService\x12\x41\n\rsimpleRequest\x12\x17.grpcservice.RequestMsg\x1a\x15.grpcservice.ReplyMsg\"\x00\x12\x43\n\rstreamRequest\x12\x17.grpcservice.RequestMsg\x1a\x15.grpcservice.ReplyMsg\"\x00(\x01\x12\x41\n\x0bstreamReply\x12\x17.grpcservice.RequestMsg\x1a\x15.grpcservice.ReplyMsg\"\x00\x30\x01\x12\x43\n\x0bstreamRoute\x12\x17.grpcservice.RequestMsg\x1a\x15.grpcservice.ReplyMsg\"\x00(\x01\x30\x01\x42$\n\x14\x63om.grpc.grpcserviceZ\x0cgrpcservice/b\x06proto3'
)




_REQUESTMSG = _descriptor.Descriptor(
  name='RequestMsg',
  full_name='grpcservice.RequestMsg',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='ap', full_name='grpcservice.RequestMsg.ap', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='msg', full_name='grpcservice.RequestMsg.msg', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=30,
  serialized_end=67,
)


_REPLYMSG = _descriptor.Descriptor(
  name='ReplyMsg',
  full_name='grpcservice.ReplyMsg',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='status', full_name='grpcservice.ReplyMsg.status', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='msg', full_name='grpcservice.ReplyMsg.msg', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=69,
  serialized_end=108,
)

DESCRIPTOR.message_types_by_name['RequestMsg'] = _REQUESTMSG
DESCRIPTOR.message_types_by_name['ReplyMsg'] = _REPLYMSG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RequestMsg = _reflection.GeneratedProtocolMessageType('RequestMsg', (_message.Message,), {
  'DESCRIPTOR' : _REQUESTMSG,
  '__module__' : 'message_pb2'
  # @@protoc_insertion_point(class_scope:grpcservice.RequestMsg)
  })
_sym_db.RegisterMessage(RequestMsg)

ReplyMsg = _reflection.GeneratedProtocolMessageType('ReplyMsg', (_message.Message,), {
  'DESCRIPTOR' : _REPLYMSG,
  '__module__' : 'message_pb2'
  # @@protoc_insertion_point(class_scope:grpcservice.ReplyMsg)
  })
_sym_db.RegisterMessage(ReplyMsg)


DESCRIPTOR._options = None

_GRPCSERVICE = _descriptor.ServiceDescriptor(
  name='GrpcService',
  full_name='grpcservice.GrpcService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=111,
  serialized_end=396,
  methods=[
  _descriptor.MethodDescriptor(
    name='simpleRequest',
    full_name='grpcservice.GrpcService.simpleRequest',
    index=0,
    containing_service=None,
    input_type=_REQUESTMSG,
    output_type=_REPLYMSG,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='streamRequest',
    full_name='grpcservice.GrpcService.streamRequest',
    index=1,
    containing_service=None,
    input_type=_REQUESTMSG,
    output_type=_REPLYMSG,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='streamReply',
    full_name='grpcservice.GrpcService.streamReply',
    index=2,
    containing_service=None,
    input_type=_REQUESTMSG,
    output_type=_REPLYMSG,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='streamRoute',
    full_name='grpcservice.GrpcService.streamRoute',
    index=3,
    containing_service=None,
    input_type=_REQUESTMSG,
    output_type=_REPLYMSG,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_GRPCSERVICE)

DESCRIPTOR.services_by_name['GrpcService'] = _GRPCSERVICE

# @@protoc_insertion_point(module_scope)