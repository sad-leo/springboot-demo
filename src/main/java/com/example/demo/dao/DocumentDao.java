package com.example.demo.dao;

import com.example.demo.entity.DocumentEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/15
 * @description
 */
@Mapper
public interface DocumentDao {

    List<DocumentEntity> findAll(Integer size,Integer page);

    DocumentEntity findOne(Integer id);
}
