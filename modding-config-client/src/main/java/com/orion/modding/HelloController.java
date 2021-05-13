package com.orion.modding;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author z2647w
 * @date 2021-05-01 22:50
 */
@RestController
public class HelloController {
    @Value("${config}")
    private String hello;

    @RequestMapping("/hello")
    public String hello() {
        return this.hello;
    }
}
