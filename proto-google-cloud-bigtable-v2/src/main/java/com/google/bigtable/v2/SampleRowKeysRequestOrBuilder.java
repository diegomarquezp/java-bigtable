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
// source: google/bigtable/v2/bigtable.proto

// Protobuf Java Version: 3.25.2
package com.google.bigtable.v2;

public interface SampleRowKeysRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.SampleRowKeysRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique name of the table from which to sample row keys.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>
   * string table_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The tableName.
   */
  java.lang.String getTableName();
  /**
   *
   *
   * <pre>
   * Required. The unique name of the table from which to sample row keys.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>
   * string table_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for tableName.
   */
  com.google.protobuf.ByteString getTableNameBytes();

  /**
   *
   *
   * <pre>
   * This value specifies routing for replication. If not specified, the
   * "default" application profile will be used.
   * </pre>
   *
   * <code>string app_profile_id = 2;</code>
   *
   * @return The appProfileId.
   */
  java.lang.String getAppProfileId();
  /**
   *
   *
   * <pre>
   * This value specifies routing for replication. If not specified, the
   * "default" application profile will be used.
   * </pre>
   *
   * <code>string app_profile_id = 2;</code>
   *
   * @return The bytes for appProfileId.
   */
  com.google.protobuf.ByteString getAppProfileIdBytes();
}
