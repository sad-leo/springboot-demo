package com.example.demo.vo;

import lombok.Data;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/14
 * @description
 */
@Data
public class ResultVo<T> {

    private Integer code;

    private String msg;

   private T data;

    public ResultVo(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
