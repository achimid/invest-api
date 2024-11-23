package br.com.achimid.investapi;

import org.springframework.boot.SpringApplication;

public class TestLoInvestApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(InvestApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
