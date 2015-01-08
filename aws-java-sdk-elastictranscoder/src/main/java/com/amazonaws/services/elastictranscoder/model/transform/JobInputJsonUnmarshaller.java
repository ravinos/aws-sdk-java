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

package com.amazonaws.services.elastictranscoder.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Job Input JSON Unmarshaller
 */
public class JobInputJsonUnmarshaller implements Unmarshaller<JobInput, JsonUnmarshallerContext> {

    public JobInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobInput jobInput = new JobInput();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Key", targetDepth)) {
                    context.nextToken();
                    jobInput.setKey(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FrameRate", targetDepth)) {
                    context.nextToken();
                    jobInput.setFrameRate(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Resolution", targetDepth)) {
                    context.nextToken();
                    jobInput.setResolution(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AspectRatio", targetDepth)) {
                    context.nextToken();
                    jobInput.setAspectRatio(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Interlaced", targetDepth)) {
                    context.nextToken();
                    jobInput.setInterlaced(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Container", targetDepth)) {
                    context.nextToken();
                    jobInput.setContainer(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Encryption", targetDepth)) {
                    context.nextToken();
                    jobInput.setEncryption(EncryptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return jobInput;
    }

    private static JobInputJsonUnmarshaller instance;
    public static JobInputJsonUnmarshaller getInstance() {
        if (instance == null) instance = new JobInputJsonUnmarshaller();
        return instance;
    }
}
    