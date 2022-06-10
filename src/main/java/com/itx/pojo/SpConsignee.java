package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 收货人表
 * @TableName sp_consignee
 */
@TableName(value ="sp_consignee")
@Data
public class SpConsignee implements Serializable {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer cgnId;

    /**
     * 会员id
     */
    private Integer userId;

    /**
     * 收货人名称
     */
    private String cgnName;

    /**
     * 收货人地址
     */
    private String cgnAddress;

    /**
     * 收货人电话
     */
    private String cgnTel;

    /**
     * 邮编
     */
    private String cgnCode;

    /**
     * 删除时间
     */
    private Integer deleteTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}