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

package com.microsoft.azure.management.trafficmanager.models;

import com.microsoft.windowsazure.core.ResourceBaseExtended;

/**
* Class representing a Traffic Manager profile.
*/
public class Profile extends ResourceBaseExtended {
    private ProfileProperties properties;
    
    /**
    * Optional. Gets or sets the properties of the profile.
    * @return The Properties value.
    */
    public ProfileProperties getProperties() {
        return this.properties;
    }
    
    /**
    * Optional. Gets or sets the properties of the profile.
    * @param propertiesValue The Properties value.
    */
    public void setProperties(final ProfileProperties propertiesValue) {
        this.properties = propertiesValue;
    }
    
    /**
    * Initializes a new instance of the Profile class.
    *
    */
    public Profile() {
        super();
    }
    
    /**
    * Initializes a new instance of the Profile class with required arguments.
    *
    * @param location Gets or sets the location of the resource.
    */
    public Profile(String location) {
        this();
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setLocation(location);
    }
}
