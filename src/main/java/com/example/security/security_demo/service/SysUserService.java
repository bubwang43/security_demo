package com.example.security.security_demo.service;

import com.example.security.security_demo.entity.SysUser;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: Bin.Wang
 * @Date: $ $
 */
public interface SysUserService {
    public SysUser selectById(Integer id);

    public SysUser selectByName(String name);
}
