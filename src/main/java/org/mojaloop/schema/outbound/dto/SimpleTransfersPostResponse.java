package org.mojaloop.schema.outbound.dto;

import org.mojaloop.schema.outbound.utils.Async2SyncCurrentState;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SimpleTransfersPostResponse {
    
    private TransfersIDPutResponse transfer;
    private Async2SyncCurrentState currentState;
    
    public SimpleTransfersPostResponse() {
    }

    public TransfersIDPutResponse getTransfer() {
        return transfer;
    }

    public void setTransfer(TransfersIDPutResponse transfer) {
        this.transfer = transfer;
    }

    public Async2SyncCurrentState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Async2SyncCurrentState currentState) {
        this.currentState = currentState;
    }
    
}
