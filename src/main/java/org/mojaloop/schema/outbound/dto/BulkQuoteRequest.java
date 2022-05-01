package org.mojaloop.schema.outbound.dto;

import java.util.List;
import java.util.UUID;

import org.mojaloop.schema.common.dto.TransferParty;
import org.mojaloop.schema.outbound.utils.ExtensionList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BulkQuoteRequest {
    
    private UUID homeTransactionId;
    private UUID bulkQuoteId;
    private TransferParty from;
    private List<IndividualQuote> individualQuotes;
    private ExtensionList extensions;

    public BulkQuoteRequest() {
    }

    public UUID getHomeTransactionId() {
        return homeTransactionId;
    }

    public void setHomeTransactionId(UUID homeTransactionId) {
        this.homeTransactionId = homeTransactionId;
    }

    public UUID getBulkQuoteId() {
        return bulkQuoteId;
    }

    public void setBulkQuoteId(UUID bulkQuoteId) {
        this.bulkQuoteId = bulkQuoteId;
    }

    public TransferParty getFrom() {
        return from;
    }

    public void setFrom(TransferParty from) {
        this.from = from;
    }

    public List<IndividualQuote> getIndividualQuotes() {
        return individualQuotes;
    }

    public void setIndividualQuotes(List<IndividualQuote> individualQuotes) {
        this.individualQuotes = individualQuotes;
    }

    public ExtensionList getExtensions() {
        return extensions;
    }

    public void setExtensions(ExtensionList extensions) {
        this.extensions = extensions;
    }

}
