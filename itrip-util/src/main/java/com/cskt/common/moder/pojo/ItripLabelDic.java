package com.cskt.common.moder.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 标签字典表
 * @TableName itrip_label_dic
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItripLabelDic{
    /**
     * 主键
     */
    private Long id;

    /**
     * key值
     */
    private String name;

    /**
     * value值
     */
    private String value;

    /**
     * 描述
     */
    private String description;

    /**
     * 父级标签id(1级标签则为0)
     */
    private Long parentId;

    /**
     * 标签图片地址
     */
    private String pic;

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