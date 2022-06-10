package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName sp_report_1
 */
@TableName(value ="sp_report_1")
@Data
public class SpReport1 implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户数
     */
    private Integer rp1UserCount;

    /**
     * 地区
     */
    private String rp1Area;

    /**
     * 
     */
    private Date rp1Date;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}