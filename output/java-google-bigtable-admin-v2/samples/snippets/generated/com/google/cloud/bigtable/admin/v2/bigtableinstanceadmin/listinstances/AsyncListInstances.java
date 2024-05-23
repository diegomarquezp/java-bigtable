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

// [START bigtableadmin_v2_generated_BigtableInstanceAdmin_ListInstances_async]
import com.google.api.core.ApiFuture;
import com.google.bigtable.admin.v2.ListInstancesRequest;
import com.google.bigtable.admin.v2.ListInstancesResponse;
import com.google.bigtable.admin.v2.ProjectName;
import com.google.cloud.bigtable.admin.v2.BaseBigtableInstanceAdminClient;

public class AsyncListInstances {

  public static void main(String[] args) throws Exception {
    asyncListInstances();
  }

  public static void asyncListInstances() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BaseBigtableInstanceAdminClient baseBigtableInstanceAdminClient =
        BaseBigtableInstanceAdminClient.create()) {
      ListInstancesRequest request =
          ListInstancesRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<ListInstancesResponse> future =
          baseBigtableInstanceAdminClient.listInstancesCallable().futureCall(request);
      // Do something.
      ListInstancesResponse response = future.get();
    }
  }
}
// [END bigtableadmin_v2_generated_BigtableInstanceAdmin_ListInstances_async]
