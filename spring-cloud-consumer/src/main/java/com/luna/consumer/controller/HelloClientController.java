package com.luna.consumer.controller;

import com.luna.consumer.wrapper.HelloWrapper;
import com.luna.model.vo.UserReq;
import com.luna.model.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenzhangyue
 * 2022/12/9
 */
@RestController
@Slf4j
public class HelloClientController {

    @Autowired
    private HelloWrapper helloWrapper;

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable(value = "name") String name) {
        log.info("client sayHello::name = {}", name);
        return helloWrapper.sayHello(name);
    }

    @GetMapping("/getHello/{name}")
    public UserVO getHello(@PathVariable(value = "name") String name) {
        log.info("client getHello::name = {}", name);
        return helloWrapper.getHello(name);
    }

    @PostMapping("/addHello")
    public Boolean addHello(@RequestBody @Validated UserReq userReq) {
        return helloWrapper.addHello(userReq);
    }
}
