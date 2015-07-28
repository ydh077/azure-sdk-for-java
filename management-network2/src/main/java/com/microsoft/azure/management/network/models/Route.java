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

package com.microsoft.azure.management.network.models;

/**
* Route resource
*/
public class Route extends ChildResource {
    private String addressPrefix;
    
    /**
    * Optional. Gets or sets the destination CIDR to which the route applies.
    * @return The AddressPrefix value.
    */
    public String getAddressPrefix() {
        return this.addressPrefix;
    }
    
    /**
    * Optional. Gets or sets the destination CIDR to which the route applies.
    * @param addressPrefixValue The AddressPrefix value.
    */
    public void setAddressPrefix(final String addressPrefixValue) {
        this.addressPrefix = addressPrefixValue;
    }
    
    private String nextHopIpAddress;
    
    /**
    * Optional. Gets or sets the IP address packets should be forwarded to.
    * Next hop values are only allowed in routes where the next hop type is
    * VirtualAppliance.
    * @return The NextHopIpAddress value.
    */
    public String getNextHopIpAddress() {
        return this.nextHopIpAddress;
    }
    
    /**
    * Optional. Gets or sets the IP address packets should be forwarded to.
    * Next hop values are only allowed in routes where the next hop type is
    * VirtualAppliance.
    * @param nextHopIpAddressValue The NextHopIpAddress value.
    */
    public void setNextHopIpAddress(final String nextHopIpAddressValue) {
        this.nextHopIpAddress = nextHopIpAddressValue;
    }
    
    private String nextHopType;
    
    /**
    * Required. Gets or sets the type of Azure hop the packet should be sent to.
    * @return The NextHopType value.
    */
    public String getNextHopType() {
        return this.nextHopType;
    }
    
    /**
    * Required. Gets or sets the type of Azure hop the packet should be sent to.
    * @param nextHopTypeValue The NextHopType value.
    */
    public void setNextHopType(final String nextHopTypeValue) {
        this.nextHopType = nextHopTypeValue;
    }
    
    private String provisioningState;
    
    /**
    * Optional. Gets or sets Provisioning state of the resource
    * Updating/Deleting/Failed
    * @return The ProvisioningState value.
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    
    /**
    * Optional. Gets or sets Provisioning state of the resource
    * Updating/Deleting/Failed
    * @param provisioningStateValue The ProvisioningState value.
    */
    public void setProvisioningState(final String provisioningStateValue) {
        this.provisioningState = provisioningStateValue;
    }
    
    /**
    * Initializes a new instance of the Route class.
    *
    */
    public Route() {
        super();
    }
    
    /**
    * Initializes a new instance of the Route class with required arguments.
    *
    * @param nextHopType Gets or sets the type of Azure hop the packet should
    * be sent to.
    */
    public Route(String nextHopType) {
        if (nextHopType == null) {
            throw new NullPointerException("nextHopType");
        }
        this.setNextHopType(nextHopType);
    }
}
