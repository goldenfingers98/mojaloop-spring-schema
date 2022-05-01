package org.mojaloop.schema.outbound.dto;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.mojaloop.schema.common.utils.AmountType;
import org.mojaloop.schema.common.utils.GeoCode;
import org.mojaloop.schema.common.utils.Money;
import org.mojaloop.schema.common.utils.Note;
import org.mojaloop.schema.outbound.utils.ExtensionList;
import org.mojaloop.schema.outbound.utils.Party;
import org.mojaloop.schema.outbound.utils.TransactionType;

/**
 * The object sent in the POST /quotes request.
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class QuotesPostRequest {
    
    private UUID quoteId;
    private UUID transactionId;
    private UUID transactionRequestId;
    private Party payee;
    private Party payer;
    private AmountType amountType;
    private Money amount;
    private Money fees;
    private TransactionType transactionType;
    private GeoCode geoCode;
    private Note note;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date expiration;
    private ExtensionList extensionList;
    
    public QuotesPostRequest() {
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

    public UUID getTransactionRequestId() {
        return transactionRequestId;
    }

    public void setTransactionRequestId(UUID transactionRequestId) {
        this.transactionRequestId = transactionRequestId;
    }

    public Party getPayee() {
        return payee;
    }

    public void setPayee(Party payee) {
        this.payee = payee;
    }

    public Party getPayer() {
        return payer;
    }

    public void setPayer(Party payer) {
        this.payer = payer;
    }

    public AmountType getAmountType() {
        return amountType;
    }

    public void setAmountType(AmountType amountType) {
        this.amountType = amountType;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public Money getFees() {
        return fees;
    }

    public void setFees(Money fees) {
        this.fees = fees;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public GeoCode getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(GeoCode geoCode) {
        this.geoCode = geoCode;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public ExtensionList getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(ExtensionList extensionList) {
        this.extensionList = extensionList;
    }
}
