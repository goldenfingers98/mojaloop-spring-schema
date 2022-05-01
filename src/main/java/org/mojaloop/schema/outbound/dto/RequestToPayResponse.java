package org.mojaloop.schema.outbound.dto;

import java.util.UUID;

import org.mojaloop.schema.common.dto.TransferParty;
import org.mojaloop.schema.common.utils.Amount;
import org.mojaloop.schema.common.utils.AmountType;
import org.mojaloop.schema.common.utils.Currency;
import org.mojaloop.schema.common.utils.InitiatorType;
import org.mojaloop.schema.outbound.utils.AuthenticationType;
import org.mojaloop.schema.outbound.utils.TransactionRequestState;
import org.mojaloop.schema.outbound.utils.TransactionType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RequestToPayResponse {
    
    private UUID transactionRequestId;
    private TransferParty from;
    private TransferParty to;
    private AmountType amountType;
    private Currency currency;
    private Amount amount;
    private TransactionType scenario;
    private InitiatorType initiatorType;
    private AuthenticationType authenticationType;
    private TransactionRequestState requestTopayState;

    public RequestToPayResponse() {
    }

    public UUID getTransactionRequestId() {
        return transactionRequestId;
    }

    public void setTransactionRequestId(UUID transactionRequestId) {
        this.transactionRequestId = transactionRequestId;
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

    public InitiatorType getInitiatorType() {
        return initiatorType;
    }

    public void setInitiatorType(InitiatorType initiatorType) {
        this.initiatorType = initiatorType;
    }

    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
    }

    public TransactionRequestState getRequestTopayState() {
        return requestTopayState;
    }

    public void setRequestTopayState(TransactionRequestState requestTopayState) {
        this.requestTopayState = requestTopayState;
    }

}
