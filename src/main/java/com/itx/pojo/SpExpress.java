package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 快递表
 * @TableName sp_express
 */
@TableName(value ="sp_express")
@Data
public class SpExpress implements Serializable {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer expressId;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 订单快递公司名称
     */
    private String expressCom;

    /**
     * 快递单编号
     */
    private String expressNu;

    /**
     * 记录生成时间
     */
    private Integer createTime;

    /**
     * 记录修改时间
     */
    private Integer updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}