package com.example.magicapi.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author：chenqi
 * @date：2022/3/7 09:25 星期一
 * @description：
 */
@Configuration
public class DefaultConfig {


    @Bean(name = "restTemplate")
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
