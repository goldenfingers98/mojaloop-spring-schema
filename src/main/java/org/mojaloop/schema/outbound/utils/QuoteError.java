package org.mojaloop.schema.outbound.utils;

import org.mojaloop.schema.common.utils.MojaloopError;

/**
 * This object represents a Mojaloop API error received at any time during the quote process
 */
public class QuoteError {
    
    private int httpStatusCode;
    private MojaloopError mojaloopError;

    public QuoteError() {
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public MojaloopError getMojaloopError() {
        return mojaloopError;
    }

    public void setMojaloopError(MojaloopError mojaloopError) {
        this.mojaloopError = mojaloopError;
    }
}
