package org.mojaloop.schema.inbound.utils;

import java.util.List;

import org.mojaloop.schema.common.utils.ExtensionItem;

public class ErrorInformation {

    private ErrorCode errorCode;
    private ErrorDescription errorDescription;
    private List<ExtensionItem> extensionList;
    
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

    public List<ExtensionItem> getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(List<ExtensionItem> extensionList) {
        this.extensionList = extensionList;
    }

    
}
