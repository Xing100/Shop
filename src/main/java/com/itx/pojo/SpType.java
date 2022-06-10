package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 类型表
 * @TableName sp_type
 */
@TableName(value ="sp_type")
@Data
public class SpType implements Serializable {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Short typeId;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 删除时间标志
     */
    private Integer deleteTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}