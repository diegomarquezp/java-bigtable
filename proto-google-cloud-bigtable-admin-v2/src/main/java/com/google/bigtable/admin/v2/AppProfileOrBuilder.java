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
// source: google/bigtable/admin/v2/instance.proto

// Protobuf Java Version: 3.25.3
package com.google.bigtable.admin.v2;

public interface AppProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.AppProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique name of the app profile. Values are of the form
   * `projects/{project}/instances/{instance}/appProfiles/[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique name of the app profile. Values are of the form
   * `projects/{project}/instances/{instance}/appProfiles/[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Strongly validated etag for optimistic concurrency control. Preserve the
   * value returned from `GetAppProfile` when calling `UpdateAppProfile` to
   * fail the request if there has been a modification in the mean time. The
   * `update_mask` of the request need not include `etag` for this protection
   * to apply.
   * See [Wikipedia](https://en.wikipedia.org/wiki/HTTP_ETag) and
   * [RFC 7232](https://tools.ietf.org/html/rfc7232#section-2.3) for more
   * details.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Strongly validated etag for optimistic concurrency control. Preserve the
   * value returned from `GetAppProfile` when calling `UpdateAppProfile` to
   * fail the request if there has been a modification in the mean time. The
   * `update_mask` of the request need not include `etag` for this protection
   * to apply.
   * See [Wikipedia](https://en.wikipedia.org/wiki/HTTP_ETag) and
   * [RFC 7232](https://tools.ietf.org/html/rfc7232#section-2.3) for more
   * details.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Long form description of the use case for this AppProfile.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Long form description of the use case for this AppProfile.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Use a multi-cluster routing policy.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.AppProfile.MultiClusterRoutingUseAny multi_cluster_routing_use_any = 5;
   * </code>
   *
   * @return Whether the multiClusterRoutingUseAny field is set.
   */
  boolean hasMultiClusterRoutingUseAny();
  /**
   *
   *
   * <pre>
   * Use a multi-cluster routing policy.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.AppProfile.MultiClusterRoutingUseAny multi_cluster_routing_use_any = 5;
   * </code>
   *
   * @return The multiClusterRoutingUseAny.
   */
  com.google.bigtable.admin.v2.AppProfile.MultiClusterRoutingUseAny getMultiClusterRoutingUseAny();
  /**
   *
   *
   * <pre>
   * Use a multi-cluster routing policy.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.AppProfile.MultiClusterRoutingUseAny multi_cluster_routing_use_any = 5;
   * </code>
   */
  com.google.bigtable.admin.v2.AppProfile.MultiClusterRoutingUseAnyOrBuilder
      getMultiClusterRoutingUseAnyOrBuilder();

  /**
   *
   *
   * <pre>
   * Use a single-cluster routing policy.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.SingleClusterRouting single_cluster_routing = 6;
   * </code>
   *
   * @return Whether the singleClusterRouting field is set.
   */
  boolean hasSingleClusterRouting();
  /**
   *
   *
   * <pre>
   * Use a single-cluster routing policy.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.SingleClusterRouting single_cluster_routing = 6;
   * </code>
   *
   * @return The singleClusterRouting.
   */
  com.google.bigtable.admin.v2.AppProfile.SingleClusterRouting getSingleClusterRouting();
  /**
   *
   *
   * <pre>
   * Use a single-cluster routing policy.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.SingleClusterRouting single_cluster_routing = 6;
   * </code>
   */
  com.google.bigtable.admin.v2.AppProfile.SingleClusterRoutingOrBuilder
      getSingleClusterRoutingOrBuilder();

  /**
   *
   *
   * <pre>
   * This field has been deprecated in favor of `standard_isolation.priority`.
   * If you set this field, `standard_isolation.priority` will be set instead.
   *
   * The priority of requests sent using this app profile.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.Priority priority = 7 [deprecated = true];</code>
   *
   * @deprecated google.bigtable.admin.v2.AppProfile.priority is deprecated. See
   *     google/bigtable/admin/v2/instance.proto;l=361
   * @return Whether the priority field is set.
   */
  @java.lang.Deprecated
  boolean hasPriority();
  /**
   *
   *
   * <pre>
   * This field has been deprecated in favor of `standard_isolation.priority`.
   * If you set this field, `standard_isolation.priority` will be set instead.
   *
   * The priority of requests sent using this app profile.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.Priority priority = 7 [deprecated = true];</code>
   *
   * @deprecated google.bigtable.admin.v2.AppProfile.priority is deprecated. See
   *     google/bigtable/admin/v2/instance.proto;l=361
   * @return The enum numeric value on the wire for priority.
   */
  @java.lang.Deprecated
  int getPriorityValue();
  /**
   *
   *
   * <pre>
   * This field has been deprecated in favor of `standard_isolation.priority`.
   * If you set this field, `standard_isolation.priority` will be set instead.
   *
   * The priority of requests sent using this app profile.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.Priority priority = 7 [deprecated = true];</code>
   *
   * @deprecated google.bigtable.admin.v2.AppProfile.priority is deprecated. See
   *     google/bigtable/admin/v2/instance.proto;l=361
   * @return The priority.
   */
  @java.lang.Deprecated
  com.google.bigtable.admin.v2.AppProfile.Priority getPriority();

  /**
   *
   *
   * <pre>
   * The standard options used for isolating this app profile's traffic from
   * other use cases.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.StandardIsolation standard_isolation = 11;</code>
   *
   * @return Whether the standardIsolation field is set.
   */
  boolean hasStandardIsolation();
  /**
   *
   *
   * <pre>
   * The standard options used for isolating this app profile's traffic from
   * other use cases.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.StandardIsolation standard_isolation = 11;</code>
   *
   * @return The standardIsolation.
   */
  com.google.bigtable.admin.v2.AppProfile.StandardIsolation getStandardIsolation();
  /**
   *
   *
   * <pre>
   * The standard options used for isolating this app profile's traffic from
   * other use cases.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile.StandardIsolation standard_isolation = 11;</code>
   */
  com.google.bigtable.admin.v2.AppProfile.StandardIsolationOrBuilder
      getStandardIsolationOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies that this app profile is intended for read-only usage via the
   * Data Boost feature.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.AppProfile.DataBoostIsolationReadOnly data_boost_isolation_read_only = 10;
   * </code>
   *
   * @return Whether the dataBoostIsolationReadOnly field is set.
   */
  boolean hasDataBoostIsolationReadOnly();
  /**
   *
   *
   * <pre>
   * Specifies that this app profile is intended for read-only usage via the
   * Data Boost feature.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.AppProfile.DataBoostIsolationReadOnly data_boost_isolation_read_only = 10;
   * </code>
   *
   * @return The dataBoostIsolationReadOnly.
   */
  com.google.bigtable.admin.v2.AppProfile.DataBoostIsolationReadOnly
      getDataBoostIsolationReadOnly();
  /**
   *
   *
   * <pre>
   * Specifies that this app profile is intended for read-only usage via the
   * Data Boost feature.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.AppProfile.DataBoostIsolationReadOnly data_boost_isolation_read_only = 10;
   * </code>
   */
  com.google.bigtable.admin.v2.AppProfile.DataBoostIsolationReadOnlyOrBuilder
      getDataBoostIsolationReadOnlyOrBuilder();

  com.google.bigtable.admin.v2.AppProfile.RoutingPolicyCase getRoutingPolicyCase();

  com.google.bigtable.admin.v2.AppProfile.IsolationCase getIsolationCase();
}
