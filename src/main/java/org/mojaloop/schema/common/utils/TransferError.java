package org.mojaloop.schema.common.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TransferError {
    private int httpStatusCode;
    private MojaloopError mojaloopError;
    
    public TransferError() {
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public MojaloopError getMojaloopError() {
        return mojaloopError;
    }

    public void setMojaloopError(MojaloopError mojaloopError) {
        this.mojaloopError = mojaloopError;
    }
    
}
