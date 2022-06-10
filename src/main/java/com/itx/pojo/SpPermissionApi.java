package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sp_permission_api
 */
@TableName(value ="sp_permission_api")
@Data
public class SpPermissionApi implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer psId;

    /**
     * 
     */
    private String psApiService;

    /**
     * 
     */
    private String psApiAction;

    /**
     * 
     */
    private String psApiPath;

    /**
     * 
     */
    private Integer psApiOrder;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}