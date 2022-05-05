package org.mojaloop.schema.inbound.utils;

import com.fasterxml.jackson.annotation.JsonValue;

import org.mojaloop.schema.common.utils.exception.MojaloopSchemaException;

public class ErrorCode {

    public static final String PATTERN = "^[1-9]\\d{3}$";

    @JsonValue
    private String data;

    public ErrorCode() {
    }

    public ErrorCode(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(!data.matches(PATTERN)){
            throw new MojaloopSchemaException("Error code does not match schema pattern");
        }
        this.data = data;
    }
    
    
}
