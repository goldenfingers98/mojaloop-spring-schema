package org.mojaloop.schema.outbound.dto;

import java.util.UUID;

import org.mojaloop.schema.common.dto.TransferParty;
import org.mojaloop.schema.common.utils.Amount;
import org.mojaloop.schema.common.utils.AmountType;
import org.mojaloop.schema.common.utils.Currency;
import org.mojaloop.schema.common.utils.Initiator;
import org.mojaloop.schema.common.utils.InitiatorType;
import org.mojaloop.schema.common.utils.Note;
import org.mojaloop.schema.outbound.utils.TransactionType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RequestToPayTransferRequest {

    private UUID requestToPayTransactionId;
    private TransferParty from;
    private TransferParty to;
    private AmountType amountType;
    private Currency currency;
    private Amount amount;
    private TransactionType scenario;
    private Initiator initiator;
    private InitiatorType initiatorType;
    private Note note;
    
    public RequestToPayTransferRequest() {
    }

    public UUID getRequestToPayTransactionId() {
        return requestToPayTransactionId;
    }

    public void setRequestToPayTransactionId(UUID requestToPayTransactionId) {
        this.requestToPayTransactionId = requestToPayTransactionId;
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

    public TransactionType getScenario() {
        return scenario;
    }

    public void setScenario(TransactionType scenario) {
        this.scenario = scenario;
    }

    public Initiator getInitiator() {
        return initiator;
    }

    public void setInitiator(Initiator initiator) {
        this.initiator = initiator;
    }

    public InitiatorType getInitiatorType() {
        return initiatorType;
    }

    public void setInitiatorType(InitiatorType initiatorType) {
        this.initiatorType = initiatorType;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}
