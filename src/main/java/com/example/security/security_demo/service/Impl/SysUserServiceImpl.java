package com.example.security.security_demo.service.Impl;

import com.example.security.security_demo.entity.SysUser;
import com.example.security.security_demo.mapper.SysUserMapper;
import com.example.security.security_demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: Bin.Wang
 * @Date: 10:21$ 2020/07/03$
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectById(Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public SysUser selectByName(String name) {
        return sysUserMapper.selectByName(name);
    }
}
