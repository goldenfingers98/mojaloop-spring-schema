package org.mojaloop.schema.outbound.utils;

import org.mojaloop.schema.common.utils.ErrorResponse;
import org.mojaloop.schema.outbound.dto.BulkTransferResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BulkTransferErrorResponse extends ErrorResponse {
    
    private BulkTransferResponse bulkTransferState;

    public BulkTransferErrorResponse() {
    }

    public BulkTransferResponse getBulkTransferState() {
        return bulkTransferState;
    }

    public void setBulkTransferState(BulkTransferResponse bulkTransferState) {
        this.bulkTransferState = bulkTransferState;
    }
}
