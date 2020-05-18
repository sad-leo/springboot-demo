package com.example.demo.controller;

import com.example.demo.service.WbUserService;
import com.example.demo.vo.ResultVo;
import com.example.demo.vo.WbUserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/14
 * @description
 */
@RestController
@RequestMapping("/user")
@Slf4j
@Api(value = "/user",tags = "用户接口")
public class UserController {

    @Autowired
    WbUserService wbUserService;

    @GetMapping("/")
    @ApiOperation(value = "测试接口", notes="查询测试接口")
    public ResultVo getUserList() {
        return ResultVo.success(wbUserService.getUserList());
    }

    @PutMapping("/")
    @ApiOperation(value = "测试接口", notes="修改测试接口")
    public ResultVo gutUserList(@RequestBody WbUserVo userVo) {

        return ResultVo.success(userVo);
    }
}
