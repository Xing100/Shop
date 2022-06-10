package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * 管理员表
 * @TableName sp_manager
 */
@TableName(value ="sp_manager")
@Data
public class SpManager implements Serializable {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer mgId;

    /**
     * 名称
     */
    private String mgName;

    /**
     * 密码
     */
    private String mgPwd;

    /**
     * 注册时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer mgTime;

    /**
     * 角色id
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer roleId;

    /**
     * 
     */
    private String mgMobile;

    /**
     * 
     */
    private String mgEmail;

    /**
     * 1：表示启用 0:表示禁用
     */
    private Boolean mgState;

    @TableField(exist = false)
    private List<SpRole> spRole;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}