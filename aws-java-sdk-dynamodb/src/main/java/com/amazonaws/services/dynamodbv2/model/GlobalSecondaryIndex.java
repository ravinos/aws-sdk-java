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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a global secondary index.
 * </p>
 */
public class GlobalSecondaryIndex implements Serializable {

    /**
     * The name of the global secondary index. The name must be unique among
     * all other indexes on this table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String indexName;

    /**
     * The complete key schema for a global secondary index, which consists
     * of one or more pairs of attribute names and key types
     * (<code>HASH</code> or <code>RANGE</code>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchema;

    /**
     * Represents attributes that are copied (projected) from the table into
     * an index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     */
    private Projection projection;

    /**
     * Represents the provisioned throughput settings for a specified table
     * or index. The settings can be modified using the <i>UpdateTable</i>
     * operation. <p>For current minimum and maximum provisioned throughput
     * values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    private ProvisionedThroughput provisionedThroughput;

    /**
     * The name of the global secondary index. The name must be unique among
     * all other indexes on this table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the global secondary index. The name must be unique among
     *         all other indexes on this table.
     */
    public String getIndexName() {
        return indexName;
    }
    
    /**
     * The name of the global secondary index. The name must be unique among
     * all other indexes on this table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName The name of the global secondary index. The name must be unique among
     *         all other indexes on this table.
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
    
    /**
     * The name of the global secondary index. The name must be unique among
     * all other indexes on this table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName The name of the global secondary index. The name must be unique among
     *         all other indexes on this table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GlobalSecondaryIndex withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * The complete key schema for a global secondary index, which consists
     * of one or more pairs of attribute names and key types
     * (<code>HASH</code> or <code>RANGE</code>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return The complete key schema for a global secondary index, which consists
     *         of one or more pairs of attribute names and key types
     *         (<code>HASH</code> or <code>RANGE</code>).
     */
    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }
    
    /**
     * The complete key schema for a global secondary index, which consists
     * of one or more pairs of attribute names and key types
     * (<code>HASH</code> or <code>RANGE</code>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema The complete key schema for a global secondary index, which consists
     *         of one or more pairs of attribute names and key types
     *         (<code>HASH</code> or <code>RANGE</code>).
     */
    public void setKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchemaCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement>(keySchema.size());
        keySchemaCopy.addAll(keySchema);
        this.keySchema = keySchemaCopy;
    }
    
    /**
     * The complete key schema for a global secondary index, which consists
     * of one or more pairs of attribute names and key types
     * (<code>HASH</code> or <code>RANGE</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema The complete key schema for a global secondary index, which consists
     *         of one or more pairs of attribute names and key types
     *         (<code>HASH</code> or <code>RANGE</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GlobalSecondaryIndex withKeySchema(KeySchemaElement... keySchema) {
        if (getKeySchema() == null) setKeySchema(new java.util.ArrayList<KeySchemaElement>(keySchema.length));
        for (KeySchemaElement value : keySchema) {
            getKeySchema().add(value);
        }
        return this;
    }
    
    /**
     * The complete key schema for a global secondary index, which consists
     * of one or more pairs of attribute names and key types
     * (<code>HASH</code> or <code>RANGE</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema The complete key schema for a global secondary index, which consists
     *         of one or more pairs of attribute names and key types
     *         (<code>HASH</code> or <code>RANGE</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GlobalSecondaryIndex withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchemaCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement>(keySchema.size());
            keySchemaCopy.addAll(keySchema);
            this.keySchema = keySchemaCopy;
        }

        return this;
    }

    /**
     * Represents attributes that are copied (projected) from the table into
     * an index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     *
     * @return Represents attributes that are copied (projected) from the table into
     *         an index. These are in addition to the primary key attributes and
     *         index key attributes, which are automatically projected.
     */
    public Projection getProjection() {
        return projection;
    }
    
    /**
     * Represents attributes that are copied (projected) from the table into
     * an index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     *
     * @param projection Represents attributes that are copied (projected) from the table into
     *         an index. These are in addition to the primary key attributes and
     *         index key attributes, which are automatically projected.
     */
    public void setProjection(Projection projection) {
        this.projection = projection;
    }
    
    /**
     * Represents attributes that are copied (projected) from the table into
     * an index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param projection Represents attributes that are copied (projected) from the table into
     *         an index. These are in addition to the primary key attributes and
     *         index key attributes, which are automatically projected.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GlobalSecondaryIndex withProjection(Projection projection) {
        this.projection = projection;
        return this;
    }

    /**
     * Represents the provisioned throughput settings for a specified table
     * or index. The settings can be modified using the <i>UpdateTable</i>
     * operation. <p>For current minimum and maximum provisioned throughput
     * values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @return Represents the provisioned throughput settings for a specified table
     *         or index. The settings can be modified using the <i>UpdateTable</i>
     *         operation. <p>For current minimum and maximum provisioned throughput
     *         values, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public ProvisionedThroughput getProvisionedThroughput() {
        return provisionedThroughput;
    }
    
    /**
     * Represents the provisioned throughput settings for a specified table
     * or index. The settings can be modified using the <i>UpdateTable</i>
     * operation. <p>For current minimum and maximum provisioned throughput
     * values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @param provisionedThroughput Represents the provisioned throughput settings for a specified table
     *         or index. The settings can be modified using the <i>UpdateTable</i>
     *         operation. <p>For current minimum and maximum provisioned throughput
     *         values, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }
    
    /**
     * Represents the provisioned throughput settings for a specified table
     * or index. The settings can be modified using the <i>UpdateTable</i>
     * operation. <p>For current minimum and maximum provisioned throughput
     * values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the <i>Amazon DynamoDB Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param provisionedThroughput Represents the provisioned throughput settings for a specified table
     *         or index. The settings can be modified using the <i>UpdateTable</i>
     *         operation. <p>For current minimum and maximum provisioned throughput
     *         values, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GlobalSecondaryIndex withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIndexName() != null) sb.append("IndexName: " + getIndexName() + ",");
        if (getKeySchema() != null) sb.append("KeySchema: " + getKeySchema() + ",");
        if (getProjection() != null) sb.append("Projection: " + getProjection() + ",");
        if (getProvisionedThroughput() != null) sb.append("ProvisionedThroughput: " + getProvisionedThroughput() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode()); 
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode()); 
        hashCode = prime * hashCode + ((getProjection() == null) ? 0 : getProjection().hashCode()); 
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GlobalSecondaryIndex == false) return false;
        GlobalSecondaryIndex other = (GlobalSecondaryIndex)obj;
        
        if (other.getIndexName() == null ^ this.getIndexName() == null) return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false) return false; 
        if (other.getKeySchema() == null ^ this.getKeySchema() == null) return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false) return false; 
        if (other.getProjection() == null ^ this.getProjection() == null) return false;
        if (other.getProjection() != null && other.getProjection().equals(this.getProjection()) == false) return false; 
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null) return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false) return false; 
        return true;
    }
    
}
    