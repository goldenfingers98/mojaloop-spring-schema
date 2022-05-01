package org.mojaloop.schema.outbound.utils;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PartyPersonalInfo {
    
    private PartyComplexName complexName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
    
    public PartyPersonalInfo() {
    }

    public PartyComplexName getComplexName() {
        return complexName;
    }

    public void setComplexName(PartyComplexName complexName) {
        this.complexName = complexName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
