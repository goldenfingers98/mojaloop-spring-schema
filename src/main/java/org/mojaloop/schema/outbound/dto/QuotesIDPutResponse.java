package org.mojaloop.schema.outbound.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.mojaloop.schema.common.utils.GeoCode;
import org.mojaloop.schema.common.utils.Money;
import org.mojaloop.schema.outbound.utils.Condition;
import org.mojaloop.schema.outbound.utils.ExtensionList;
import org.mojaloop.schema.outbound.utils.IlpPacket;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class QuotesIDPutResponse {
    
    private Money transferAmount;
    private Money payeeReceiveAmount;
    private Money payeeFspFee;
    private Money payeeFspCommission;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date expiration;
    private GeoCode geoCode;
    private IlpPacket ilpPacket;
    private Condition condition;
    private ExtensionList extensionList;
    
    public QuotesIDPutResponse() {
    }

    public Money getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(Money transferAmount) {
        this.transferAmount = transferAmount;
    }

    public Money getPayeeReceiveAmount() {
        return payeeReceiveAmount;
    }

    public void setPayeeReceiveAmount(Money payeeReceiveAmount) {
        this.payeeReceiveAmount = payeeReceiveAmount;
    }

    public Money getPayeeFspFee() {
        return payeeFspFee;
    }

    public void setPayeeFspFee(Money payeeFspFee) {
        this.payeeFspFee = payeeFspFee;
    }

    public Money getPayeeFspCommission() {
        return payeeFspCommission;
    }

    public void setPayeeFspCommission(Money payeeFspCommission) {
        this.payeeFspCommission = payeeFspCommission;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public GeoCode getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(GeoCode geoCode) {
        this.geoCode = geoCode;
    }

    public IlpPacket getIlpPacket() {
        return ilpPacket;
    }

    public void setIlpPacket(IlpPacket ilpPacket) {
        this.ilpPacket = ilpPacket;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public ExtensionList getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(ExtensionList extensionList) {
        this.extensionList = extensionList;
    }

}
