/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAuditSuppressionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAuditSuppressionRequestMarshaller {

    private static final MarshallingInfo<String> CHECKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("checkName").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceIdentifier").build();
    private static final MarshallingInfo<java.util.Date> EXPIRATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expirationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Boolean> SUPPRESSINDEFINITELY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suppressIndefinitely").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();

    private static final UpdateAuditSuppressionRequestMarshaller instance = new UpdateAuditSuppressionRequestMarshaller();

    public static UpdateAuditSuppressionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAuditSuppressionRequest updateAuditSuppressionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAuditSuppressionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAuditSuppressionRequest.getCheckName(), CHECKNAME_BINDING);
            protocolMarshaller.marshall(updateAuditSuppressionRequest.getResourceIdentifier(), RESOURCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(updateAuditSuppressionRequest.getExpirationDate(), EXPIRATIONDATE_BINDING);
            protocolMarshaller.marshall(updateAuditSuppressionRequest.getSuppressIndefinitely(), SUPPRESSINDEFINITELY_BINDING);
            protocolMarshaller.marshall(updateAuditSuppressionRequest.getDescription(), DESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
