package com.luna.controller;

import com.luna.wrapper.HelloClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenzhangyue
 * 2022/12/9
 */
@RestController("/lunaClient")
@Slf4j
public class HelloClientController {

    @Autowired
    private HelloClient helloClient;

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable(value = "name") String name) {
        log.info("client sayHello::name = {}", name);
        return helloClient.sayHello(name);
    }
}
