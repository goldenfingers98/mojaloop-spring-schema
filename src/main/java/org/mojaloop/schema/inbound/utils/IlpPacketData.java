package org.mojaloop.schema.inbound.utils;

import java.util.UUID;

import org.mojaloop.schema.common.dto.TransferParty;
import org.mojaloop.schema.common.utils.Money;

public class IlpPacketData {
    
    private UUID quoteId;
    private UUID transactionId;
    private TransferParty payer;
    private TransferParty peyee;
    private Money amount;
    private TransactionTypeDto transactionType;

    public IlpPacketData() {
    }

    public UUID getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(UUID quoteId) {
        this.quoteId = quoteId;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public TransferParty getPayer() {
        return payer;
    }

    public void setPayer(TransferParty payer) {
        this.payer = payer;
    }

    public TransferParty getPeyee() {
        return peyee;
    }

    public void setPeyee(TransferParty peyee) {
        this.peyee = peyee;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public TransactionTypeDto getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionTypeDto transactionType) {
        this.transactionType = transactionType;
    }
}
