// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

// Protobuf Java Version: 3.25.3
package com.google.bigtable.admin.v2;

public interface DeleteAppProfileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.DeleteAppProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The unique name of the app profile to be deleted. Values are of
   * the form
   * `projects/{project}/instances/{instance}/appProfiles/{app_profile}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The unique name of the app profile to be deleted. Values are of
   * the form
   * `projects/{project}/instances/{instance}/appProfiles/{app_profile}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. If true, ignore safety checks when deleting the app profile.
   * </pre>
   *
   * <code>bool ignore_warnings = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The ignoreWarnings.
   */
  boolean getIgnoreWarnings();
}
