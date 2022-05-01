package org.mojaloop.schema.outbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import org.mojaloop.schema.inbound.utils.FspId;

@JsonInclude(Include.NON_NULL)
public class SimpleQuotesPostRequest {
    
    private FspId fspId;
    private QuotesPostRequest quotesPostRequest;
    
    public SimpleQuotesPostRequest() {
    }    

    public FspId getFspId() {
        return fspId;
    }

    public void setFspId(FspId fspId) {
        this.fspId = fspId;
    }

    public org.mojaloop.schema.outbound.dto.QuotesPostRequest getQuotesPostRequest() {
        return quotesPostRequest;
    }

    public void setQuotesPostRequest(org.mojaloop.schema.outbound.dto.QuotesPostRequest quotesPostRequest) {
        this.quotesPostRequest = quotesPostRequest;
    } 
}
