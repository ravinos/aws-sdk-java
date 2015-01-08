/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Tags Request Marshaller
 */
public class CreateTagsRequestMarshaller implements Marshaller<Request<CreateTagsRequest>, CreateTagsRequest> {

    public Request<CreateTagsRequest> marshall(CreateTagsRequest createTagsRequest) {

        if (createTagsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTagsRequest> request = new DefaultRequest<CreateTagsRequest>(createTagsRequest, "AmazonEC2");
        request.addParameter("Action", "CreateTags");
        request.addParameter("Version", "2014-10-01");

        java.util.List<String> resourcesList = createTagsRequest.getResources();
        int resourcesListIndex = 1;

        for (String resourcesListValue : resourcesList) {
            if (resourcesListValue != null) {
                request.addParameter("ResourceId." + resourcesListIndex, StringUtils.fromString(resourcesListValue));
            }

            resourcesListIndex++;
        }

        java.util.List<Tag> tagsList = createTagsRequest.getTags();
        int tagsListIndex = 1;

        for (Tag tagsListValue : tagsList) {
            Tag tagMember = tagsListValue;
            if (tagMember != null) {
                if (tagMember.getKey() != null) {
                    request.addParameter("Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagMember.getKey()));
                }
                if (tagMember.getValue() != null) {
                    request.addParameter("Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagMember.getValue()));
                }
            }

            tagsListIndex++;
        }

        return request;
    }
}
