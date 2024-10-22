package br.com.achimid.lo_invest_api.gateways.outputs.http;

import lombok.Builder;
import lombok.Data;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@FeignClient(value = "PuppeteerExecutorAchimidAPI", url = "https://puppeteer-executor.achimid.com.br/api/v1")
public interface PuppeteerExecutorAchimidAPI {

    @RequestMapping(method = POST, value = "/execution")
    ExecutionRequest execute(ExecutionRequest request);

    @RequestMapping(method = GET, value = "/execution/{id}")
    ExecutionResponse get(@PathVariable("id") String id);

    @Data
    @Builder
    class ExecutionRequest {
        private String id;
        private String url;
        private String script;
        private String callbackUrl;
        private String ref;
        private ExecutionConfig config;
    }

    @Data
    @Builder
    class ExecutionConfig {
        private boolean bypassCSP;
        private boolean useRandomAgent;
        private String urlProxy;
        private boolean skipImage;
        private boolean logConsole;
        private Integer defaultNavigationTimeout;
        private String addScriptTagUrl;
        private Integer waitTime;
    }

    @Data
    @Builder
    class ExecutionResponse {
        private ExecutionRequest request;
        private Execution execution;
    }

    @Data
    @Builder
    class Execution {
        private String uuid;
        private String startTime;
        private String endTime;
        private boolean isSuccess;
        private String executionTime;
        private ExecutionError error;
    }

    @Data
    @Builder
    class ExecutionError {
        private String name;
    }
}
