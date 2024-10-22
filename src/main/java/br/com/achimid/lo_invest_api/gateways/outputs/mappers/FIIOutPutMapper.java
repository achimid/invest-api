package br.com.achimid.lo_invest_api.gateways.outputs.mappers;


import br.com.achimid.lo_invest_api.domains.FII;
import br.com.achimid.lo_invest_api.gateways.outputs.mongodb.FIIDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FIIOutPutMapper {

    FII from(FIIDocument resp);

}
