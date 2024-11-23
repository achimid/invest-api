package br.com.achimid.investapi.gateways.outputs;

import br.com.achimid.investapi.gateways.outputs.mongodb.FIIDocument;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FIIRepository extends CrudRepository<FIIDocument, String> {

}
