package com.example.security.security_demo.service.Impl;

import com.example.security.security_demo.entity.SysRole;
import com.example.security.security_demo.mapper.SysRoleMapper;
import com.example.security.security_demo.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: Bin.Wang
 * @Date: $ $
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public SysRole selectById(Integer id) {
        return sysRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public SysRole selectByName(String roleName) {
        return sysRoleMapper.selectByName(roleName);
    }
}
