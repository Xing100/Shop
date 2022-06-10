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
 * @TableName sp_report_2
 */
@TableName(value ="sp_report_2")
@Data
public class SpReport2 implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String rp2Page;

    /**
     * 
     */
    private Integer rp2Count;

    /**
     * 
     */
    private Date rp2Date;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}