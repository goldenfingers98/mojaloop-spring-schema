package org.mojaloop.schema.inbound.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class QuoteIDPatchResponse {
    
    private Object request;
    private Object internalRequest;
    private Object response;
    private Object mojaloopResponse;
    private String fulfilment;
    
    public QuoteIDPatchResponse() {
    }

    public Object getRequest() {
        return request;
    }

    public void setRequest(Object request) {
        this.request = request;
    }

    public Object getInternalRequest() {
        return internalRequest;
    }

    public void setInternalRequest(Object internalRequest) {
        this.internalRequest = internalRequest;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public Object getMojaloopResponse() {
        return mojaloopResponse;
    }

    public void setMojaloopResponse(Object mojaloopResponse) {
        this.mojaloopResponse = mojaloopResponse;
    }

    public String getFulfilment() {
        return fulfilment;
    }

    public void setFulfilment(String fulfilment) {
        this.fulfilment = fulfilment;
    }
    
    
}
