package org.mojaloop.schema.inbound.utils;

import com.fasterxml.jackson.annotation.JsonValue;

import org.mojaloop.schema.common.utils.exception.MojaloopSchemaException;

public class FspId {
    @JsonValue
    private String value;

    public FspId() {
    }

    public FspId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if(value.length() > 32 || value.isEmpty()){
            throw new MojaloopSchemaException("FspId exceeds max size or is empty.");
        }
        this.value = value;
    }
}
