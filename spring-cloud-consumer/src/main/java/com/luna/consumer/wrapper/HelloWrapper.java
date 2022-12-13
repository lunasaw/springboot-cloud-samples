package com.luna.consumer.wrapper;

import com.luna.model.vo.UserReq;
import com.luna.model.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author weidian
 */
@FeignClient(value = "spring-cloud-provider", name = "", path = "/helloService")
public interface HelloWrapper {

    /**
     * client say hello
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/sayHello/{name}")
    String sayHello(@PathVariable(value = "name") String name);

    /**
     * client get hello
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/getHello/{name}")
    UserVO getHello(@PathVariable(value = "name") String name);

    /**
     * client add hello
     *
     * @param userReq
     * @return
     */
    @PostMapping(value = "/addHello")
    Boolean addHello(@RequestBody UserReq userReq);
}