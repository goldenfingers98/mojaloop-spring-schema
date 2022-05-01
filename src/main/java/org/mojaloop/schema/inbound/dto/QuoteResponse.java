package org.mojaloop.schema.inbound.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.mojaloop.schema.common.utils.Amount;
import org.mojaloop.schema.common.utils.Currency;
import org.mojaloop.schema.common.utils.ExtensionItem;
import org.mojaloop.schema.common.utils.GeoCode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class QuoteResponse {

    private UUID quoteId;
    private UUID transactionId;
    private Amount transferAmount;
    private Currency transferAmountCurrency;
    private Amount payeeReceiveAmount;
    private Currency payeeReceiveAmountCurrency;
    private Amount payeeFspFeeAmount;
    private Currency payeeFspFeeAmountCurrency;
    private Amount payeeFspCommissionAmount;
    private Currency payeeFspCommissionAmountCurrency;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date expiration;
    private GeoCode geoCode;
    private List<ExtensionItem> extensionList;
    
    public QuoteResponse() {
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

    public Amount getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(Amount transferAmount) {
        this.transferAmount = transferAmount;
    }

    public Currency getTransferAmountCurrency() {
        return transferAmountCurrency;
    }

    public void setTransferAmountCurrency(Currency transferAmountCurrency) {
        this.transferAmountCurrency = transferAmountCurrency;
    }

    public Amount getPayeeReceiveAmount() {
        return payeeReceiveAmount;
    }

    public void setPayeeReceiveAmount(Amount payeeReceiveAmount) {
        this.payeeReceiveAmount = payeeReceiveAmount;
    }

    public Currency getPayeeReceiveAmountCurrency() {
        return payeeReceiveAmountCurrency;
    }

    public void setPayeeReceiveAmountCurrency(Currency payeeReceiveAmountCurrency) {
        this.payeeReceiveAmountCurrency = payeeReceiveAmountCurrency;
    }

    public Amount getPayeeFspFeeAmount() {
        return payeeFspFeeAmount;
    }

    public void setPayeeFspFeeAmount(Amount payeeFspFeeAmount) {
        this.payeeFspFeeAmount = payeeFspFeeAmount;
    }

    public Currency getPayeeFspFeeAmountCurrency() {
        return payeeFspFeeAmountCurrency;
    }

    public void setPayeeFspFeeAmountCurrency(Currency payeeFspFeeAmountCurrency) {
        this.payeeFspFeeAmountCurrency = payeeFspFeeAmountCurrency;
    }

    public Amount getPayeeFspCommissionAmount() {
        return payeeFspCommissionAmount;
    }

    public void setPayeeFspCommissionAmount(Amount payeeFspCommissionAmount) {
        this.payeeFspCommissionAmount = payeeFspCommissionAmount;
    }

    public Currency getPayeeFspCommissionAmountCurrency() {
        return payeeFspCommissionAmountCurrency;
    }

    public void setPayeeFspCommissionAmountCurrency(Currency payeeFspCommissionAmountCurrency) {
        this.payeeFspCommissionAmountCurrency = payeeFspCommissionAmountCurrency;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public GeoCode getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(GeoCode geoCode) {
        this.geoCode = geoCode;
    }

    public List<ExtensionItem> getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(List<ExtensionItem> extensionList) {
        this.extensionList = extensionList;
    }
    
}
