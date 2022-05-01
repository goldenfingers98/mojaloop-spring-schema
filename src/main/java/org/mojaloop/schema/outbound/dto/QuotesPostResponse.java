package org.mojaloop.schema.outbound.dto;

import org.mojaloop.schema.outbound.utils.Async2SyncCurrentState;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class QuotesPostResponse {
    
    private QuotesIDPutResponse quotes;
    private Async2SyncCurrentState currentState;
    
    public QuotesPostResponse() {
    }

    public QuotesIDPutResponse getQuotes() {
        return quotes;
    }

    public void setQuotes(QuotesIDPutResponse quotes) {
        this.quotes = quotes;
    }

    public Async2SyncCurrentState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Async2SyncCurrentState currentState) {
        this.currentState = currentState;
    }
    
}
