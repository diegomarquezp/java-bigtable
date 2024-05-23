// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

// Protobuf Java Version: 3.25.3
package com.google.bigtable.admin.v2;

public interface GetAuthorizedViewRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.GetAuthorizedViewRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The unique name of the requested AuthorizedView.
   * Values are of the form
   * `projects/{project}/instances/{instance}/tables/{table}/authorizedViews/{authorized_view}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The unique name of the requested AuthorizedView.
   * Values are of the form
   * `projects/{project}/instances/{instance}/tables/{table}/authorizedViews/{authorized_view}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. The resource_view to be applied to the returned AuthorizedView's
   * fields. Default to BASIC.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AuthorizedView.ResponseView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * Optional. The resource_view to be applied to the returned AuthorizedView's
   * fields. Default to BASIC.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AuthorizedView.ResponseView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The view.
   */
  com.google.bigtable.admin.v2.AuthorizedView.ResponseView getView();
}
