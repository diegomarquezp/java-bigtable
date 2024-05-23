// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

// Protobuf Java Version: 3.25.3
package com.google.bigtable.v2;

public interface RowRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.RowRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   *
   * <code>bytes start_key_closed = 1;</code>
   * @return Whether the startKeyClosed field is set.
   */
  boolean hasStartKeyClosed();
  /**
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   *
   * <code>bytes start_key_closed = 1;</code>
   * @return The startKeyClosed.
   */
  com.google.protobuf.ByteString getStartKeyClosed();

  /**
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   *
   * <code>bytes start_key_open = 2;</code>
   * @return Whether the startKeyOpen field is set.
   */
  boolean hasStartKeyOpen();
  /**
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   *
   * <code>bytes start_key_open = 2;</code>
   * @return The startKeyOpen.
   */
  com.google.protobuf.ByteString getStartKeyOpen();

  /**
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   *
   * <code>bytes end_key_open = 3;</code>
   * @return Whether the endKeyOpen field is set.
   */
  boolean hasEndKeyOpen();
  /**
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   *
   * <code>bytes end_key_open = 3;</code>
   * @return The endKeyOpen.
   */
  com.google.protobuf.ByteString getEndKeyOpen();

  /**
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   *
   * <code>bytes end_key_closed = 4;</code>
   * @return Whether the endKeyClosed field is set.
   */
  boolean hasEndKeyClosed();
  /**
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   *
   * <code>bytes end_key_closed = 4;</code>
   * @return The endKeyClosed.
   */
  com.google.protobuf.ByteString getEndKeyClosed();

  com.google.bigtable.v2.RowRange.StartKeyCase getStartKeyCase();

  com.google.bigtable.v2.RowRange.EndKeyCase getEndKeyCase();
}
