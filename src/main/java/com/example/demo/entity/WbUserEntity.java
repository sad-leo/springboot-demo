package com.example.demo.entity;

import lombok.Data;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/14
 * @description
 */
@Data
public class WbUserEntity {

    private String userId;
    private String userName;
    private String displayName;

    @Override
    public String toString() {
        return "WbUserEntity{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}
