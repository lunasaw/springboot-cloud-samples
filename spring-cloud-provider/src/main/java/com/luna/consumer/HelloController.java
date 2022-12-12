package com.luna.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenzhangyue
 * 2022/12/9
 */
@RestController("/lunaServer")
@Slf4j
public class HelloController {

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable(value = "name") String name) {
        log.info("sayHello::name = {}", name);
        return "Hello : " + name;
    }
}
