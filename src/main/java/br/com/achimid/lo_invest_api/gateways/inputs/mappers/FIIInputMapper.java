package br.com.achimid.lo_invest_api.gateways.inputs.mappers;


import br.com.achimid.lo_invest_api.domains.FII;
import br.com.achimid.lo_invest_api.gateways.inputs.http.responses.FIIResponse;
import org.mapstruct.Mapper;

@Mapper
public interface FIIInputMapper {

    FIIResponse from(FII fii);

}
