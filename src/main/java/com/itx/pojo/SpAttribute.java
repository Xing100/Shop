package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 属性表
 * @TableName sp_attribute
 */
@TableName(value ="sp_attribute")
@Data
public class SpAttribute implements Serializable {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Short attrId;

    /**
     * 属性名称
     */
    private String attrName;

    /**
     * 外键，类型id
     */
    private Short catId;

    /**
     * only:输入框(唯一)  many:后台下拉列表/前台单选框
     */
    private Object attrSel;

    /**
     * manual:手工录入  list:从列表选择
     */
    private Object attrWrite;

    /**
     * 可选值列表信息,例如颜色：白色,红色,绿色,多个可选值通过逗号分隔
     */
    private String attrVals;

    /**
     * 删除时间标志
     */
    private Integer deleteTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}