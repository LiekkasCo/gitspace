package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BaseController
 * @author liangchen
 * @date 2020.09.16
 */
@RestController
@Slf4j
public class BaseController {
    @PostMapping("/api/test")
    public String test(){
        log.info("执行controller层代码");
        return "this is a test text";
    }
}
