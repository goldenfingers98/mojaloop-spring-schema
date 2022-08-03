package org.mojaloop.schema.inbound.utils;

import java.util.UUID;

import org.mojaloop.schema.common.utils.Money;

public class IlpPacketData {
    
    private UUID quoteId;
    private UUID transactionId;
    private PartyInfo payer;
    private PartyInfo payee;
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

    public PartyInfo getPayer() {
        return payer;
    }

    public void setPayer(PartyInfo payer) {
        this.payer = payer;
    }

    public PartyInfo getPayee() {
        return payee;
    }

    public void setPayee(PartyInfo payee) {
        this.payee = payee;
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
