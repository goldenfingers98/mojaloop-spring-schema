package org.mojaloop.schema.outbound.utils;

import org.mojaloop.schema.common.utils.ErrorResponse;
import org.mojaloop.schema.outbound.dto.BulkQuoteResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BulkQuoteErrorResponse extends ErrorResponse {
    
    private BulkQuoteResponse bulkQuoteState;

    public BulkQuoteErrorResponse() {
    }

    public BulkQuoteResponse getBulkQuoteState() {
        return bulkQuoteState;
    }

    public void setBulkQuoteState(BulkQuoteResponse bulkQuoteState) {
        this.bulkQuoteState = bulkQuoteState;
    }
}
