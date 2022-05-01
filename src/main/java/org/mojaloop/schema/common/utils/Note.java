package org.mojaloop.schema.common.utils;

import java.io.Serializable;
import java.lang.reflect.Type;


import com.fasterxml.jackson.annotation.JsonValue;

import org.mojaloop.schema.common.utils.exception.MojaloopSchemaException;

public class Note implements Serializable, Type{
    @JsonValue
    private String value;

    public Note() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if(value.length() > 128 || value.isEmpty()){
            throw new MojaloopSchemaException("Note is empty or exceeds max length.");
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        } else {
            Note other = (Note) obj;
            return value.equals(other.value);
        }
    }

    
    
}
