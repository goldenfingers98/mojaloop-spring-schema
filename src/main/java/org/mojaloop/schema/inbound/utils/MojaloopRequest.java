package org.mojaloop.schema.inbound.utils;

import java.util.Map;


public class MojaloopRequest {
    
    private Map<Object, Object> headers;
    private Map<Object, Object> body;
    
    public MojaloopRequest() {
    }

    public Map<Object, Object> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<Object, Object> headers) {
        this.headers = headers;
    }

    public Map<Object, Object> getBody() {
        return body;
    }

    public void setBody(Map<Object, Object> body) {
        this.body = body;
    }
    
}
