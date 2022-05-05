package org.mojaloop.schema.outbound.utils;

import org.mojaloop.schema.common.utils.exception.MojaloopSchemaException;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Fulfilment that must be attached to the transfer by the Payee.
 */
public class IlpFulfilment {
    
    public static final String PATTERN = "^[A-Za-z0-9-_]{43}$";

    @JsonValue
    private String data;

    public IlpFulfilment() {
    }

    public String getData() {
        return data;
    }

    public IlpFulfilment(String data) {
        this.data = data;
    }

    public void setData(String data) {
        if(!data.matches(PATTERN)){
            throw new MojaloopSchemaException("IlpFulfilment does not match pattern");
        }
        this.data = data;
    }
    
}
