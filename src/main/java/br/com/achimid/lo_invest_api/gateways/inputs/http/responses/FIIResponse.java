package br.com.achimid.lo_invest_api.gateways.inputs.http.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FIIResponse  {

    private String ticker;
}
