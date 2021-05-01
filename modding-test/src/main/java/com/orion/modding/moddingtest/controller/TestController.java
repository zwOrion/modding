package com.orion.modding.moddingtest.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author z2647w
 * @date 2021-03-28 12:47
 */
@RestController
@RequestMapping("/test")
@Api
public class TestController {
    @GetMapping("/1")
    public String getTest() {
        return "你好：test";
    }
}
