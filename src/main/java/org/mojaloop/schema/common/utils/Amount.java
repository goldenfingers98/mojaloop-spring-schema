package org.mojaloop.schema.common.utils;

import com.fasterxml.jackson.annotation.JsonValue;

public class Amount {
    public static final String REGEX = "^([0]|([1-9][0-9]{0,17}))([.][0-9]{0,3}[1-9])?$";

    @JsonValue
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        // validating the value
        if(value.matches(REGEX)){
            this.value = value;
        }
        else{
            throw new IllegalArgumentException("Money does not match pattern.");
        }
    }

    @Override
    public String toString() {
        return value;
    }

    public Amount() {
    }

    public Amount(String amount) {
        setValue(amount);
    }
    
}
