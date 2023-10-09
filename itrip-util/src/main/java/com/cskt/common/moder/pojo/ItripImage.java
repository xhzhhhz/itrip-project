package com.cskt.common.moder.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 图片表
 * @TableName itrip_image
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItripImage{
    /**
     * 主键
     */
    private Long id;

    /**
     * 图片类型(0:酒店图片1:房间图片2:评论图片)
     */
    private String type;

    /**
     * 关联id
     */
    private Long targetId;

    /**
     * 图片s上传顺序位置
     */
    private Integer position;

    /**
     * 图片地址
     */
    private String imgUrl;

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