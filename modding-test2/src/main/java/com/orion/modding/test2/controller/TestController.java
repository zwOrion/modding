package com.orion.modding.test2.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author z2647w
 * @date 2021-03-28 12:47
 */
@Api
@RestController
@RequestMapping("/test")
public class TestController {

    private final RestTemplate restTemplate;
    @Autowired
    private FeignTestInterface feignTestInterface;

    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping("/1")
    public String getTest() {
        //return restTemplate.getForObject("http://modding-test/test/1", String.class);
        return feignTestInterface.getTest();
    }
}
