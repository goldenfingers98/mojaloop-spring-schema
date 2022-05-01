package org.mojaloop.schema.outbound.dto;

import java.util.List;
import java.util.UUID;

import org.mojaloop.schema.outbound.utils.BulkQuoteStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BulkQuoteStatusResponse {
    
    private UUID bulkQuoteId;
    private BulkQuoteStatus currentState;
    private List<IndividualQuote> individualQuotes;
    
    public BulkQuoteStatusResponse() {
    }

    public UUID getBulkQuoteId() {
        return bulkQuoteId;
    }

    public void setBulkQuoteId(UUID bulkQuoteId) {
        this.bulkQuoteId = bulkQuoteId;
    }

    public BulkQuoteStatus getCurrentState() {
        return currentState;
    }

    public void setCurrentState(BulkQuoteStatus currentState) {
        this.currentState = currentState;
    }

    public List<IndividualQuote> getIndividualQuotes() {
        return individualQuotes;
    }

    public void setIndividualQuotes(List<IndividualQuote> individualQuotes) {
        this.individualQuotes = individualQuotes;
    }

    
}
