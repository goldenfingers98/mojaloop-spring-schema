package org.mojaloop.schema.outbound.dto;

import java.util.UUID;

import org.mojaloop.schema.common.utils.TransferStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TransferStatusResponse {

    private UUID CorrelationId;
    private TransferStatus currentState;
    private TransfersIdPutResponse fulfil;
    
    public TransferStatusResponse() {
    }

    public UUID getCorrelationId() {
        return CorrelationId;
    }

    public void setCorrelationId(UUID correlationId) {
        CorrelationId = correlationId;
    }

    public TransferStatus getCurrentState() {
        return currentState;
    }

    public void setCurrentState(TransferStatus currentState) {
        this.currentState = currentState;
    }

    public TransfersIdPutResponse getFulfil() {
        return fulfil;
    }

    public void setFulfil(TransfersIdPutResponse fulfil) {
        this.fulfil = fulfil;
    }

    
}
