package com.example.demo.exception;

import com.example.demo.vo.ResultVo;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/14
 * @description
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public ResultVo ErrorHandler(Exception e) {
        if(e instanceof java.lang.RuntimeException){
            return new ResultVo(500,e.getMessage(),"");
        }

        return new ResultVo(500,e.getMessage(),"");
    }
}
