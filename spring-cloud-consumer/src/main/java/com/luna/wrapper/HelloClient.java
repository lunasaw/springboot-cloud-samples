package com.luna.wrapper;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("lunaServer")
public interface HelloClient {

    /**
     * client say hello
     * @param name
     * @return
     */
    @GetMapping(value = "/sayHello/{name}")
    String sayHello(@PathVariable(value = "name") String name);
}