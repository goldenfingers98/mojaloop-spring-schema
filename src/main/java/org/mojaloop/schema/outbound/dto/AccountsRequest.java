package org.mojaloop.schema.outbound.dto;

import org.mojaloop.schema.common.utils.AccountId;
import org.mojaloop.schema.common.utils.Currency;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AccountsRequest {
    
    private AccountId idType;
    private String idvalue;
    private String idSubValue;
    private Currency currency;
    
    public AccountsRequest() {
    }

    public AccountId getIdType() {
        return idType;
    }

    public void setIdType(AccountId idType) {
        this.idType = idType;
    }

    public String getIdvalue() {
        return idvalue;
    }

    public void setIdvalue(String idvalue) {
        this.idvalue = idvalue;
    }

    public String getIdSubValue() {
        return idSubValue;
    }

    public void setIdSubValue(String idSubValue) {
        this.idSubValue = idSubValue;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
}
