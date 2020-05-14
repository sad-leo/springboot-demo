package com.example.demo.service.impl;

import com.example.demo.dao.WbUserMapper;
import com.example.demo.entity.WbUserEntity;
import com.example.demo.service.WbUserService;
import com.example.demo.vo.WbUserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
 * @author wujie
 * @version 1.0
 * @Date 2020/5/14
 * @description
 */
@Service
@Slf4j
public class WbUserServiceImpl implements WbUserService {

    @Autowired
    WbUserMapper wbUserMapper;

    @Override
    public List<WbUserVo> getUserList() {
        List<WbUserEntity> userList = wbUserMapper.getUserList();
        List<WbUserVo> voList = new ArrayList<>();
        for(WbUserEntity user : userList){
            WbUserVo wbUserVo = new WbUserVo();
            BeanUtils.copyProperties(user,wbUserVo);
            voList.add(wbUserVo);
        }
        return voList;
    }
}
