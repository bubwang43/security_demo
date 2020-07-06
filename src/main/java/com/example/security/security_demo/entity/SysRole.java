package com.example.security.security_demo.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_role
 * @author 
 */
@Data
public class SysRole implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}