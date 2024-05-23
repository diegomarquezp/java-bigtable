// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/bigtable.proto

// Protobuf Java Version: 3.25.3
package com.google.bigtable.v2;

public interface SampleRowKeysResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.SampleRowKeysResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Sorted streamed sequence of sample row keys in the table. The table might
   * have contents before the first row key in the list and after the last one,
   * but a key containing the empty string indicates "end of table" and will be
   * the last response given, if present.
   * Note that row keys in this list may not have ever been written to or read
   * from, and users should therefore not make any assumptions about the row key
   * structure that are specific to their use case.
   * </pre>
   *
   * <code>bytes row_key = 1;</code>
   * @return The rowKey.
   */
  com.google.protobuf.ByteString getRowKey();

  /**
   * <pre>
   * Approximate total storage space used by all rows in the table which precede
   * `row_key`. Buffering the contents of all rows between two subsequent
   * samples would require space roughly equal to the difference in their
   * `offset_bytes` fields.
   * </pre>
   *
   * <code>int64 offset_bytes = 2;</code>
   * @return The offsetBytes.
   */
  long getOffsetBytes();
}
