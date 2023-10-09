package com.cskt.common.moder.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 区域字典表
 * @TableName itrip_area_dic
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItripAreaDic  {
    /**
     * 主键
     */
    private Long id;

    /**
     * 区域名称
     */
    private String name;

    /**
     * 区域编号
     */
    private String areaNo;

    /**
     * 父级区域
     */
    private Long parent;

    /**
     * 0:未激活 1:已激活
     */
    private Integer isActivated;

    /**
     * 是否是商圈(0:不是 1:是)
     */
    private Integer isTradingArea;

    /**
     * (0:不是 1：是)
     */
    private Integer isHot;

    /**
     * 区域级别(0:国家级 1:省级 2:市级 3:县/区)
     */
    private Integer level;

    /**
     * 1:国内 2：国外
     */
    private Integer isChina;

    /**
     * 
     */
    private String pinyin;

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





}