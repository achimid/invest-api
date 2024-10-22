package br.com.achimid.lo_invest_api;

import br.com.achimid.lo_invest_api.gateways.outputs.http.PuppeteerExecutorAchimidAPI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

//@Import(TestcontainersConfiguration.class)
@SpringBootTest
class LoInvestApiApplicationTests {

    @Autowired
    private PuppeteerExecutorAchimidAPI puppeteerExecutorAchimidAPI;

    @Test
    void contextLoads() throws InterruptedException {
        var urlTest = "https://www.fundamentus.com.br/detalhes.php?papel=HGLG11";
        var config = PuppeteerExecutorAchimidAPI.ExecutionConfig.builder().bypassCSP(true).skipImage(true).build();
        var request = PuppeteerExecutorAchimidAPI.ExecutionRequest.builder().url(urlTest).config(config).build();
        puppeteerExecutorAchimidAPI.execute(request);
    }

}
