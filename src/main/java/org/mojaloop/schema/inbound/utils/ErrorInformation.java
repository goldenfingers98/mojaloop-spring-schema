package org.mojaloop.schema.inbound.utils;

import org.mojaloop.schema.outbound.utils.ExtensionList;

public class ErrorInformation {

    private ErrorCode errorCode;
    private ErrorDescription errorDescription;
    private ExtensionList extensionList;
    
    public ErrorInformation() {
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorDescription getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(ErrorDescription errorDescription) {
        this.errorDescription = errorDescription;
    }

    public ExtensionList getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(ExtensionList extensionList) {
        this.extensionList = extensionList;
    }


    
}
