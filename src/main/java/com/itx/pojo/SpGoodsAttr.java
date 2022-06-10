package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 商品-属性关联表
 * @TableName sp_goods_attr
 */
@TableName(value ="sp_goods_attr")
@Data
public class SpGoodsAttr implements Serializable {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 属性id
     */
    private Short attrId;

    /**
     * 商品对应属性的值
     */
    private String attrValue;

    /**
     * 该属性需要额外增加的价钱
     */
    private BigDecimal addPrice;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}