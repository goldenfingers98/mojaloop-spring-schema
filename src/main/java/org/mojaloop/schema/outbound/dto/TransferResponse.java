package org.mojaloop.schema.outbound.dto;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import org.mojaloop.schema.common.dto.TransferParty;
import org.mojaloop.schema.common.utils.Amount;
import org.mojaloop.schema.common.utils.AmountType;
import org.mojaloop.schema.common.utils.Currency;
import org.mojaloop.schema.common.utils.Note;
import org.mojaloop.schema.common.utils.TransferError;
import org.mojaloop.schema.common.utils.TransferStatus;;

@JsonInclude(Include.NON_NULL)
public class TransferResponse {
    
    private UUID transferId;
    private String homeTransactionId;
    private TransferParty from;
    private TransferParty to;
    private AmountType amountType;
    private Currency currency;
    private Amount amount;
    private String transactionType;
    private Note note;
    private TransferStatus currentState;
    private UUID quoteId;
    private QuotesIDPutResponse quoteResponse;
    private String quoteResponseSource;
    private TransfersIDPutResponse fulfil;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date initiatedTimestamp;
    private TransferError lastError;
    
    public TransferResponse() {
    }

    public UUID getTransferId() {
        return transferId;
    }

    public void setTransferId(UUID transferId) {
        this.transferId = transferId;
    }

    public String getHomeTransactionId() {
        return homeTransactionId;
    }

    public void setHomeTransactionId(String homeTransactionId) {
        this.homeTransactionId = homeTransactionId;
    }

    public TransferParty getFrom() {
        return from;
    }

    public void setFrom(TransferParty from) {
        this.from = from;
    }

    public TransferParty getTo() {
        return to;
    }

    public void setTo(TransferParty to) {
        this.to = to;
    }

    public AmountType getAmountType() {
        return amountType;
    }

    public void setAmountType(AmountType amountType) {
        this.amountType = amountType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public TransferStatus getCurrentState() {
        return currentState;
    }

    public void setCurrentState(TransferStatus currentState) {
        this.currentState = currentState;
    }

    public UUID getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(UUID quoteId) {
        this.quoteId = quoteId;
    }

    public QuotesIDPutResponse getQuoteResponse() {
        return quoteResponse;
    }

    public void setQuoteResponse(QuotesIDPutResponse quoteResponse) {
        this.quoteResponse = quoteResponse;
    }

    public String getQuoteResponseSource() {
        return quoteResponseSource;
    }

    public void setQuoteResponseSource(String quoteResponseSource) {
        this.quoteResponseSource = quoteResponseSource;
    }

    public TransfersIDPutResponse getFulfil() {
        return fulfil;
    }

    public void setFulfil(TransfersIDPutResponse fulfil) {
        this.fulfil = fulfil;
    }

    public TransferError getLastError() {
        return lastError;
    }

    public Date getInitiatedTimestamp() {
        return initiatedTimestamp;
    }

    public void setInitiatedTimestamp(Date initiatedTimestamp) {
        this.initiatedTimestamp = initiatedTimestamp;
    }

    public void setLastError(TransferError lastError) {
        this.lastError = lastError;
    }

    
    
}
