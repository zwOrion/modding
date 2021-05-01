package com.orion.modding.test2.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author z2647w
 * @date 2021-03-28 17:39
 */
@Primary
@FeignClient(name = "modding-test",fallback = FeignTestFallback.class)
public interface FeignTestInterface {
    @GetMapping("/test/1")
    String getTest();
}
