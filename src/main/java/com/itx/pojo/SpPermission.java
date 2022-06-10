package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * 权限表
 * @TableName sp_permission
 */
@TableName(value ="sp_permission")
@Data
public class SpPermission implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Short psId;

    /**
     * 权限名称
     */
    private String psName;

    /**
     * 父id
     */
    private Short psPid;

    /**
     * 控制器
     */
    private String psC;

    /**
     * 操作方法
     */
    private String psA;

    /**
     * 权限等级
     */
    private Object psLevel;

    @TableField(exist = false)
    private String path;

    @TableField(exist = false)
    private List<SpPermission> children;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}