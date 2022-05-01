package org.mojaloop.schema.common.utils;

import org.mojaloop.schema.inbound.utils.ErrorInformation;

public class MojaloopError {

    private ErrorInformation errorInformation;

    public MojaloopError() {
    }

    public ErrorInformation getErrorInformation() {
        return errorInformation;
    }

    public void setErrorInformation(ErrorInformation errorInformation) {
        this.errorInformation = errorInformation;
    }

    
    
}
