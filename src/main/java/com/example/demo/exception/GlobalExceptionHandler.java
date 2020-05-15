package com.example.demo.exception;

import com.example.demo.vo.ResultVo;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/14
 * @description 全局异常处理
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResultVo ErrorHandler(Exception e) {
        return ResultVo.fail("服务器异常：" + e.getMessage());
    }
}
