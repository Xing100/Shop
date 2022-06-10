package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sp_goods_cats
 */
@TableName(value ="sp_goods_cats")
@Data
public class SpGoodsCats implements Serializable {
    /**
     * 分类id
     */
    @TableId(type = IdType.AUTO)
    private Integer catId;

    /**
     * 父级id
     */
    private Integer parentId;

    /**
     * 分类名称
     */
    private String catName;

    /**
     * 是否显示
     */
    private Byte isShow;

    /**
     * 分类排序
     */
    private Integer catSort;

    /**
     * 数据标记
     */
    private Byte dataFlag;

    /**
     * 创建时间
     */
    private Integer createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}