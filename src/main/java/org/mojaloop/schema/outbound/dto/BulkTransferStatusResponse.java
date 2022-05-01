package org.mojaloop.schema.outbound.dto;

import java.util.List;
import java.util.UUID;

import org.mojaloop.schema.outbound.utils.BulkTransferStatus;
import org.mojaloop.schema.outbound.utils.IndividualTransferFulfilment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BulkTransferStatusResponse {
    
    private UUID bulkTransferId;
    private BulkTransferStatus currentState;
    private List<IndividualTransferFulfilment> fulfils;
    
    public BulkTransferStatusResponse() {
    }

    public UUID getBulkTransferId() {
        return bulkTransferId;
    }

    public void setBulkTransferId(UUID bulkTransferId) {
        this.bulkTransferId = bulkTransferId;
    }

    public BulkTransferStatus getCurrentState() {
        return currentState;
    }

    public void setCurrentState(BulkTransferStatus currentState) {
        this.currentState = currentState;
    }

    public List<IndividualTransferFulfilment> getFulfils() {
        return fulfils;
    }

    public void setFulfils(List<IndividualTransferFulfilment> fulfils) {
        this.fulfils = fulfils;
    }

}
