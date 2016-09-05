/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.implementation;

import com.microsoft.azure.management.batch.AccountProvisioningState;
import com.microsoft.azure.management.batch.AutoStorageProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Contains information about an Azure Batch account.
 */
@JsonFlatten
public class AccountResourceInner extends Resource {
    /**
     * The endpoint used by this account to interact with the Batch services.
     */
    @JsonProperty(value = "properties.accountEndpoint")
    private String accountEndpoint;

    /**
     * The provisioned state of the resource. Possible values include:
     * 'Invalid', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Cancelled'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private AccountProvisioningState provisioningState;

    /**
     * The properties and status of any auto storage account associated with
     * the account.
     */
    @JsonProperty(value = "properties.autoStorage")
    private AutoStorageProperties autoStorage;

    /**
     * The core quota for this Batch account.
     */
    @JsonProperty(value = "properties.coreQuota", required = true)
    private int coreQuota;

    /**
     * The pool quota for this Batch account.
     */
    @JsonProperty(value = "properties.poolQuota", required = true)
    private int poolQuota;

    /**
     * The active job and job schedule quota for this Batch account.
     */
    @JsonProperty(value = "properties.activeJobAndJobScheduleQuota", required = true)
    private int activeJobAndJobScheduleQuota;

    /**
     * Get the accountEndpoint value.
     *
     * @return the accountEndpoint value
     */
    public String accountEndpoint() {
        return this.accountEndpoint;
    }

    /**
     * Set the accountEndpoint value.
     *
     * @param accountEndpoint the accountEndpoint value to set
     * @return the AccountResourceInner object itself.
     */
    public AccountResourceInner withAccountEndpoint(String accountEndpoint) {
        this.accountEndpoint = accountEndpoint;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public AccountProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the AccountResourceInner object itself.
     */
    public AccountResourceInner withProvisioningState(AccountProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the autoStorage value.
     *
     * @return the autoStorage value
     */
    public AutoStorageProperties autoStorage() {
        return this.autoStorage;
    }

    /**
     * Set the autoStorage value.
     *
     * @param autoStorage the autoStorage value to set
     * @return the AccountResourceInner object itself.
     */
    public AccountResourceInner withAutoStorage(AutoStorageProperties autoStorage) {
        this.autoStorage = autoStorage;
        return this;
    }

    /**
     * Get the coreQuota value.
     *
     * @return the coreQuota value
     */
    public int coreQuota() {
        return this.coreQuota;
    }

    /**
     * Set the coreQuota value.
     *
     * @param coreQuota the coreQuota value to set
     * @return the AccountResourceInner object itself.
     */
    public AccountResourceInner withCoreQuota(int coreQuota) {
        this.coreQuota = coreQuota;
        return this;
    }

    /**
     * Get the poolQuota value.
     *
     * @return the poolQuota value
     */
    public int poolQuota() {
        return this.poolQuota;
    }

    /**
     * Set the poolQuota value.
     *
     * @param poolQuota the poolQuota value to set
     * @return the AccountResourceInner object itself.
     */
    public AccountResourceInner withPoolQuota(int poolQuota) {
        this.poolQuota = poolQuota;
        return this;
    }

    /**
     * Get the activeJobAndJobScheduleQuota value.
     *
     * @return the activeJobAndJobScheduleQuota value
     */
    public int activeJobAndJobScheduleQuota() {
        return this.activeJobAndJobScheduleQuota;
    }

    /**
     * Set the activeJobAndJobScheduleQuota value.
     *
     * @param activeJobAndJobScheduleQuota the activeJobAndJobScheduleQuota value to set
     * @return the AccountResourceInner object itself.
     */
    public AccountResourceInner withActiveJobAndJobScheduleQuota(int activeJobAndJobScheduleQuota) {
        this.activeJobAndJobScheduleQuota = activeJobAndJobScheduleQuota;
        return this;
    }

}
