package com.example.demo.controller;

import com.example.demo.entity.WbUserEntity;
import com.example.demo.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/15
 * @description
 */
@Api(value = "/",tags = "登录认证")
@RestController
public class LoginController {

    private static Map map = new HashMap();
    static {
        map.put("userid","admin");
        map.put("pwd","admin");
    }

    @PostMapping("/login")
    @ApiOperation(value = "登录",notes = "登录")
    public ResultVo login(@RequestBody WbUserEntity userEntity){

        if(userEntity.getUserId().equals(map.get("userid")) && userEntity.getPassword().equals(map.get("pwd"))){
            return ResultVo.success();
        }

        return ResultVo.fail("用户名或密码错误");
    }
}
