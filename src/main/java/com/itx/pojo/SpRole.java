package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sp_role
 */
@TableName(value ="sp_role")
@Data
public class SpRole implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Short roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 权限ids,1,2,5
     */
    private String psIds;

    /**
     * 控制器-操作,控制器-操作,控制器-操作
     */
    private String psCa;

    /**
     * 
     */
    private String roleDesc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}