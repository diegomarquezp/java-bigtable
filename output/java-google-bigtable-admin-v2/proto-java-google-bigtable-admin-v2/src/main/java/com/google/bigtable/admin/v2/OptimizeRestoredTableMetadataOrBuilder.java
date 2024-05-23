// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

// Protobuf Java Version: 3.25.3
package com.google.bigtable.admin.v2;

public interface OptimizeRestoredTableMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.OptimizeRestoredTableMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the restored table being optimized.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the restored table being optimized.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The progress of the post-restore optimizations.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.OperationProgress progress = 2;</code>
   * @return Whether the progress field is set.
   */
  boolean hasProgress();
  /**
   * <pre>
   * The progress of the post-restore optimizations.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.OperationProgress progress = 2;</code>
   * @return The progress.
   */
  com.google.bigtable.admin.v2.OperationProgress getProgress();
  /**
   * <pre>
   * The progress of the post-restore optimizations.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.OperationProgress progress = 2;</code>
   */
  com.google.bigtable.admin.v2.OperationProgressOrBuilder getProgressOrBuilder();
}
