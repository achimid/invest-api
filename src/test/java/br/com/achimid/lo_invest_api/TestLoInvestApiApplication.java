package br.com.achimid.lo_invest_api;

import org.springframework.boot.SpringApplication;

public class TestLoInvestApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(LoInvestApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
