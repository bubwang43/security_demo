package com.example.security.security_demo.service;

import com.example.security.security_demo.entity.SysRole;

/**
 * @Description:
 * @Author: Bin.Wang
 * @Date: $ $
 */
public interface SysRoleService {
    public SysRole selectById(Integer id);
    public SysRole selectByName(String roleName);
}
