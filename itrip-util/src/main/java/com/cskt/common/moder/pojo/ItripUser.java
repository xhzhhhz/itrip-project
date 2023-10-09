package com.cskt.common.moder.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户表
 * @TableName itrip_user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItripUser{
    /**
     * 主键
     */
    private Long id;

    /**
     * 若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
     */
    private String userCode;

    /**
     * 若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
     */
    private String userPassword;

    /**
     * 用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
     */
    private Integer userType;

    /**
     * 平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
     */
    private Long flatId;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 微信号
     */
    private String weChat;

    /**
     * qq账号
     */
    private String qq;

    /**
     * 微博账号
     */
    private String weibo;

    /**
     * 百度账号
     */
    private String baidu;

    /**
     * 
     */
    private Date creationDate;

    /**
     * 
     */
    private Long createdBy;

    /**
     * 
     */
    private Date modifyDate;

    /**
     * 
     */
    private Long modifiedBy;

    /**
     * 是否激活,(0 false，1 true,默认是0)
     */
    private Integer activated;

    /**
     * 逻辑删除
     */
    private Integer isDeleted;

}