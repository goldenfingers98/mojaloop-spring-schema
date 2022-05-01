package org.mojaloop.schema.outbound.utils;

import java.util.UUID;

public class Refund {
    
    private UUID originalTransactionId;
    private String refundReason;
    
    public Refund() {
    }

    public UUID getOriginalTransactionId() {
        return originalTransactionId;
    }

    public void setOriginalTransactionId(UUID originalTransactionId) {
        this.originalTransactionId = originalTransactionId;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }
    
}
