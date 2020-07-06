package com.example.security.security_demo.service;

import com.example.security.security_demo.entity.SysUserRole;

import java.util.List;

/**
 * @Description:
 * @Author: Bin.Wang
 * @Date: $ $
 */
public interface SysUserRoleService {
    public List<SysUserRole> listByUserId(Integer userId);
}
