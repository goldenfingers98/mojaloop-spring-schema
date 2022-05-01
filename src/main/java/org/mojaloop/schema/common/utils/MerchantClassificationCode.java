package org.mojaloop.schema.common.utils;

import com.fasterxml.jackson.annotation.JsonValue;

import org.mojaloop.schema.common.utils.exception.MojaloopSchemaException;

public class MerchantClassificationCode {
    @JsonValue
    private String value;

    public MerchantClassificationCode() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if(value.length() > 4 || value.isEmpty()){
            throw new MojaloopSchemaException("MerchantClassificationCode exceeds max size or is empty.");
        }
        this.value = value;
    }
}
