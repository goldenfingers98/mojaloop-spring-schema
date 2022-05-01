package org.mojaloop.schema.common.utils.exception;

public class MojaloopSchemaException extends RuntimeException {

    public MojaloopSchemaException() {
    }

    public MojaloopSchemaException(String message) {
        super(message);
    }

    public MojaloopSchemaException(Throwable cause) {
        super(cause);
    }

    public MojaloopSchemaException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
