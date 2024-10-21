package br.com.achimid.lo_invest_api.gateways.outputs.mongodb;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class FIIDocument {
    @Id
    private String ticker;
}
