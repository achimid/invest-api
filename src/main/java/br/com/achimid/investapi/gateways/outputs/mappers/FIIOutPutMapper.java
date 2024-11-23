package br.com.achimid.investapi.gateways.outputs.mappers;


import br.com.achimid.investapi.domains.FII;
import br.com.achimid.investapi.gateways.outputs.mongodb.FIIDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FIIOutPutMapper {

    FII from(FIIDocument resp);

}
