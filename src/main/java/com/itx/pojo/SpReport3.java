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
 * @TableName sp_report_3
 */
@TableName(value ="sp_report_3")
@Data
public class SpReport3 implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户来源
     */
    private String rp3Src;

    /**
     * 数量
     */
    private Integer rp3Count;

    /**
     * 
     */
    private Date rp3Date;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}