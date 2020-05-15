package com.example.demo.service;

import com.example.demo.entity.DocumentEntity;

import java.util.List;

public interface DocumentService {

    List<DocumentEntity> findAll(Integer size,Integer page);

    DocumentEntity findOne(Integer id);
}
