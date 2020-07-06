package com.example.security.security_demo.service.Impl;

import com.example.security.security_demo.entity.SysPermission;
import com.example.security.security_demo.mapper.SysPermissionMapper;
import com.example.security.security_demo.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: Bin.Wang
 * @Date: $ $
 */
@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public List<SysPermission> listByRoleId(Integer roleId) {
        return sysPermissionMapper.listByRoleId(roleId);
    }
}
