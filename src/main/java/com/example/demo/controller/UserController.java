package com.example.demo.controller;

import com.example.demo.service.WbUserService;
import com.example.demo.vo.WbUserVo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/14
 * @description
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    WbUserService wbUserService;

    @GetMapping("/getUserList")
    @ApiOperation(value = "测试接口", notes="查询测试接口")
    public List<WbUserVo> getUserList() {
        return wbUserService.getUserList();
    }

    @PutMapping("/getUserList")
    @ApiOperation(value = "测试接口", notes="修改测试接口")
    public String gutUserList(@RequestParam String name) {
        return name;
    }
}
