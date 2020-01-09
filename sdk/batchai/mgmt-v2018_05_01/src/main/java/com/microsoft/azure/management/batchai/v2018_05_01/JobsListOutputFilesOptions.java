/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for listOutputFiles operation.
 */
public class JobsListOutputFilesOptions {
    /**
     * Id of the job output directory. This is the OutputDirectory--&gt;id
     * parameter that is given by the user during Create Job.
     */
    @JsonProperty(value = "", required = true)
    private String outputdirectoryid;

    /**
     * The path to the directory.
     */
    @JsonProperty(value = "")
    private String directory;

    /**
     * The number of minutes after which the download link will expire.
     */
    @JsonProperty(value = "")
    private Integer linkexpiryinminutes;

    /**
     * The maximum number of items to return in the response. A maximum of 1000
     * files can be returned.
     */
    @JsonProperty(value = "")
    private Integer maxResults;

    /**
     * Get id of the job output directory. This is the OutputDirectory--&gt;id parameter that is given by the user during Create Job.
     *
     * @return the outputdirectoryid value
     */
    public String outputdirectoryid() {
        return this.outputdirectoryid;
    }

    /**
     * Set id of the job output directory. This is the OutputDirectory--&gt;id parameter that is given by the user during Create Job.
     *
     * @param outputdirectoryid the outputdirectoryid value to set
     * @return the JobsListOutputFilesOptions object itself.
     */
    public JobsListOutputFilesOptions withOutputdirectoryid(String outputdirectoryid) {
        this.outputdirectoryid = outputdirectoryid;
        return this;
    }

    /**
     * Get the path to the directory.
     *
     * @return the directory value
     */
    public String directory() {
        return this.directory;
    }

    /**
     * Set the path to the directory.
     *
     * @param directory the directory value to set
     * @return the JobsListOutputFilesOptions object itself.
     */
    public JobsListOutputFilesOptions withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * Get the number of minutes after which the download link will expire.
     *
     * @return the linkexpiryinminutes value
     */
    public Integer linkexpiryinminutes() {
        return this.linkexpiryinminutes;
    }

    /**
     * Set the number of minutes after which the download link will expire.
     *
     * @param linkexpiryinminutes the linkexpiryinminutes value to set
     * @return the JobsListOutputFilesOptions object itself.
     */
    public JobsListOutputFilesOptions withLinkexpiryinminutes(Integer linkexpiryinminutes) {
        this.linkexpiryinminutes = linkexpiryinminutes;
        return this;
    }

    /**
     * Get the maximum number of items to return in the response. A maximum of 1000 files can be returned.
     *
     * @return the maxResults value
     */
    public Integer maxResults() {
        return this.maxResults;
    }

    /**
     * Set the maximum number of items to return in the response. A maximum of 1000 files can be returned.
     *
     * @param maxResults the maxResults value to set
     * @return the JobsListOutputFilesOptions object itself.
     */
    public JobsListOutputFilesOptions withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

}