package com.luna.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenzhangyue
 * 2022/12/9
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudProvider {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider.class, args);
    }
}
