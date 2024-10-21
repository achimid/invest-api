package br.com.achimid.lo_invest_api.usecases;

import br.com.achimid.lo_invest_api.domains.FII;
import br.com.achimid.lo_invest_api.gateways.outputs.FIIMongoDbGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GetFIIByTicker {

    @Autowired
    private FIIMongoDbGateway fiiMongoDbGateway;


    public FII execute(final String ticker) {

        return fiiMongoDbGateway.findById(ticker);
    }
}
