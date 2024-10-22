package br.com.achimid.lo_invest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "br.com.achimid.lo_invest_api.gateways.outputs.http")
@SpringBootApplication
public class LoInvestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoInvestApiApplication.class, args);
	}

}
