package com.luna.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenzhangyue
 * 2022/12/9
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class SpringCloudConsumer {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumer.class, args);
    }
}
