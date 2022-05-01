package org.mojaloop.schema.outbound.dto;

import org.mojaloop.schema.outbound.utils.Async2SyncCurrentState;
import org.mojaloop.schema.outbound.utils.Party;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PartiesByIdResponse {
    
    private Party party;
    private Async2SyncCurrentState currentState;
    
    public PartiesByIdResponse() {
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Async2SyncCurrentState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Async2SyncCurrentState currentState) {
        this.currentState = currentState;
    }
    
}
