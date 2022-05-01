package org.mojaloop.schema.outbound.utils;

import org.mojaloop.schema.common.utils.MerchantClassificationCode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Party {
    
    private PartyIdInfo partyIdInfo;
    private MerchantClassificationCode merchantClassificationCode;
    private String name;
    private PartyPersonalInfo personalInfo;
    
    public Party() {
    }

    public PartyIdInfo getPartyIdInfo() {
        return partyIdInfo;
    }

    public void setPartyIdInfo(PartyIdInfo partyIdInfo) {
        this.partyIdInfo = partyIdInfo;
    }

    public MerchantClassificationCode getMerchantClassificationCode() {
        return merchantClassificationCode;
    }

    public void setMerchantClassificationCode(MerchantClassificationCode merchantClassificationCode) {
        this.merchantClassificationCode = merchantClassificationCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PartyPersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PartyPersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }
}
