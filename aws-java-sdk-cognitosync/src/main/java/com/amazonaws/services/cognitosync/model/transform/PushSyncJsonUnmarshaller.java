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

package com.amazonaws.services.cognitosync.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Push Sync JSON Unmarshaller
 */
public class PushSyncJsonUnmarshaller implements Unmarshaller<PushSync, JsonUnmarshallerContext> {

    public PushSync unmarshall(JsonUnmarshallerContext context) throws Exception {
        PushSync pushSync = new PushSync();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ApplicationArns", targetDepth)) {
                    context.nextToken();
                    pushSync.setApplicationArns(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    pushSync.setRoleArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return pushSync;
    }

    private static PushSyncJsonUnmarshaller instance;
    public static PushSyncJsonUnmarshaller getInstance() {
        if (instance == null) instance = new PushSyncJsonUnmarshaller();
        return instance;
    }
}
    