package br.com.achimid.investapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "br.com.achimid.invest_api.gateways.outputs.http")
@SpringBootApplication
public class InvestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestApiApplication.class, args);
	}

}
