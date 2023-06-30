package com.zcr.springbootbase.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aida
 * @version 1.0
 * @project SpringbootBase
 * @description Hello控制器（接口测试代码）
 * @date 2023/6/30 14:14:06
 */

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}
