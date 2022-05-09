package org.mojaloop.scheme;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;
import org.mojaloop.schema.outbound.dto.TransferResponse;

public class InboundTransferResponseTest {

    String json =
        "{"+
        "    \"homeTransactionId\": \"2484b96f-2e79-4532-b985-b2c8166897b1\","+
        "    \"from\": {"+
        "      \"displayName\": \"Khaldoun Chtourou\","+
        "      \"idType\": \"MSISDN\","+
        "      \"idValue\": \"21629775650\""+
        "    },"+
        "    \"to\": {"+
        "      \"idType\": \"MSISDN\","+
        "      \"idValue\": \"21629775651\","+
        "      \"fspId\": \"patati\""+
        "    },"+
        "    \"amountType\": \"SEND\","+
        "    \"currency\": \"USD\","+
        "    \"amount\": \"100\","+
        "    \"transactionType\": \"TRANSFER\","+
        "    \"transferId\": \"b51ec534-ee48-4575-b6a9-ead2955b8069\","+
        "    \"note\": \"test payment\","+
        "    \"currentState\": \"WAITING_FOR_QUOTE_ACCEPTANCE\","+
        "    \"quoteId\": \"b51ec534-ee48-4575-b6a9-ead2955b8069\","+
        "    \"quoteResponse\": {"+
        "      \"transferAmount\": {"+
        "        \"currency\": \"LBP\","+
        "        \"amount\": \"123.45\""+
        "      },"+
        "      \"expiration\": \"2016-05-24T08:38:08.699-04:00\","+
        "      \"ilpPacket\": \"AYIBgQAAAAAAAASwNGxldmVsb25lLmRmc3AxLm1lci45T2RTOF81MDdqUUZERmZlakgyOVc4bXFmNEpLMHlGTFGCAUBQU0svMS4wCk5vbmNlOiB1SXlweUYzY3pYSXBFdzVVc05TYWh3CkVuY3J5cHRpb246IG5vbmUKUGF5bWVudC1JZDogMTMyMzZhM2ItOGZhOC00MTYzLTg0NDctNGMzZWQzZGE5OGE3CgpDb250ZW50LUxlbmd0aDogMTM1CkNvbnRlbnQtVHlwZTogYXBwbGljYXRpb24vanNvbgpTZW5kZXItSWRlbnRpZmllcjogOTI4MDYzOTEKCiJ7XCJmZWVcIjowLFwidHJhbnNmZXJDb2RlXCI6XCJpbnZvaWNlXCIsXCJkZWJpdE5hbWVcIjpcImFsaWNlIGNvb3BlclwiLFwiY3JlZGl0TmFtZVwiOlwibWVyIGNoYW50XCIsXCJkZWJpdElkZW50aWZpZXJcIjpcIjkyODA2MzkxXCJ9IgA\","+
        "      \"condition\": \"jKjmIMN2W1kbSc3V4Fnjx92eYFWZxHFFTAEn9h3SBMM\","+
        "      \"payeeReceiveAmount\": {"+
        "        \"currency\": \"MAD\","+
        "        \"amount\": \"123.45\""+
        "      },"+
        "      \"payeeFspFee\": {"+
        "        \"currency\": \"JEP\","+
        "        \"amount\": \"123.45\""+
        "      },"+
        "      \"payeeFspCommission\": {"+
        "        \"currency\": \"GGP\","+
        "        \"amount\": \"123.45\""+
        "      },"+
        "      \"geoCode\": {"+
        "        \"latitude\": \"+45.4215\","+
        "        \"longitude\": \"+75.6972\""+
        "      },"+
        "      \"extensionList\": {"+
        "        \"extension\": ["+
        "          {"+
        "            \"key\": \"enim id\","+
        "            \"value\": \"anim ea exercitation\""+
        "          }"+
        "        ]"+
        "      }"+
        "    },"+
        "    \"quoteResponseSource\": \"cupidatat laborum in\","+
        "    \"fulfil\": {"+
        "      \"transferState\": \"RESERVED\","+
        "      \"fulfilment\": \"WLctttbu2HvTsa1XWvUoGRcQozHsqeu9Ahl2JW9Bsu8\","+
        "      \"completedTimestamp\": \"2016-05-24T08:38:08.699-04:00\","+
        "      \"extensionList\": {"+
        "        \"extension\": ["+
        "          {"+
        "            \"key\": \"nisi occaecat\","+
        "            \"value\": \"elit consequat sit\""+
        "          }"+
        "        ]"+
        "      }"+
        "    },"+
        "    \"lastError\": {"+
        "      \"httpStatusCode\": -71793548,"+
        "      \"mojaloopError\": {"+
        "        \"errorInformation\": {"+
        "          \"errorCode\": \"5100\","+
        "          \"errorDescription\": \"ipsum commodo ullamco ex\","+
        "          \"extensionList\": {"+
        "            \"extension\": ["+
        "              {"+
        "                \"key\": \"ut\","+
        "                \"value\": \"ipsum amet elit ullamco\""+
        "              }"+
        "            ]"+
        "          }"+
        "        }"+
        "      }"+
        "    }"+
        "  }";
    
    @Test
    void testDeserialize() throws JsonMappingException, JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        TransferResponse response = mapper.readValue(json, TransferResponse.class);
        System.out.println(response.getNote().getValue());
        assertTrue(response != null);
    }
}
