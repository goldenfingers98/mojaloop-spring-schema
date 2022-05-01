package org.mojaloop.schema.outbound.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * A Mojaloop API transfer fulfilment for individual transfers in a bulk transfer
 */
@JsonInclude(Include.NON_NULL)
public class IndividualTransferFulfilment {
    
    private IlpFulfilment fulfilment;
    private ExtensionList extensionList;
    
    public IndividualTransferFulfilment() {
    }

    public IlpFulfilment getFulfilment() {
        return fulfilment;
    }

    public void setFulfilment(IlpFulfilment fulfilment) {
        this.fulfilment = fulfilment;
    }

    public ExtensionList getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(ExtensionList extensionList) {
        this.extensionList = extensionList;
    }
    
}
