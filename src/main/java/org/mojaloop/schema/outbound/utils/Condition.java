package org.mojaloop.schema.outbound.utils;

import com.fasterxml.jackson.annotation.JsonValue;

import org.mojaloop.schema.common.utils.exception.MojaloopSchemaException;

public class Condition {
    
    public static final String PATTERN = "^[A-Za-z0-9-_]{43}$";

    @JsonValue
    private String data;

    public Condition() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(!data.matches(PATTERN)){
            throw new MojaloopSchemaException("Condition does not match pattern");
        }
        this.data = data;
    }
    
}
