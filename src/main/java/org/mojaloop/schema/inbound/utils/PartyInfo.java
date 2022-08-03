package org.mojaloop.schema.inbound.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import org.mojaloop.schema.outbound.utils.ExtensionList;
import org.mojaloop.schema.outbound.utils.PartyIdInfo;
import org.mojaloop.schema.outbound.utils.PartyPersonalInfo;

@JsonInclude(Include.NON_NULL)
public class PartyInfo {
    
    private PartyIdInfo partyIdInfo;
    private PartyPersonalInfo personalInfo;
    private String name;
    private ExtensionList extensionList;
    
    public PartyInfo() {
    }

    public PartyIdInfo getPartyIdInfo() {
        return partyIdInfo;
    }

    public void setPartyIdInfo(PartyIdInfo partyIdInfo) {
        this.partyIdInfo = partyIdInfo;
    }

    public PartyPersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PartyPersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtensionList getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(ExtensionList extensionList) {
        this.extensionList = extensionList;
    }
    
}
