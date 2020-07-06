package com.example.security.security_demo.mapper;

import com.example.security.security_demo.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserRoleMapper {
    int deleteByPrimaryKey(SysUserRole key);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    List<SysUserRole> listByUserId(Integer userId);
}