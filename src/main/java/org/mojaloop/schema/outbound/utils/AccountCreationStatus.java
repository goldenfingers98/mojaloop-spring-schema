package org.mojaloop.schema.outbound.utils;

import org.mojaloop.schema.common.utils.AccountId;
import org.mojaloop.schema.common.utils.ErrorResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AccountCreationStatus {
    
    private AccountId idType;
    private String idValue;
    private String idSubValue;
    private ErrorResponse error;
    
    public AccountCreationStatus() {
    }

    public AccountId getIdType() {
        return idType;
    }

    public void setIdType(AccountId idType) {
        this.idType = idType;
    }

    public String getIdValue() {
        return idValue;
    }

    public void setIdValue(String idValue) {
        this.idValue = idValue;
    }

    public String getIdSubValue() {
        return idSubValue;
    }

    public void setIdSubValue(String idSubValue) {
        this.idSubValue = idSubValue;
    }

    public ErrorResponse getError() {
        return error;
    }

    public void setError(ErrorResponse error) {
        this.error = error;
    } 

}
