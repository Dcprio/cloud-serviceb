package com.xlc.config;

import org.springframework.context.annotation.Bean;
import com.xlc.Feign.EchoClient;
import com.xlc.Feign.EchoClientFallback;

public class FeignConfiguration {

    @Bean
    public EchoClient echoClientFallback() {
        return new EchoClientFallback();
    }

}