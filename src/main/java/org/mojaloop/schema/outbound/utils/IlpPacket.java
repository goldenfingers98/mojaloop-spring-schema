package org.mojaloop.schema.outbound.utils;

import org.mojaloop.schema.common.utils.exception.MojaloopSchemaException;

import com.fasterxml.jackson.annotation.JsonValue;

public class IlpPacket {
    public static final String PATTERN = "^[A-Za-z0-9-_]+[=]{0,2}$";
    
    @JsonValue
    private String data;

    public IlpPacket() {
    }

    public IlpPacket(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(!data.matches(PATTERN)){
            throw new MojaloopSchemaException("IlpPacket does not match parrtern");
        }
        this.data = data;
    }
}
