package com.example.security.security_demo.service;

import com.example.security.security_demo.entity.SysPermission;

import java.util.List;

/**
 * @Description:
 * @Author: Bin.Wang
 * @Date: $ $
 */
public interface SysPermissionService {
    public List<SysPermission> listByRoleId(Integer roleId);
}
