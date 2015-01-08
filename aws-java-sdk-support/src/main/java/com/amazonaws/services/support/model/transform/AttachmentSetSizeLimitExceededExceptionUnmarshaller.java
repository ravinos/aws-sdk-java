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
package com.amazonaws.services.support.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.json.JSONObject;

import com.amazonaws.services.support.model.AttachmentSetSizeLimitExceededException;

public class AttachmentSetSizeLimitExceededExceptionUnmarshaller extends JsonErrorUnmarshaller {

    public AttachmentSetSizeLimitExceededExceptionUnmarshaller() {
        super(AttachmentSetSizeLimitExceededException.class);
    }

    @Override
    public boolean match(String errorTypeFromHeader, JSONObject json) throws Exception {
        if (errorTypeFromHeader == null) {
            // Parse error type from the JSON content if it's not available in the response headers
            String errorCodeFromContent = parseErrorCode(json);
            return (errorCodeFromContent != null && errorCodeFromContent.equals("AttachmentSetSizeLimitExceeded"));
        } else {
            return errorTypeFromHeader.equals("AttachmentSetSizeLimitExceeded");
        }
    }

    @Override
    public AmazonServiceException unmarshall(JSONObject json) throws Exception {
        AttachmentSetSizeLimitExceededException e = (AttachmentSetSizeLimitExceededException)super.unmarshall(json);
        e.setErrorCode("AttachmentSetSizeLimitExceeded");

        return e;
    }
}
    