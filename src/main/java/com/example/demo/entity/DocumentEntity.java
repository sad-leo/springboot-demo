package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/15
 * @description
 */
@Data
public class DocumentEntity {
    private Integer id;
    private String tm;
    private Integer xsh;
    private String yh;
    private String wh;
    private String zrz;
    private Date rq;
    private String bz;
    private String dh;
    private Integer ownerid;
}
