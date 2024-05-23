/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigtable.admin.v2.samples;

// [START bigtableadmin_v2_generated_BigtableInstanceAdmin_CreateAppProfile_sync]
import com.google.bigtable.admin.v2.AppProfile;
import com.google.bigtable.admin.v2.CreateAppProfileRequest;
import com.google.bigtable.admin.v2.InstanceName;
import com.google.cloud.bigtable.admin.v2.BaseBigtableInstanceAdminClient;

public class SyncCreateAppProfile {

  public static void main(String[] args) throws Exception {
    syncCreateAppProfile();
  }

  public static void syncCreateAppProfile() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BaseBigtableInstanceAdminClient baseBigtableInstanceAdminClient =
        BaseBigtableInstanceAdminClient.create()) {
      CreateAppProfileRequest request =
          CreateAppProfileRequest.newBuilder()
              .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
              .setAppProfileId("appProfileId704923523")
              .setAppProfile(AppProfile.newBuilder().build())
              .setIgnoreWarnings(true)
              .build();
      AppProfile response = baseBigtableInstanceAdminClient.createAppProfile(request);
    }
  }
}
// [END bigtableadmin_v2_generated_BigtableInstanceAdmin_CreateAppProfile_sync]
