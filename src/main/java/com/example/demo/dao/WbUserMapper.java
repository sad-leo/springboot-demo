package com.example.demo.dao;

import com.example.demo.entity.WbUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WbUserMapper {
    List<WbUserEntity> getUserList();
}
