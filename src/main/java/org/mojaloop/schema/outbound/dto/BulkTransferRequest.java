package org.mojaloop.schema.outbound.dto;

import java.util.List;
import java.util.UUID;

import org.mojaloop.schema.common.dto.TransferParty;
import org.mojaloop.schema.outbound.utils.ExtensionList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BulkTransferRequest {
    
    private UUID homeTransactionId;
    private UUID bulTransferId;
    private TransferParty from;
    private List<IndividualTransfer> individualTransfers;
    private ExtensionList extensions;
    
    public BulkTransferRequest() {
    }

    public UUID getHomeTransactionId() {
        return homeTransactionId;
    }

    public void setHomeTransactionId(UUID homeTransactionId) {
        this.homeTransactionId = homeTransactionId;
    }

    public UUID getBulTransferId() {
        return bulTransferId;
    }

    public void setBulTransferId(UUID bulTransferId) {
        this.bulTransferId = bulTransferId;
    }

    public TransferParty getFrom() {
        return from;
    }

    public void setFrom(TransferParty from) {
        this.from = from;
    }

    public List<IndividualTransfer> getIndividualTransfers() {
        return individualTransfers;
    }

    public void setIndividualTransfers(List<IndividualTransfer> individualTransfers) {
        this.individualTransfers = individualTransfers;
    }

    public ExtensionList getExtensions() {
        return extensions;
    }

    public void setExtensions(ExtensionList extensions) {
        this.extensions = extensions;
    }
}
