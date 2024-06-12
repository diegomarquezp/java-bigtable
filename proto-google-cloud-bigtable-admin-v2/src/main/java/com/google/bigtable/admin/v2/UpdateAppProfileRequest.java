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

/**
 *
 *
 * <pre>
 * Request message for BigtableInstanceAdmin.UpdateAppProfile.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.admin.v2.UpdateAppProfileRequest}
 */
public final class UpdateAppProfileRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.v2.UpdateAppProfileRequest)
    UpdateAppProfileRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateAppProfileRequest.newBuilder() to construct.
  private UpdateAppProfileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateAppProfileRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateAppProfileRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.bigtable.admin.v2.BigtableInstanceAdminProto
        .internal_static_google_bigtable_admin_v2_UpdateAppProfileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.v2.BigtableInstanceAdminProto
        .internal_static_google_bigtable_admin_v2_UpdateAppProfileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.v2.UpdateAppProfileRequest.class,
            com.google.bigtable.admin.v2.UpdateAppProfileRequest.Builder.class);
  }

  private int bitField0_;
  public static final int APP_PROFILE_FIELD_NUMBER = 1;
  private com.google.bigtable.admin.v2.AppProfile appProfile_;
  /**
   *
   *
   * <pre>
   * Required. The app profile which will (partially) replace the current value.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.AppProfile app_profile = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the appProfile field is set.
   */
  @java.lang.Override
  public boolean hasAppProfile() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The app profile which will (partially) replace the current value.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.AppProfile app_profile = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The appProfile.
   */
  @java.lang.Override
  public com.google.bigtable.admin.v2.AppProfile getAppProfile() {
    return appProfile_ == null
        ? com.google.bigtable.admin.v2.AppProfile.getDefaultInstance()
        : appProfile_;
  }
  /**
   *
   *
   * <pre>
   * Required. The app profile which will (partially) replace the current value.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.AppProfile app_profile = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.bigtable.admin.v2.AppProfileOrBuilder getAppProfileOrBuilder() {
    return appProfile_ == null
        ? com.google.bigtable.admin.v2.AppProfile.getDefaultInstance()
        : appProfile_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. The subset of app profile fields which should be replaced.
   * If unset, all fields will be replaced.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The subset of app profile fields which should be replaced.
   * If unset, all fields will be replaced.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. The subset of app profile fields which should be replaced.
   * If unset, all fields will be replaced.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int IGNORE_WARNINGS_FIELD_NUMBER = 3;
  private boolean ignoreWarnings_ = false;
  /**
   *
   *
   * <pre>
   * If true, ignore safety checks when updating the app profile.
   * </pre>
   *
   * <code>bool ignore_warnings = 3;</code>
   *
   * @return The ignoreWarnings.
   */
  @java.lang.Override
  public boolean getIgnoreWarnings() {
    return ignoreWarnings_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getAppProfile());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    if (ignoreWarnings_ != false) {
      output.writeBool(3, ignoreWarnings_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAppProfile());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (ignoreWarnings_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, ignoreWarnings_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.bigtable.admin.v2.UpdateAppProfileRequest)) {
      return super.equals(obj);
    }
    com.google.bigtable.admin.v2.UpdateAppProfileRequest other =
        (com.google.bigtable.admin.v2.UpdateAppProfileRequest) obj;

    if (hasAppProfile() != other.hasAppProfile()) return false;
    if (hasAppProfile()) {
      if (!getAppProfile().equals(other.getAppProfile())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (getIgnoreWarnings() != other.getIgnoreWarnings()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAppProfile()) {
      hash = (37 * hash) + APP_PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getAppProfile().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + IGNORE_WARNINGS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIgnoreWarnings());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.admin.v2.UpdateAppProfileRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.UpdateAppProfileRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.UpdateAppProfileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.UpdateAppProfileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.UpdateAppProfileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.UpdateAppProfileRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.UpdateAppProfileRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.UpdateAppProfileRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.UpdateAppProfileRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.UpdateAppProfileRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.UpdateAppProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.UpdateAppProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.bigtable.admin.v2.UpdateAppProfileRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for BigtableInstanceAdmin.UpdateAppProfile.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.admin.v2.UpdateAppProfileRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.v2.UpdateAppProfileRequest)
      com.google.bigtable.admin.v2.UpdateAppProfileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto
          .internal_static_google_bigtable_admin_v2_UpdateAppProfileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto
          .internal_static_google_bigtable_admin_v2_UpdateAppProfileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.v2.UpdateAppProfileRequest.class,
              com.google.bigtable.admin.v2.UpdateAppProfileRequest.Builder.class);
    }

    // Construct using com.google.bigtable.admin.v2.UpdateAppProfileRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAppProfileFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      appProfile_ = null;
      if (appProfileBuilder_ != null) {
        appProfileBuilder_.dispose();
        appProfileBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      ignoreWarnings_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto
          .internal_static_google_bigtable_admin_v2_UpdateAppProfileRequest_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.UpdateAppProfileRequest getDefaultInstanceForType() {
      return com.google.bigtable.admin.v2.UpdateAppProfileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.UpdateAppProfileRequest build() {
      com.google.bigtable.admin.v2.UpdateAppProfileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.UpdateAppProfileRequest buildPartial() {
      com.google.bigtable.admin.v2.UpdateAppProfileRequest result =
          new com.google.bigtable.admin.v2.UpdateAppProfileRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.bigtable.admin.v2.UpdateAppProfileRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.appProfile_ = appProfileBuilder_ == null ? appProfile_ : appProfileBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ignoreWarnings_ = ignoreWarnings_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.v2.UpdateAppProfileRequest) {
        return mergeFrom((com.google.bigtable.admin.v2.UpdateAppProfileRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.v2.UpdateAppProfileRequest other) {
      if (other == com.google.bigtable.admin.v2.UpdateAppProfileRequest.getDefaultInstance())
        return this;
      if (other.hasAppProfile()) {
        mergeAppProfile(other.getAppProfile());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getIgnoreWarnings() != false) {
        setIgnoreWarnings(other.getIgnoreWarnings());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getAppProfileFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                ignoreWarnings_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.bigtable.admin.v2.AppProfile appProfile_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.bigtable.admin.v2.AppProfile,
            com.google.bigtable.admin.v2.AppProfile.Builder,
            com.google.bigtable.admin.v2.AppProfileOrBuilder>
        appProfileBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The app profile which will (partially) replace the current value.
     * </pre>
     *
     * <code>
     * .google.bigtable.admin.v2.AppProfile app_profile = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the appProfile field is set.
     */
    public boolean hasAppProfile() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The app profile which will (partially) replace the current value.
     * </pre>
     *
     * <code>
     * .google.bigtable.admin.v2.AppProfile app_profile = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The appProfile.
     */
    public com.google.bigtable.admin.v2.AppProfile getAppProfile() {
      if (appProfileBuilder_ == null) {
        return appProfile_ == null
            ? com.google.bigtable.admin.v2.AppProfile.getDefaultInstance()
            : appProfile_;
      } else {
        return appProfileBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The app profile which will (partially) replace the current value.
     * </pre>
     *
     * <code>
     * .google.bigtable.admin.v2.AppProfile app_profile = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAppProfile(com.google.bigtable.admin.v2.AppProfile value) {
      if (appProfileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        appProfile_ = value;
      } else {
        appProfileBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The app profile which will (partially) replace the current value.
     * </pre>
     *
     * <code>
     * .google.bigtable.admin.v2.AppProfile app_profile = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAppProfile(com.google.bigtable.admin.v2.AppProfile.Builder builderForValue) {
      if (appProfileBuilder_ == null) {
        appProfile_ = builderForValue.build();
      } else {
        appProfileBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The app profile which will (partially) replace the current value.
     * </pre>
     *
     * <code>
     * .google.bigtable.admin.v2.AppProfile app_profile = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAppProfile(com.google.bigtable.admin.v2.AppProfile value) {
      if (appProfileBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && appProfile_ != null
            && appProfile_ != com.google.bigtable.admin.v2.AppProfile.getDefaultInstance()) {
          getAppProfileBuilder().mergeFrom(value);
        } else {
          appProfile_ = value;
        }
      } else {
        appProfileBuilder_.mergeFrom(value);
      }
      if (appProfile_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The app profile which will (partially) replace the current value.
     * </pre>
     *
     * <code>
     * .google.bigtable.admin.v2.AppProfile app_profile = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAppProfile() {
      bitField0_ = (bitField0_ & ~0x00000001);
      appProfile_ = null;
      if (appProfileBuilder_ != null) {
        appProfileBuilder_.dispose();
        appProfileBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The app profile which will (partially) replace the current value.
     * </pre>
     *
     * <code>
     * .google.bigtable.admin.v2.AppProfile app_profile = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.bigtable.admin.v2.AppProfile.Builder getAppProfileBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAppProfileFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The app profile which will (partially) replace the current value.
     * </pre>
     *
     * <code>
     * .google.bigtable.admin.v2.AppProfile app_profile = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.bigtable.admin.v2.AppProfileOrBuilder getAppProfileOrBuilder() {
      if (appProfileBuilder_ != null) {
        return appProfileBuilder_.getMessageOrBuilder();
      } else {
        return appProfile_ == null
            ? com.google.bigtable.admin.v2.AppProfile.getDefaultInstance()
            : appProfile_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The app profile which will (partially) replace the current value.
     * </pre>
     *
     * <code>
     * .google.bigtable.admin.v2.AppProfile app_profile = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.bigtable.admin.v2.AppProfile,
            com.google.bigtable.admin.v2.AppProfile.Builder,
            com.google.bigtable.admin.v2.AppProfileOrBuilder>
        getAppProfileFieldBuilder() {
      if (appProfileBuilder_ == null) {
        appProfileBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.bigtable.admin.v2.AppProfile,
                com.google.bigtable.admin.v2.AppProfile.Builder,
                com.google.bigtable.admin.v2.AppProfileOrBuilder>(
                getAppProfile(), getParentForChildren(), isClean());
        appProfile_ = null;
      }
      return appProfileBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The subset of app profile fields which should be replaced.
     * If unset, all fields will be replaced.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The subset of app profile fields which should be replaced.
     * If unset, all fields will be replaced.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The subset of app profile fields which should be replaced.
     * If unset, all fields will be replaced.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subset of app profile fields which should be replaced.
     * If unset, all fields will be replaced.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subset of app profile fields which should be replaced.
     * If unset, all fields will be replaced.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subset of app profile fields which should be replaced.
     * If unset, all fields will be replaced.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The subset of app profile fields which should be replaced.
     * If unset, all fields will be replaced.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The subset of app profile fields which should be replaced.
     * If unset, all fields will be replaced.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The subset of app profile fields which should be replaced.
     * If unset, all fields will be replaced.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private boolean ignoreWarnings_;
    /**
     *
     *
     * <pre>
     * If true, ignore safety checks when updating the app profile.
     * </pre>
     *
     * <code>bool ignore_warnings = 3;</code>
     *
     * @return The ignoreWarnings.
     */
    @java.lang.Override
    public boolean getIgnoreWarnings() {
      return ignoreWarnings_;
    }
    /**
     *
     *
     * <pre>
     * If true, ignore safety checks when updating the app profile.
     * </pre>
     *
     * <code>bool ignore_warnings = 3;</code>
     *
     * @param value The ignoreWarnings to set.
     * @return This builder for chaining.
     */
    public Builder setIgnoreWarnings(boolean value) {

      ignoreWarnings_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, ignore safety checks when updating the app profile.
     * </pre>
     *
     * <code>bool ignore_warnings = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIgnoreWarnings() {
      bitField0_ = (bitField0_ & ~0x00000004);
      ignoreWarnings_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.v2.UpdateAppProfileRequest)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.v2.UpdateAppProfileRequest)
  private static final com.google.bigtable.admin.v2.UpdateAppProfileRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.v2.UpdateAppProfileRequest();
  }

  public static com.google.bigtable.admin.v2.UpdateAppProfileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAppProfileRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateAppProfileRequest>() {
        @java.lang.Override
        public UpdateAppProfileRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateAppProfileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAppProfileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.admin.v2.UpdateAppProfileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
