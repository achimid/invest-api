package br.com.achimid.lo_invest_api.gateways.outputs;

import br.com.achimid.lo_invest_api.gateways.outputs.mongodb.FIIDocument;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FIIRepository extends CrudRepository<FIIDocument, String> {

}
