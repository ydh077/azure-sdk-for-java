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

package com.microsoft.windowsazure.management.network.models;

/**
* Parameters supplied to the Create Reserved IP operation.
*/
public class NetworkReservedIPCreateParameters {
    private String deploymentName;
    
    /**
    * Optional. The name of the deployment the IP belongs to, if used.
    * @return The DeploymentName value.
    */
    public String getDeploymentName() {
        return this.deploymentName;
    }
    
    /**
    * Optional. The name of the deployment the IP belongs to, if used.
    * @param deploymentNameValue The DeploymentName value.
    */
    public void setDeploymentName(final String deploymentNameValue) {
        this.deploymentName = deploymentNameValue;
    }
    
    private String label;
    
    /**
    * Optional. The friendly identifier for the site.
    * @return The Label value.
    */
    public String getLabel() {
        return this.label;
    }
    
    /**
    * Optional. The friendly identifier for the site.
    * @param labelValue The Label value.
    */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }
    
    private String location;
    
    /**
    * Optional. Location where the virtual network exists.
    * @return The Location value.
    */
    public String getLocation() {
        return this.location;
    }
    
    /**
    * Optional. Location where the virtual network exists.
    * @param locationValue The Location value.
    */
    public void setLocation(final String locationValue) {
        this.location = locationValue;
    }
    
    private String name;
    
    /**
    * Optional. Name of the reserved IP.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Name of the reserved IP.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String serviceName;
    
    /**
    * Optional. The name of the service the IP belongs to, if used.
    * @return The ServiceName value.
    */
    public String getServiceName() {
        return this.serviceName;
    }
    
    /**
    * Optional. The name of the service the IP belongs to, if used.
    * @param serviceNameValue The ServiceName value.
    */
    public void setServiceName(final String serviceNameValue) {
        this.serviceName = serviceNameValue;
    }
    
    private String virtualIPName;
    
    /**
    * Optional. The name of the virtual IP that we should reserve.
    * @return The VirtualIPName value.
    */
    public String getVirtualIPName() {
        return this.virtualIPName;
    }
    
    /**
    * Optional. The name of the virtual IP that we should reserve.
    * @param virtualIPNameValue The VirtualIPName value.
    */
    public void setVirtualIPName(final String virtualIPNameValue) {
        this.virtualIPName = virtualIPNameValue;
    }
}
