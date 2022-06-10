package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 商品订单关联表
 * @TableName sp_order_goods
 */
@TableName(value ="sp_order_goods")
@Data
public class SpOrderGoods implements Serializable {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 商品单价
     */
    private BigDecimal goodsPrice;

    /**
     * 购买单个商品数量
     */
    private Byte goodsNumber;

    /**
     * 商品小计价格
     */
    private BigDecimal goodsTotalPrice;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}