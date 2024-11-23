package br.com.achimid.investapi.gateways.inputs.http;

import br.com.achimid.investapi.gateways.inputs.http.responses.FIIResponse;
import br.com.achimid.investapi.gateways.inputs.mappers.FIIInputMapper;
import br.com.achimid.investapi.usecases.GetFIIByTicker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/fiis")

public class FIIsController {

    @Autowired
    private GetFIIByTicker getFIIByTicker;
    @Autowired
    private FIIInputMapper fiiInputMapper;

    @GetMapping("/{ticker}")
    public FIIResponse getTicker(@PathVariable final String ticker) {


     return fiiInputMapper.from(getFIIByTicker.execute(ticker));
    }

}

