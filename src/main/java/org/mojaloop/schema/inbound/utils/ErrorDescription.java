package org.mojaloop.schema.inbound.utils;

import com.fasterxml.jackson.annotation.JsonValue;

import org.mojaloop.schema.common.utils.exception.MojaloopSchemaException;

public class ErrorDescription {

    @JsonValue
    private String value;

    public ErrorDescription() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if(value.length() > 128 || value.isEmpty()){
            throw new MojaloopSchemaException("Error description exceeds max length or is empty");
        }
        this.value = value;
    }

    
}
