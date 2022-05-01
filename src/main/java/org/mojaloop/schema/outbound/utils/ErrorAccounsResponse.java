package org.mojaloop.schema.outbound.utils;

import org.mojaloop.schema.common.utils.ErrorResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ErrorAccounsResponse extends ErrorResponse {
    
    private AccountResponse executionState;

    public ErrorAccounsResponse() {
    }

    public AccountResponse getExecutionState() {
        return executionState;
    }

    public void setExecutionState(AccountResponse executionState) {
        this.executionState = executionState;
    }
}
