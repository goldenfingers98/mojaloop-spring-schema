package org.mojaloop.schema.outbound.utils;

import java.util.UUID;

import org.mojaloop.schema.common.utils.TransferError;
import org.mojaloop.schema.outbound.dto.AccountsRequest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AccountResponse {
    
    private UUID modelId;
    private AccountsRequest accounts;
    private AccountCreationStatus response;
    private AccountcreationState currentState;
    private TransferError lastError;
    
    public AccountResponse() {
    }

    public UUID getModelId() {
        return modelId;
    }

    public void setModelId(UUID modelId) {
        this.modelId = modelId;
    }

    public AccountsRequest getAccounts() {
        return accounts;
    }

    public void setAccounts(AccountsRequest accounts) {
        this.accounts = accounts;
    }

    public AccountCreationStatus getResponse() {
        return response;
    }

    public void setResponse(AccountCreationStatus response) {
        this.response = response;
    }

    public AccountcreationState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(AccountcreationState currentState) {
        this.currentState = currentState;
    }

    public TransferError getLastError() {
        return lastError;
    }

    public void setLastError(TransferError lastError) {
        this.lastError = lastError;
    }
    
}
