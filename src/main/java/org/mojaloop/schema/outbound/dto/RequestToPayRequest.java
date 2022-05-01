package org.mojaloop.schema.outbound.dto;

import java.util.UUID;

import org.mojaloop.schema.common.dto.TransferParty;
import org.mojaloop.schema.common.utils.AmountType;
import org.mojaloop.schema.common.utils.Currency;
import org.mojaloop.schema.common.utils.Initiator;
import org.mojaloop.schema.common.utils.InitiatorType;
import org.mojaloop.schema.outbound.utils.TransactionScenario;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RequestToPayRequest {
    
    private UUID homeTransactionId;
    private TransferParty from;
    private TransferParty to;
    private AmountType amountType;
    private Currency currency;
    private TransactionScenario scenario;
    private Initiator initiator;
    private InitiatorType initiatorType;

    public RequestToPayRequest() {
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

    public TransactionScenario getScenario() {
        return scenario;
    }

    public void setScenario(TransactionScenario scenario) {
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
}
