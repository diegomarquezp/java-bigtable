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
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

// Protobuf Java Version: 3.25.3
package com.google.bigtable.admin.v2;

public interface CreateInstanceMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.CreateInstanceMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The request that prompted the initiation of this CreateInstance operation.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.CreateInstanceRequest original_request = 1;</code>
   *
   * @return Whether the originalRequest field is set.
   */
  boolean hasOriginalRequest();
  /**
   *
   *
   * <pre>
   * The request that prompted the initiation of this CreateInstance operation.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.CreateInstanceRequest original_request = 1;</code>
   *
   * @return The originalRequest.
   */
  com.google.bigtable.admin.v2.CreateInstanceRequest getOriginalRequest();
  /**
   *
   *
   * <pre>
   * The request that prompted the initiation of this CreateInstance operation.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.CreateInstanceRequest original_request = 1;</code>
   */
  com.google.bigtable.admin.v2.CreateInstanceRequestOrBuilder getOriginalRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which the original request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2;</code>
   *
   * @return Whether the requestTime field is set.
   */
  boolean hasRequestTime();
  /**
   *
   *
   * <pre>
   * The time at which the original request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2;</code>
   *
   * @return The requestTime.
   */
  com.google.protobuf.Timestamp getRequestTime();
  /**
   *
   *
   * <pre>
   * The time at which the original request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRequestTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which the operation failed or was completed successfully.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 3;</code>
   *
   * @return Whether the finishTime field is set.
   */
  boolean hasFinishTime();
  /**
   *
   *
   * <pre>
   * The time at which the operation failed or was completed successfully.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 3;</code>
   *
   * @return The finishTime.
   */
  com.google.protobuf.Timestamp getFinishTime();
  /**
   *
   *
   * <pre>
   * The time at which the operation failed or was completed successfully.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getFinishTimeOrBuilder();
}
