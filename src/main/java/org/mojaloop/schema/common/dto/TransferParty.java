package org.mojaloop.schema.common.dto;

import java.util.Date;
import java.util.List;

import org.mojaloop.schema.common.utils.AccountId;
import org.mojaloop.schema.common.utils.ExtensionItem;
import org.mojaloop.schema.common.utils.InitiatorType;
import org.mojaloop.schema.common.utils.MerchantClassificationCode;
import org.mojaloop.schema.inbound.utils.FspId;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TransferParty {
    
    private InitiatorType payerType;
    private AccountId idType;
    private String idValue;
    private String displayName;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private MerchantClassificationCode merchantClassificationCode;
    private FspId fspId;
    private List<ExtensionItem> extensionList;
    
    public TransferParty() {
    }

    public InitiatorType getPayerType() {
        return payerType;
    }

    public void setPayerType(InitiatorType payerType) {
        this.payerType = payerType;
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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public MerchantClassificationCode getMerchantClassificationCode() {
        return merchantClassificationCode;
    }

    public void setMerchantClassificationCode(MerchantClassificationCode merchantClassificationCode) {
        this.merchantClassificationCode = merchantClassificationCode;
    }

    public FspId getFspId() {
        return fspId;
    }

    public void setFspId(FspId fspId) {
        this.fspId = fspId;
    }

    public List<ExtensionItem> getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(List<ExtensionItem> extensionList) {
        this.extensionList = extensionList;
    }
}
