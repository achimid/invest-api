package br.com.achimid.investapi.gateways.inputs.http.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FIIResponse  {

    private String ticker;
}
