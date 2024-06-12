/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/types.proto

// Protobuf Java Version: 3.25.3
package com.google.bigtable.admin.v2;

public final class TypesProto {
  private TypesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Type_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Type_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Type_Bytes_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Type_Bytes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Type_Bytes_Encoding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Type_Bytes_Encoding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Type_Bytes_Encoding_Raw_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Type_Bytes_Encoding_Raw_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Type_String_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Type_String_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Type_String_Encoding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Type_String_Encoding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Type_String_Encoding_Utf8Raw_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Type_String_Encoding_Utf8Raw_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Type_Int64_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Type_Int64_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Type_Int64_Encoding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Type_Int64_Encoding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Type_Int64_Encoding_BigEndianBytes_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Type_Int64_Encoding_BigEndianBytes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Type_Aggregate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Type_Aggregate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Type_Aggregate_Sum_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Type_Aggregate_Sum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/bigtable/admin/v2/types.proto\022\030"
          + "google.bigtable.admin.v2\032\037google/api/fie"
          + "ld_behavior.proto\"\307\010\n\004Type\022:\n\nbytes_type"
          + "\030\001 \001(\0132$.google.bigtable.admin.v2.Type.B"
          + "ytesH\000\022<\n\013string_type\030\002 \001(\0132%.google.big"
          + "table.admin.v2.Type.StringH\000\022:\n\nint64_ty"
          + "pe\030\005 \001(\0132$.google.bigtable.admin.v2.Type"
          + ".Int64H\000\022B\n\016aggregate_type\030\006 \001(\0132(.googl"
          + "e.bigtable.admin.v2.Type.AggregateH\000\032\251\001\n"
          + "\005Bytes\022?\n\010encoding\030\001 \001(\0132-.google.bigtab"
          + "le.admin.v2.Type.Bytes.Encoding\032_\n\010Encod"
          + "ing\022@\n\003raw\030\001 \001(\01321.google.bigtable.admin"
          + ".v2.Type.Bytes.Encoding.RawH\000\032\005\n\003RawB\n\n\010"
          + "encoding\032\271\001\n\006String\022@\n\010encoding\030\001 \001(\0132.."
          + "google.bigtable.admin.v2.Type.String.Enc"
          + "oding\032m\n\010Encoding\022J\n\010utf8_raw\030\001 \001(\01326.go"
          + "ogle.bigtable.admin.v2.Type.String.Encod"
          + "ing.Utf8RawH\000\032\t\n\007Utf8RawB\n\n\010encoding\032\207\002\n"
          + "\005Int64\022?\n\010encoding\030\001 \001(\0132-.google.bigtab"
          + "le.admin.v2.Type.Int64.Encoding\032\274\001\n\010Enco"
          + "ding\022X\n\020big_endian_bytes\030\001 \001(\0132<.google."
          + "bigtable.admin.v2.Type.Int64.Encoding.Bi"
          + "gEndianBytesH\000\032J\n\016BigEndianBytes\0228\n\nbyte"
          + "s_type\030\001 \001(\0132$.google.bigtable.admin.v2."
          + "Type.BytesB\n\n\010encoding\032\312\001\n\tAggregate\0222\n\n"
          + "input_type\030\001 \001(\0132\036.google.bigtable.admin"
          + ".v2.Type\0227\n\nstate_type\030\002 \001(\0132\036.google.bi"
          + "gtable.admin.v2.TypeB\003\340A\003\022;\n\003sum\030\004 \001(\0132,"
          + ".google.bigtable.admin.v2.Type.Aggregate"
          + ".SumH\000\032\005\n\003SumB\014\n\naggregatorB\006\n\004kindB\322\001\n\034"
          + "com.google.bigtable.admin.v2B\nTypesProto"
          + "P\001Z=google.golang.org/genproto/googleapi"
          + "s/bigtable/admin/v2;admin\252\002\036Google.Cloud"
          + ".Bigtable.Admin.V2\312\002\036Google\\Cloud\\Bigtab"
          + "le\\Admin\\V2\352\002\"Google::Cloud::Bigtable::A"
          + "dmin::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_bigtable_admin_v2_Type_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_bigtable_admin_v2_Type_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Type_descriptor,
            new java.lang.String[] {
              "BytesType", "StringType", "Int64Type", "AggregateType", "Kind",
            });
    internal_static_google_bigtable_admin_v2_Type_Bytes_descriptor =
        internal_static_google_bigtable_admin_v2_Type_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_Type_Bytes_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Type_Bytes_descriptor,
            new java.lang.String[] {
              "Encoding",
            });
    internal_static_google_bigtable_admin_v2_Type_Bytes_Encoding_descriptor =
        internal_static_google_bigtable_admin_v2_Type_Bytes_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_Type_Bytes_Encoding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Type_Bytes_Encoding_descriptor,
            new java.lang.String[] {
              "Raw", "Encoding",
            });
    internal_static_google_bigtable_admin_v2_Type_Bytes_Encoding_Raw_descriptor =
        internal_static_google_bigtable_admin_v2_Type_Bytes_Encoding_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_bigtable_admin_v2_Type_Bytes_Encoding_Raw_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Type_Bytes_Encoding_Raw_descriptor,
            new java.lang.String[] {});
    internal_static_google_bigtable_admin_v2_Type_String_descriptor =
        internal_static_google_bigtable_admin_v2_Type_descriptor.getNestedTypes().get(1);
    internal_static_google_bigtable_admin_v2_Type_String_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Type_String_descriptor,
            new java.lang.String[] {
              "Encoding",
            });
    internal_static_google_bigtable_admin_v2_Type_String_Encoding_descriptor =
        internal_static_google_bigtable_admin_v2_Type_String_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_Type_String_Encoding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Type_String_Encoding_descriptor,
            new java.lang.String[] {
              "Utf8Raw", "Encoding",
            });
    internal_static_google_bigtable_admin_v2_Type_String_Encoding_Utf8Raw_descriptor =
        internal_static_google_bigtable_admin_v2_Type_String_Encoding_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_bigtable_admin_v2_Type_String_Encoding_Utf8Raw_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Type_String_Encoding_Utf8Raw_descriptor,
            new java.lang.String[] {});
    internal_static_google_bigtable_admin_v2_Type_Int64_descriptor =
        internal_static_google_bigtable_admin_v2_Type_descriptor.getNestedTypes().get(2);
    internal_static_google_bigtable_admin_v2_Type_Int64_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Type_Int64_descriptor,
            new java.lang.String[] {
              "Encoding",
            });
    internal_static_google_bigtable_admin_v2_Type_Int64_Encoding_descriptor =
        internal_static_google_bigtable_admin_v2_Type_Int64_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_Type_Int64_Encoding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Type_Int64_Encoding_descriptor,
            new java.lang.String[] {
              "BigEndianBytes", "Encoding",
            });
    internal_static_google_bigtable_admin_v2_Type_Int64_Encoding_BigEndianBytes_descriptor =
        internal_static_google_bigtable_admin_v2_Type_Int64_Encoding_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_bigtable_admin_v2_Type_Int64_Encoding_BigEndianBytes_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Type_Int64_Encoding_BigEndianBytes_descriptor,
            new java.lang.String[] {
              "BytesType",
            });
    internal_static_google_bigtable_admin_v2_Type_Aggregate_descriptor =
        internal_static_google_bigtable_admin_v2_Type_descriptor.getNestedTypes().get(3);
    internal_static_google_bigtable_admin_v2_Type_Aggregate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Type_Aggregate_descriptor,
            new java.lang.String[] {
              "InputType", "StateType", "Sum", "Aggregator",
            });
    internal_static_google_bigtable_admin_v2_Type_Aggregate_Sum_descriptor =
        internal_static_google_bigtable_admin_v2_Type_Aggregate_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_Type_Aggregate_Sum_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Type_Aggregate_Sum_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
