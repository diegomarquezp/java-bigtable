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
// source: google/bigtable/v2/data.proto

// Protobuf Java Version: 3.25.2
package com.google.bigtable.v2;

public interface MutationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.Mutation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Set a cell's value.
   * </pre>
   *
   * <code>.google.bigtable.v2.Mutation.SetCell set_cell = 1;</code>
   *
   * @return Whether the setCell field is set.
   */
  boolean hasSetCell();
  /**
   *
   *
   * <pre>
   * Set a cell's value.
   * </pre>
   *
   * <code>.google.bigtable.v2.Mutation.SetCell set_cell = 1;</code>
   *
   * @return The setCell.
   */
  com.google.bigtable.v2.Mutation.SetCell getSetCell();
  /**
   *
   *
   * <pre>
   * Set a cell's value.
   * </pre>
   *
   * <code>.google.bigtable.v2.Mutation.SetCell set_cell = 1;</code>
   */
  com.google.bigtable.v2.Mutation.SetCellOrBuilder getSetCellOrBuilder();

  /**
   *
   *
   * <pre>
   * Deletes cells from a column.
   * </pre>
   *
   * <code>.google.bigtable.v2.Mutation.DeleteFromColumn delete_from_column = 2;</code>
   *
   * @return Whether the deleteFromColumn field is set.
   */
  boolean hasDeleteFromColumn();
  /**
   *
   *
   * <pre>
   * Deletes cells from a column.
   * </pre>
   *
   * <code>.google.bigtable.v2.Mutation.DeleteFromColumn delete_from_column = 2;</code>
   *
   * @return The deleteFromColumn.
   */
  com.google.bigtable.v2.Mutation.DeleteFromColumn getDeleteFromColumn();
  /**
   *
   *
   * <pre>
   * Deletes cells from a column.
   * </pre>
   *
   * <code>.google.bigtable.v2.Mutation.DeleteFromColumn delete_from_column = 2;</code>
   */
  com.google.bigtable.v2.Mutation.DeleteFromColumnOrBuilder getDeleteFromColumnOrBuilder();

  /**
   *
   *
   * <pre>
   * Deletes cells from a column family.
   * </pre>
   *
   * <code>.google.bigtable.v2.Mutation.DeleteFromFamily delete_from_family = 3;</code>
   *
   * @return Whether the deleteFromFamily field is set.
   */
  boolean hasDeleteFromFamily();
  /**
   *
   *
   * <pre>
   * Deletes cells from a column family.
   * </pre>
   *
   * <code>.google.bigtable.v2.Mutation.DeleteFromFamily delete_from_family = 3;</code>
   *
   * @return The deleteFromFamily.
   */
  com.google.bigtable.v2.Mutation.DeleteFromFamily getDeleteFromFamily();
  /**
   *
   *
   * <pre>
   * Deletes cells from a column family.
   * </pre>
   *
   * <code>.google.bigtable.v2.Mutation.DeleteFromFamily delete_from_family = 3;</code>
   */
  com.google.bigtable.v2.Mutation.DeleteFromFamilyOrBuilder getDeleteFromFamilyOrBuilder();

  /**
   *
   *
   * <pre>
   * Deletes cells from the entire row.
   * </pre>
   *
   * <code>.google.bigtable.v2.Mutation.DeleteFromRow delete_from_row = 4;</code>
   *
   * @return Whether the deleteFromRow field is set.
   */
  boolean hasDeleteFromRow();
  /**
   *
   *
   * <pre>
   * Deletes cells from the entire row.
   * </pre>
   *
   * <code>.google.bigtable.v2.Mutation.DeleteFromRow delete_from_row = 4;</code>
   *
   * @return The deleteFromRow.
   */
  com.google.bigtable.v2.Mutation.DeleteFromRow getDeleteFromRow();
  /**
   *
   *
   * <pre>
   * Deletes cells from the entire row.
   * </pre>
   *
   * <code>.google.bigtable.v2.Mutation.DeleteFromRow delete_from_row = 4;</code>
   */
  com.google.bigtable.v2.Mutation.DeleteFromRowOrBuilder getDeleteFromRowOrBuilder();

  com.google.bigtable.v2.Mutation.MutationCase getMutationCase();
}
