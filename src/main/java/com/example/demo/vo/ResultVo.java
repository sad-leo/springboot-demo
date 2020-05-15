package com.example.demo.vo;

import lombok.Data;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/14
 * @description 定义统一的返回值格式
 */
@Data
public class ResultVo<T> {

    private Integer code;

    private String msg;

    private T data;

    public static ResultVo success() {
        return success(null);
    }

    public static ResultVo success(Object data) {
        ResultVo result = new ResultVo();
        result.setCode(0);
        result.setMsg("SUCCESS");
        result.setData(data);
        return result;
    }

    public static ResultVo fail(String msg) {
        return fail(msg, null);
    }

    public static ResultVo fail(String msg, Object data) {
        ResultVo result = new ResultVo();
        result.setCode(1);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
