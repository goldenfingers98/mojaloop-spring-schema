package org.mojaloop.schema.outbound.dto;

import java.util.List;
import java.util.UUID;

import org.mojaloop.schema.common.dto.TransferParty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BulkTransferResponse {
    
    private UUID transferId;
    private TransferParty from;
    private List<IndividualTransferResult> individualTransferResults;
    
    public BulkTransferResponse() {
    }

    public UUID getTransferId() {
        return transferId;
    }

    public void setTransferId(UUID transferId) {
        this.transferId = transferId;
    }

    public TransferParty getFrom() {
        return from;
    }

    public void setFrom(TransferParty from) {
        this.from = from;
    }

    public List<IndividualTransferResult> getIndividualTransferResults() {
        return individualTransferResults;
    }

    public void setIndividualTransferResults(List<IndividualTransferResult> individualTransferResults) {
        this.individualTransferResults = individualTransferResults;
    }
    
}
