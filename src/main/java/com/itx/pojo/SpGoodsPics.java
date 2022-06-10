package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 商品-相册关联表
 * @TableName sp_goods_pics
 */
@TableName(value ="sp_goods_pics")
@Data
public class SpGoodsPics implements Serializable {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer picsId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 相册大图800*800
     */
    private String picsBig;

    /**
     * 相册中图350*350
     */
    private String picsMid;

    /**
     * 相册小图50*50
     */
    private String picsSma;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}