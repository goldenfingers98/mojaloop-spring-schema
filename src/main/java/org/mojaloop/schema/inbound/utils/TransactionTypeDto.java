package org.mojaloop.schema.inbound.utils;

import org.mojaloop.schema.common.utils.Initiator;
import org.mojaloop.schema.common.utils.InitiatorType;
import org.mojaloop.schema.common.utils.TransactionType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TransactionTypeDto {

    private TransactionType scenario;
    private Initiator initiator;
    private InitiatorType initiatorType;

    public TransactionTypeDto() {
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
}
