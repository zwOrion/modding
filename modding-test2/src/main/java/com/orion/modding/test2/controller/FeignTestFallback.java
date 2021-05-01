package com.orion.modding.test2.controller;

import org.springframework.stereotype.Component;

/**
 * @author z2647w
 * @date 2021-03-28 17:42
 */
@Component
public class FeignTestFallback implements FeignTestInterface{
    @Override
    public String getTest() {
        return "请求错误";
    }
}
