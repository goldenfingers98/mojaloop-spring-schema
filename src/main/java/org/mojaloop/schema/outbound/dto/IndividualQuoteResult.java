package org.mojaloop.schema.outbound.dto;

import java.util.UUID;

import org.mojaloop.schema.common.dto.TransferParty;
import org.mojaloop.schema.common.utils.Amount;
import org.mojaloop.schema.common.utils.AmountType;
import org.mojaloop.schema.common.utils.Currency;
import org.mojaloop.schema.common.utils.Note;
import org.mojaloop.schema.common.utils.TransactionType;
import org.mojaloop.schema.outbound.utils.QuoteError;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class IndividualQuoteResult {
    
    private UUID quoteId;
    private TransferParty to;
    private AmountType amountType;
    private Currency currency;
    private Amount amount;
    private TransactionType transactionType;
    private Note note;
    private QuoteError lastError;

    public IndividualQuoteResult() {
    }

    public UUID getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(UUID quoteId) {
        this.quoteId = quoteId;
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

    public QuoteError getLastError() {
        return lastError;
    }

    public void setLastError(QuoteError lastError) {
        this.lastError = lastError;
    }
}
