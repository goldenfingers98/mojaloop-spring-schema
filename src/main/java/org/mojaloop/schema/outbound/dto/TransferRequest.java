package org.mojaloop.schema.outbound.dto;
import java.util.List;
import java.util.UUID;

import org.mojaloop.schema.common.dto.TransferParty;
import org.mojaloop.schema.common.utils.Amount;
import org.mojaloop.schema.common.utils.AmountType;
import org.mojaloop.schema.common.utils.Currency;
import org.mojaloop.schema.common.utils.ExtensionItem;
import org.mojaloop.schema.common.utils.Note;
import org.mojaloop.schema.common.utils.TransactionType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TransferRequest {

    private UUID homeTransactionId;
    private TransferParty from;
    private TransferParty to;
    private AmountType amountType;
    private Currency currency;
    private Amount amount;
    private TransactionType transactionType;
    private Note note;
    private List<ExtensionItem> quoteRequestExtensions;
    private List<ExtensionItem> transferRequestExtensions;
    
    public TransferRequest() {
    }

    public UUID getHomeTransactionId() {
        return homeTransactionId;
    }

    public void setHomeTransactionId(UUID homeTransactionId) {
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

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public List<ExtensionItem> getQuoteRequestExtensions() {
        return quoteRequestExtensions;
    }

    public void setQuoteRequestExtensions(List<ExtensionItem> quoteRequestExtensions) {
        this.quoteRequestExtensions = quoteRequestExtensions;
    }

    public List<ExtensionItem> getTransferRequestExtensions() {
        return transferRequestExtensions;
    }

    public void setTransferRequestExtensions(List<ExtensionItem> transferRequestExtensions) {
        this.transferRequestExtensions = transferRequestExtensions;
    }  
    
}
