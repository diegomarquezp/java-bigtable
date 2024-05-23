// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

// Protobuf Java Version: 3.25.3
package com.google.bigtable.admin.v2;

public interface CreateClusterMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.CreateClusterMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The request that prompted the initiation of this CreateCluster operation.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.CreateClusterRequest original_request = 1;</code>
   * @return Whether the originalRequest field is set.
   */
  boolean hasOriginalRequest();
  /**
   * <pre>
   * The request that prompted the initiation of this CreateCluster operation.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.CreateClusterRequest original_request = 1;</code>
   * @return The originalRequest.
   */
  com.google.bigtable.admin.v2.CreateClusterRequest getOriginalRequest();
  /**
   * <pre>
   * The request that prompted the initiation of this CreateCluster operation.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.CreateClusterRequest original_request = 1;</code>
   */
  com.google.bigtable.admin.v2.CreateClusterRequestOrBuilder getOriginalRequestOrBuilder();

  /**
   * <pre>
   * The time at which the original request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2;</code>
   * @return Whether the requestTime field is set.
   */
  boolean hasRequestTime();
  /**
   * <pre>
   * The time at which the original request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2;</code>
   * @return The requestTime.
   */
  com.google.protobuf.Timestamp getRequestTime();
  /**
   * <pre>
   * The time at which the original request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRequestTimeOrBuilder();

  /**
   * <pre>
   * The time at which the operation failed or was completed successfully.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 3;</code>
   * @return Whether the finishTime field is set.
   */
  boolean hasFinishTime();
  /**
   * <pre>
   * The time at which the operation failed or was completed successfully.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 3;</code>
   * @return The finishTime.
   */
  com.google.protobuf.Timestamp getFinishTime();
  /**
   * <pre>
   * The time at which the operation failed or was completed successfully.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getFinishTimeOrBuilder();

  /**
   * <pre>
   * Keys: the full `name` of each table that existed in the instance when
   * CreateCluster was first called, i.e.
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`. Any table added
   * to the instance by a later API call will be created in the new cluster by
   * that API call, not this one.
   *
   * Values: information on how much of a table's data has been copied to the
   * newly-created cluster so far.
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.CreateClusterMetadata.TableProgress&gt; tables = 4;</code>
   */
  int getTablesCount();
  /**
   * <pre>
   * Keys: the full `name` of each table that existed in the instance when
   * CreateCluster was first called, i.e.
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`. Any table added
   * to the instance by a later API call will be created in the new cluster by
   * that API call, not this one.
   *
   * Values: information on how much of a table's data has been copied to the
   * newly-created cluster so far.
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.CreateClusterMetadata.TableProgress&gt; tables = 4;</code>
   */
  boolean containsTables(
      java.lang.String key);
  /**
   * Use {@link #getTablesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.bigtable.admin.v2.CreateClusterMetadata.TableProgress>
  getTables();
  /**
   * <pre>
   * Keys: the full `name` of each table that existed in the instance when
   * CreateCluster was first called, i.e.
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`. Any table added
   * to the instance by a later API call will be created in the new cluster by
   * that API call, not this one.
   *
   * Values: information on how much of a table's data has been copied to the
   * newly-created cluster so far.
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.CreateClusterMetadata.TableProgress&gt; tables = 4;</code>
   */
  java.util.Map<java.lang.String, com.google.bigtable.admin.v2.CreateClusterMetadata.TableProgress>
  getTablesMap();
  /**
   * <pre>
   * Keys: the full `name` of each table that existed in the instance when
   * CreateCluster was first called, i.e.
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`. Any table added
   * to the instance by a later API call will be created in the new cluster by
   * that API call, not this one.
   *
   * Values: information on how much of a table's data has been copied to the
   * newly-created cluster so far.
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.CreateClusterMetadata.TableProgress&gt; tables = 4;</code>
   */
  /* nullable */
com.google.bigtable.admin.v2.CreateClusterMetadata.TableProgress getTablesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.bigtable.admin.v2.CreateClusterMetadata.TableProgress defaultValue);
  /**
   * <pre>
   * Keys: the full `name` of each table that existed in the instance when
   * CreateCluster was first called, i.e.
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`. Any table added
   * to the instance by a later API call will be created in the new cluster by
   * that API call, not this one.
   *
   * Values: information on how much of a table's data has been copied to the
   * newly-created cluster so far.
   * </pre>
   *
   * <code>map&lt;string, .google.bigtable.admin.v2.CreateClusterMetadata.TableProgress&gt; tables = 4;</code>
   */
  com.google.bigtable.admin.v2.CreateClusterMetadata.TableProgress getTablesOrThrow(
      java.lang.String key);
}
