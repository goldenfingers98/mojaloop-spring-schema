package org.mojaloop.schema.outbound.dto;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.mojaloop.schema.common.utils.Money;
import org.mojaloop.schema.outbound.utils.ExtensionList;
import org.mojaloop.schema.outbound.utils.IlpCondition;
import org.mojaloop.schema.outbound.utils.IlpPacket;

/**
 * The object sent in the POST /transfers request.
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TransfersPostRequest {
    
    private UUID transferId;
    private String payeeFsp;
    private String payerFsp;
    private Money amount;
    private IlpPacket ilpPacket;
    private IlpCondition condition;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date expiration;
    private ExtensionList extensionList;

    public TransfersPostRequest() {
    }

    public UUID getTransferId() {
        return transferId;
    }

    public void setTransferId(UUID transferId) {
        this.transferId = transferId;
    }

    public String getPayeeFsp() {
        return payeeFsp;
    }

    public void setPayeeFsp(String payeeFsp) {
        this.payeeFsp = payeeFsp;
    }

    public String getPayerFsp() {
        return payerFsp;
    }

    public void setPayerFsp(String payerFsp) {
        this.payerFsp = payerFsp;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public IlpPacket getIlpPacket() {
        return ilpPacket;
    }

    public void setIlpPacket(IlpPacket ilpPacket) {
        this.ilpPacket = ilpPacket;
    }

    public IlpCondition getCondition() {
        return condition;
    }

    public void setCondition(IlpCondition condition) {
        this.condition = condition;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public ExtensionList getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(ExtensionList extensionList) {
        this.extensionList = extensionList;
    }
}
