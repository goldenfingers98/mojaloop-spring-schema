package org.mojaloop.schema.common.utils;

import org.mojaloop.schema.common.utils.exception.MojaloopSchemaException;

public class GeoCode {
    
    public static final String LAT_REGEX = "^(\\+|-)?(?:90(?:(?:\\.0{1,6})?)|(?:[0-9]|[1-8][0-9])(?:(?:\\.[0-9]{1,6})?))$";
    public static final String LON_REGEX = "^(\\+|-)?(?:180(?:(?:\\.0{1,6})?)|(?:[0-9]|[1-9][0-9]|1[0-7][0-9])(?:(?:\\.[0-9]{1,6})?))$";

    private String latitude;
    private String longitude;
    
    public GeoCode() {
    }

    public GeoCode(String latitude, String longitude) {
        setLatitude(latitude);
        setLongitude(longitude);
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        if(latitude.matches(LAT_REGEX)){
            this.latitude = latitude;
        }else{
            throw new MojaloopSchemaException("Latitude does not match pattern.");
        }
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        if(longitude.matches(LON_REGEX)){
            this.longitude = longitude;
        }else{
            throw new MojaloopSchemaException("Longitude does not match pattern.");
        }
    }

    
    
}

