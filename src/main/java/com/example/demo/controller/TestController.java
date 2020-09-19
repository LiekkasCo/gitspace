package com.example.demo.controller;

import com.example.demo.common.data.JsonResult;
import com.example.demo.common.pojo.TestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 * @author liangchen
 * @date 2020.09.19
 */
@RestController
@Slf4j
public class TestController extends BaseController {
    @GetMapping("/api/test")
    public JsonResult getTestInfo(){
        TestVo vo = new TestVo(){{
           setId(1);
           setUserName("Timi");
           setAge(22);
           setGender("male");
           setRemark("this is a test user for tencent cloud");
        }};
        return success(vo);
    }
}
