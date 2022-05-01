package org.mojaloop.schema.outbound.utils;

import org.mojaloop.schema.common.utils.Initiator;
import org.mojaloop.schema.common.utils.InitiatorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TransactionType {
    
    private TransactionScenario scenario;
    private TransactionSubScenario subScenario;
    private Initiator initiator;
    private InitiatorType initiatorType;
    private Refund refundInfo;
    private BalanceOfPayments balanceOfPayments;

    public TransactionType() {
    }

    public TransactionScenario getScenario() {
        return scenario;
    }

    public void setScenario(TransactionScenario scenario) {
        this.scenario = scenario;
    }

    public TransactionSubScenario getSubScenario() {
        return subScenario;
    }

    public void setSubScenario(TransactionSubScenario subScenario) {
        this.subScenario = subScenario;
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

    public Refund getRefundInfo() {
        return refundInfo;
    }

    public void setRefundInfo(Refund refundInfo) {
        this.refundInfo = refundInfo;
    }

    public BalanceOfPayments getBalanceOfPayments() {
        return balanceOfPayments;
    }

    public void setBalanceOfPayments(BalanceOfPayments balanceOfPayments) {
        this.balanceOfPayments = balanceOfPayments;
    }
    
}
