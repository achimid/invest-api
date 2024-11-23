package br.com.achimid.investapi.usecases;

import br.com.achimid.investapi.domains.FII;
import br.com.achimid.investapi.gateways.outputs.FIIMongoDbGateway;
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
