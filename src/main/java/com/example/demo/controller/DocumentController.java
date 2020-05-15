package com.example.demo.controller;

import com.example.demo.service.DocumentService;
import com.example.demo.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/15
 * @description
 */
@RestController
@RequestMapping("/document")
@Slf4j
@Api(value = "/document",tags = "文档接口")
public class DocumentController {

    @Autowired
    DocumentService documentService;

    @GetMapping("/{size}/{page}")
    @ApiOperation(value = "获取所有文档记录")
    public ResultVo getDocumentList(@PathVariable Integer size, @PathVariable Integer page) {
        return ResultVo.success(this.documentService.findAll(size, page));
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "获取指定id记录")
    public ResultVo getDocumetById(@PathVariable("id") Integer id) {
        return ResultVo.success(this.documentService.findOne(id));
    }
}
