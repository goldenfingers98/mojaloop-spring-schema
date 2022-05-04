package org.mojaloop.schema.inbound.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TransferResponse {
    
    private String homeTransactionId;

    public TransferResponse() {
    }

    public String getHomeTransactionId() {
        return homeTransactionId;
    }

    public void setHomeTransactionId(String homeTransactionId) {
        this.homeTransactionId = homeTransactionId;
    }
    
}
