package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/14
 * @description
 */
@RestController
public class Test {

    @RequestMapping("/")
    public String test(){
        return "hello";
    }


}
