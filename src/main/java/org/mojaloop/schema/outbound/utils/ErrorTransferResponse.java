package org.mojaloop.schema.outbound.utils;

import org.mojaloop.schema.common.utils.ErrorResponse;
import org.mojaloop.schema.outbound.dto.TransferResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ErrorTransferResponse extends ErrorResponse{

    private TransferResponse transferState;

    public ErrorTransferResponse() {
    }

    public TransferResponse getTransferState() {
        return transferState;
    }

    public void setTransferState(TransferResponse transferState) {
        this.transferState = transferState;
    }
    
}
