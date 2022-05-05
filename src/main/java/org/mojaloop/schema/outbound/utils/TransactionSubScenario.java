package org.mojaloop.schema.outbound.utils;

import org.mojaloop.schema.common.utils.exception.MojaloopSchemaException;

import com.fasterxml.jackson.annotation.JsonValue;
public class TransactionSubScenario {
    
    public static final String PATTERN = "^[A-Z_]{1,32}$";

    @JsonValue
    private String data;

    public TransactionSubScenario() {
    }

    public String getData() {
        return data;
    }

    public TransactionSubScenario(String data) {
        this.data = data;
    }

    public void setData(String data) {
        if(!data.matches(PATTERN)){
            throw new MojaloopSchemaException("TransactionSubScenario does not match pattern");
        }
        this.data = data;
    }
    
}
