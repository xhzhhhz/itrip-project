package com.cskt.common.moder.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

/**
 * 
 * @TableName itrip_user_link_user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItripUserLinkUser{
    /**
     * 主键
     */
    private Long id;

    /**
     * 常用联系人姓名
     */
    private String linkUserName;

    /**
     * 证件号码
     */
    private String linkIdCard;

    /**
     * 常用联系人电话
     */
    private String linkPhone;

    /**
     * 用户id
     */
    private Integer userId;

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
     * 逻辑删除（0:未删除；1：删除）
     */
    private Integer isDeleted;

    /**
     * 证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
     */
    private Integer linkIdCardType;


}