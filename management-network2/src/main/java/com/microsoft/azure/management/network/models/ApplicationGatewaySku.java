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
* SKU of application gateway
*/
public class ApplicationGatewaySku {
    private int capacity;
    
    /**
    * Optional. Gets or sets capacity (instance count) of application gateway
    * @return The Capacity value.
    */
    public int getCapacity() {
        return this.capacity;
    }
    
    /**
    * Optional. Gets or sets capacity (instance count) of application gateway
    * @param capacityValue The Capacity value.
    */
    public void setCapacity(final int capacityValue) {
        this.capacity = capacityValue;
    }
    
    private String name;
    
    /**
    * Optional. Gets or sets name of application gateway SKU
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Gets or sets name of application gateway SKU
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String tier;
    
    /**
    * Optional. Gets or sets tier of application gateway
    * @return The Tier value.
    */
    public String getTier() {
        return this.tier;
    }
    
    /**
    * Optional. Gets or sets tier of application gateway
    * @param tierValue The Tier value.
    */
    public void setTier(final String tierValue) {
        this.tier = tierValue;
    }
}
