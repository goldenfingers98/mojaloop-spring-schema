package org.mojaloop.schema.outbound.utils;

import org.mojaloop.schema.common.utils.AccountId;
import org.mojaloop.schema.inbound.utils.FspId;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PartyIdInfo {

    private AccountId partyIdType;
    private String partyIdentifier;
    private String partySubIdOrType;
    private FspId fspId;
    private ExtensionList extensionList;

    public PartyIdInfo() {
    }

    public AccountId getPartyIdType() {
        return partyIdType;
    }

    public void setPartyIdType(AccountId partyIdType) {
        this.partyIdType = partyIdType;
    }

    public String getPartyIdentifier() {
        return partyIdentifier;
    }

    public void setPartyIdentifier(String partyIdentifier) {
        this.partyIdentifier = partyIdentifier;
    }

    public String getPartySubIdOrType() {
        return partySubIdOrType;
    }

    public void setPartySubIdOrType(String partySubIdOrType) {
        this.partySubIdOrType = partySubIdOrType;
    }

    public FspId getFspId() {
        return fspId;
    }

    public void setFspId(FspId fspId) {
        this.fspId = fspId;
    }

    public ExtensionList getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(ExtensionList extensionList) {
        this.extensionList = extensionList;
    }
}
