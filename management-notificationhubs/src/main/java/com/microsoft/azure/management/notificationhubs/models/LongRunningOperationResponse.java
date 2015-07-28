/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.notificationhubs.models;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.core.OperationStatus;

/**
* A standard service response for long running operations.
*/
public class LongRunningOperationResponse extends OperationResponse {
    private ResourceError error;
    
    /**
    * Optional. Gets or sets error description of the opertion. Equals to null
    * is no errors.
    * @return The Error value.
    */
    public ResourceError getError() {
        return this.error;
    }
    
    /**
    * Optional. Gets or sets error description of the opertion. Equals to null
    * is no errors.
    * @param errorValue The Error value.
    */
    public void setError(final ResourceError errorValue) {
        this.error = errorValue;
    }
    
    private String operationStatusLink;
    
    /**
    * Optional. Gets or sets operation status link.
    * @return The OperationStatusLink value.
    */
    public String getOperationStatusLink() {
        return this.operationStatusLink;
    }
    
    /**
    * Optional. Gets or sets operation status link.
    * @param operationStatusLinkValue The OperationStatusLink value.
    */
    public void setOperationStatusLink(final String operationStatusLinkValue) {
        this.operationStatusLink = operationStatusLinkValue;
    }
    
    private int retryAfter;
    
    /**
    * Optional. Gets or sets the number of minutes to retry the operation after.
    * @return The RetryAfter value.
    */
    public int getRetryAfter() {
        return this.retryAfter;
    }
    
    /**
    * Optional. Gets or sets the number of minutes to retry the operation after.
    * @param retryAfterValue The RetryAfter value.
    */
    public void setRetryAfter(final int retryAfterValue) {
        this.retryAfter = retryAfterValue;
    }
    
    private OperationStatus status;
    
    /**
    * Optional. Gets or sets current status of the operation.
    * @return The Status value.
    */
    public OperationStatus getStatus() {
        return this.status;
    }
    
    /**
    * Optional. Gets or sets current status of the operation.
    * @param statusValue The Status value.
    */
    public void setStatus(final OperationStatus statusValue) {
        this.status = statusValue;
    }
}
