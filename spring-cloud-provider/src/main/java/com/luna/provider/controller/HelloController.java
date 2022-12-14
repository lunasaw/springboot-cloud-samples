package com.luna.provider.controller;

import com.luna.common.text.StringTools;
import com.luna.model.vo.UserReq;
import com.luna.model.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author chenzhangyue
 * 2022/12/9
 */
@RestController
@RequestMapping("/helloService")
@Slf4j
public class HelloController {

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable(value = "name") String name) {
        log.info("sayHello::name = {}", name);
        return "Hello : " + name;
    }

    @GetMapping("/getHello/{name}")
    public UserVO getHello(@PathVariable(value = "name") String name) {
        log.info("getHello::name = {}", name);
        UserVO userVO = new UserVO();
        userVO.setName(name);
        return userVO;
    }

    @PostMapping("/addHello")
    public Boolean addHello(@Valid @RequestBody UserReq userReq) {
        return StringTools.isNoneBlank(userReq.getName());
    }
}
