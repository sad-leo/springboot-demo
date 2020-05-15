package com.example.demo.service.impl;

import com.example.demo.dao.DocumentDao;
import com.example.demo.entity.DocumentEntity;
import com.example.demo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/15
 * @description
 */
@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentDao documentDao;

    @Override
    public List<DocumentEntity> findAll(Integer size,Integer page) {
        return this.documentDao.findAll(size,page);
    }

    @Override
    public DocumentEntity findOne(Integer id) {
        return this.documentDao.findOne(id);
    }
}
