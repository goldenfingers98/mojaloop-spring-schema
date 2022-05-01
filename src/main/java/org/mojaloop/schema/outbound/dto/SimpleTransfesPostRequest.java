package org.mojaloop.schema.outbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import org.mojaloop.schema.inbound.utils.FspId;

@JsonInclude(Include.NON_NULL)
public class SimpleTransfesPostRequest {
    
    private FspId fspId;
    private TransfersPostRequest transfersPostRequest;
    
    public SimpleTransfesPostRequest() {
    }

    public FspId getFspId() {
        return fspId;
    }

    public void setFspId(FspId fspId) {
        this.fspId = fspId;
    }

    public TransfersPostRequest getTransfersPostRequest() {
        return transfersPostRequest;
    }

    public void setTransfersPostRequest(TransfersPostRequest transfersPostRequest) {
        this.transfersPostRequest = transfersPostRequest;
    }
    
}
