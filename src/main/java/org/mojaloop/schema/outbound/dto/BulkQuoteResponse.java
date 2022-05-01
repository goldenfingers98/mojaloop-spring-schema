package org.mojaloop.schema.outbound.dto;

import java.util.List;
import java.util.UUID;

import org.mojaloop.schema.common.dto.TransferParty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BulkQuoteResponse {
    
    private UUID quoteId;
    private UUID homeTransactionId;
    private TransferParty fromParty;
    private List<IndividualQuoteResult> individualQuoteResults;
    
    public BulkQuoteResponse() {
    }

    public UUID getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(UUID quoteId) {
        this.quoteId = quoteId;
    }

    public UUID getHomeTransactionId() {
        return homeTransactionId;
    }

    public void setHomeTransactionId(UUID homeTransactionId) {
        this.homeTransactionId = homeTransactionId;
    }

    public TransferParty getFromParty() {
        return fromParty;
    }

    public void setFromParty(TransferParty fromParty) {
        this.fromParty = fromParty;
    }

    public List<IndividualQuoteResult> getIndividualQuoteResults() {
        return individualQuoteResults;
    }

    public void setIndividualQuoteResults(List<IndividualQuoteResult> individualQuoteResults) {
        this.individualQuoteResults = individualQuoteResults;
    }
}
