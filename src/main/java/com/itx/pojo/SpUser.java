package com.itx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 会员表
 * @TableName sp_user
 */
@TableName(value ="sp_user")
@Data
public class SpUser implements Serializable {
    /**
     * 自增id
     */
    @TableId(type = IdType.AUTO)
    private Integer userId;

    /**
     * 登录名
     */
    private String username;

    /**
     * qq官方唯一编号信息
     */
    private String qqOpenId;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 新用户注册邮件激活唯一校验码
     */
    private String userEmailCode;

    /**
     * 新用户是否已经通过邮箱激活帐号
     */
    private Object isActive;

    /**
     * 性别
     */
    private Object userSex;

    /**
     * qq
     */
    private String userQq;

    /**
     * 手机
     */
    private String userTel;

    /**
     * 学历
     */
    private Object userXueli;

    /**
     * 爱好
     */
    private String userHobby;

    /**
     * 简介
     */
    private String userIntroduce;

    /**
     * 创建时间
     */
    private Integer createTime;

    /**
     * 修改时间
     */
    private Integer updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}