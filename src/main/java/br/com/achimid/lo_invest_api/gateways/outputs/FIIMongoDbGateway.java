package br.com.achimid.lo_invest_api.gateways.outputs;


import br.com.achimid.lo_invest_api.domains.FII;
import br.com.achimid.lo_invest_api.gateways.outputs.mappers.FIIOutPutMapper;
import br.com.achimid.lo_invest_api.gateways.outputs.mongodb.FIIDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FIIMongoDbGateway {

    @Autowired
    private FIIOutPutMapper fiiMapper;
    @Autowired
    private FIIRepository fiiRepository;


    public FII findById(final String ticker){

        FIIDocument document = fiiRepository.findById(ticker).get();

        return fiiMapper.from(document);
    }
}
