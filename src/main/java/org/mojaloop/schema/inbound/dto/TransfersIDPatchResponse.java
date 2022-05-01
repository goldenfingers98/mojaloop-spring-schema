package org.mojaloop.schema.inbound.dto;

import java.util.Date;
import java.util.UUID;

import javax.management.Notification;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.mojaloop.schema.common.utils.MojaloopError;
import org.mojaloop.schema.common.utils.TransferStatus;
import org.mojaloop.schema.inbound.utils.Direction;
import org.mojaloop.schema.inbound.utils.MojaloopRequest;
import org.mojaloop.schema.inbound.utils.QuoteIDPatchResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TransfersIDPatchResponse {

    private UUID transferId;
    private Direction direction;
    private MojaloopRequest quoteRequest;
    private MojaloopRequest quoteResponse;
    private MojaloopRequest prepare;
    private MojaloopRequest fulfil;
    private QuoteIDPatchResponse quote;
    private TransferStatus currentState;
    private MojaloopError mojaloopError;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date initiatedTimestamp;
    private Notification finalNotification;
    
    public TransfersIDPatchResponse() {
    }

    public UUID getTransferId() {
        return transferId;
    }

    public void setTransferId(UUID transferId) {
        this.transferId = transferId;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public MojaloopRequest getQuoteRequest() {
        return quoteRequest;
    }

    public void setQuoteRequest(MojaloopRequest quoteRequest) {
        this.quoteRequest = quoteRequest;
    }

    public MojaloopRequest getQuoteResponse() {
        return quoteResponse;
    }

    public void setQuoteResponse(MojaloopRequest quoteResponse) {
        this.quoteResponse = quoteResponse;
    }

    public MojaloopRequest getPrepare() {
        return prepare;
    }

    public void setPrepare(MojaloopRequest prepare) {
        this.prepare = prepare;
    }

    public MojaloopRequest getFulfil() {
        return fulfil;
    }

    public void setFulfil(MojaloopRequest fulfil) {
        this.fulfil = fulfil;
    }

    public QuoteIDPatchResponse getQuote() {
        return quote;
    }

    public void setQuote(QuoteIDPatchResponse quote) {
        this.quote = quote;
    }

    public TransferStatus getCurrentState() {
        return currentState;
    }

    public void setCurrentState(TransferStatus currentState) {
        this.currentState = currentState;
    }

    public MojaloopError getMojaloopError() {
        return mojaloopError;
    }

    public void setMojaloopError(MojaloopError mojaloopError) {
        this.mojaloopError = mojaloopError;
    }

    public Date getInitiatedTimestamp() {
        return initiatedTimestamp;
    }

    public void setInitiatedTimestamp(Date initiatedTimestamp) {
        this.initiatedTimestamp = initiatedTimestamp;
    }

    public Notification getFinalNotification() {
        return finalNotification;
    }

    public void setFinalNotification(Notification finalNotification) {
        this.finalNotification = finalNotification;
    }

    

}
