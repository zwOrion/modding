package com.orion.modding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author z2647w
 * @date 2021-05-07 14:45
 */
@RestController
public class TestController {
    @GetMapping("hello")
    public String hello() {
        return "hello spring security";
    }
}
