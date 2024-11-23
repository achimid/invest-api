package br.com.achimid.investapi.gateways.inputs.mappers;


import br.com.achimid.investapi.domains.FII;
import br.com.achimid.investapi.gateways.inputs.http.responses.FIIResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FIIInputMapper {

    FIIResponse from(FII fii);

}
