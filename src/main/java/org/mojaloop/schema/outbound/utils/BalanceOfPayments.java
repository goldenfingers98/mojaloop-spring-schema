package org.mojaloop.schema.outbound.utils;

import com.fasterxml.jackson.annotation.JsonValue;

import org.mojaloop.schema.common.utils.exception.MojaloopSchemaException;

public class BalanceOfPayments {
    
    public static final String PATTERN = "^[1-9]\\d{2}$";

    @JsonValue
    private String data;

    public BalanceOfPayments() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(!data.matches(PATTERN)){
            throw new MojaloopSchemaException("BalanceOfPayments does not match pattern");
        }
        this.data = data;
    }
    
}
