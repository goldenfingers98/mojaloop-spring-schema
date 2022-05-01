package org.mojaloop.schema.outbound.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.mojaloop.schema.common.utils.TransferState;
import org.mojaloop.schema.outbound.utils.ExtensionList;
import org.mojaloop.schema.outbound.utils.IlpFulfilment;

/**
 * The object sent in the PUT /transfers/{ID} callback.
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TransfersIdPutResponse {
    
    private IlpFulfilment fulfilment;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date completedTimestamp;
    private TransferState transferState;
    private ExtensionList extensionList;
    
    public TransfersIdPutResponse() {
    }

    public IlpFulfilment getFulfilment() {
        return fulfilment;
    }

    public void setFulfilment(IlpFulfilment fulfilment) {
        this.fulfilment = fulfilment;
    }

    public Date getCompletedTimestamp() {
        return completedTimestamp;
    }

    public void setCompletedTimestamp(Date completedTimestamp) {
        this.completedTimestamp = completedTimestamp;
    }

    public TransferState getTransferState() {
        return transferState;
    }

    public void setTransferState(TransferState transferState) {
        this.transferState = transferState;
    }

    public ExtensionList getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(ExtensionList extensionList) {
        this.extensionList = extensionList;
    }
    
}
