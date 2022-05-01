package org.mojaloop.scheme;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TestISO8601Date {

    public static final String REGEX = "^(?:[1-9]\\d{3}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[1-9]\\d(?:0[48]|[2468][048]|[13579][26])|(?:[2468][048]|[13579][26])00)-02-29)T(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:(\\.\\d{3}))(?:Z|[+-][01]\\d:[0-5]\\d)$";

    
    @Test
    void testISO8601Date() throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        TestPojo pojo = new TestPojo();
        Date today = Date.from(Instant.now());
        pojo.setToday(today);
        String str_pojo = mapper.writeValueAsString(pojo);
        String str_date = str_pojo.substring(10, str_pojo.length()-2);
        assertTrue(str_date.matches(REGEX));
    }
    
    class TestPojo{

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
        private Date today;

        public Date getToday() {
            return today;
        }

        public void setToday(Date today) {
            this.today = today;
        }
        
    }

    @Test
    void testStringDate(){
        String str_date = "2016-05-24T08:38:08.699-04:00";
        assertTrue(str_date.matches(REGEX));
    }
    
}
