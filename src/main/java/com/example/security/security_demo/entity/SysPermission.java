package com.example.security.security_demo.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import lombok.Data;

/**
 * sys_permission
 * @author 
 */
@Data
public class SysPermission implements Serializable {
    private Integer id;

    private String url;

    private Integer roleId;

    private String permission;

    private List permissions;

    private static final long serialVersionUID = 1L;

    public List getPermissions() {
        return Arrays.asList(this.permission.trim().split(","));
    }

    public void setPermissions(List permissions) {
        this.permissions = permissions;
    }

}