package org.mojaloop.schema.inbound.dto;

import java.util.Map;
import java.util.UUID;

import org.mojaloop.schema.common.dto.TransferParty;
import org.mojaloop.schema.common.utils.Amount;
import org.mojaloop.schema.common.utils.AmountType;
import org.mojaloop.schema.common.utils.Currency;
import org.mojaloop.schema.common.utils.EmbeddedIlpPacketData;
import org.mojaloop.schema.common.utils.ExtensionItem;
import org.mojaloop.schema.common.utils.Note;
import org.mojaloop.schema.common.utils.TransactionType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TransferRequest {

    private UUID transferId;
    private QuoteResponse quote;
    private Map<Integer, ExtensionItem> quoteRequestExtensions;
    private TransferParty from;
    private TransferParty to;
    private AmountType amountType;
    private Currency currency;
    private Amount amount;
    private TransactionType transactionType;
    private EmbeddedIlpPacketData ilpPacket;
    private Note note;
    
    public TransferRequest() {
    }

    public UUID getTransferId() {
        return transferId;
    }

    public void setTransferId(UUID transferId) {
        this.transferId = transferId;
    }

    public QuoteResponse getQuote() {
        return quote;
    }

    public void setQuote(QuoteResponse quote) {
        this.quote = quote;
    }

    public Map<Integer, ExtensionItem> getQuoteRequestExtensions() {
        return quoteRequestExtensions;
    }

    public void setQuoteRequestExtensions(Map<Integer, ExtensionItem> quoteRequestExtensions) {
        this.quoteRequestExtensions = quoteRequestExtensions;
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

    public EmbeddedIlpPacketData getIlpPacket() {
        return ilpPacket;
    }

    public void setIlpPacket(EmbeddedIlpPacketData ilpPacket) {
        this.ilpPacket = ilpPacket;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    
    
}
