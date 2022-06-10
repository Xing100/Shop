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
 * @TableName sp_user_cart
 */
@TableName(value ="sp_user_cart")
@Data
public class SpUserCart implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer cartId;

    /**
     * 学员id
     */
    private Integer userId;

    /**
     * 购物车详情信息，二维数组序列化信息
     */
    private String cartInfo;

    /**
     * 
     */
    private Date createdAt;

    /**
     * 
     */
    private Date updatedAt;

    /**
     * 
     */
    private Date deleteTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}