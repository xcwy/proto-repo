// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog_message.proto

package io.reactivesw.catalog.grpc;

public interface GrpcFeatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.reactivesw.catalog.infrastructure.GrpcFeature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional int32 display_order = 4;</code>
   */
  int getDisplayOrder();
}
