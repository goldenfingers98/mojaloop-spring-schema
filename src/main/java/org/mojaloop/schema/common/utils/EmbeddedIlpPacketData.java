package org.mojaloop.schema.common.utils;

import org.mojaloop.schema.inbound.utils.IlpPacketData;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EmbeddedIlpPacketData {
    private IlpPacketData data;

    public EmbeddedIlpPacketData() {
    }

    public IlpPacketData getData() {
        return data;
    }

    public void setData(IlpPacketData data) {
        this.data = data;
    }
}
