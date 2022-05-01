package org.mojaloop.schema.inbound.utils;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.mojaloop.schema.common.utils.ExtensionItem;
import org.mojaloop.schema.common.utils.TransferState;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Notification {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date completedTimestamp;
    private TransferState transferState;
    private List<ExtensionItem> extensionList;
    
    public Notification() {
    }

    public Date getCompletedTimestamp() {
        return completedTimestamp;
    }

    public void setCompletedTimestamp(Date completedTimestamp) {
        this.completedTimestamp = completedTimestamp;
    }

    public TransferState getTransferState() {
        return transferState;
    }

    public void setTransferState(TransferState transferState) {
        this.transferState = transferState;
    }

    public List<ExtensionItem> getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(List<ExtensionItem> extensionList) {
        this.extensionList = extensionList;
    }
    
}
