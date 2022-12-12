package com.luna.consumer.wrapper;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author weidian
 */
@FeignClient(value = "spring-cloud-provider", name = "")
public interface HelloWrapper {

    /**
     * client say hello
     * @param name
     * @return
     */
    @GetMapping(value = "/sayHello/{name}")
    String sayHello(@PathVariable(value = "name") String name);
}