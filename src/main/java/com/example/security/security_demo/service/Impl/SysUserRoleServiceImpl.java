package com.example.security.security_demo.service.Impl;

import com.example.security.security_demo.entity.SysUserRole;
import com.example.security.security_demo.mapper.SysUserRoleMapper;
import com.example.security.security_demo.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: Bin.Wang
 * @Date: $ $
 */
@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public List<SysUserRole> listByUserId(Integer userId) {
        return sysUserRoleMapper.listByUserId(userId);
    }
}
