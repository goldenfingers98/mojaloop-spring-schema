package org.mojaloop.schema.outbound.utils;

public class TransferContinuationacceptOTP {
    
    private boolean acceptOTP;

    public TransferContinuationacceptOTP(boolean acceptOTP) {
        this.acceptOTP = acceptOTP;
    }

    public TransferContinuationacceptOTP() {
    }

    public boolean isAcceptOTP() {
        return acceptOTP;
    }

    public void setAcceptOTP(boolean acceptOTP) {
        this.acceptOTP = acceptOTP;
    }
}
