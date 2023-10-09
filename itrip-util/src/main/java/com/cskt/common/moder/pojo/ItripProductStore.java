package com.cskt.common.moder.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 原始库存表
 * @TableName itrip_product_store
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItripProductStore{
    /**
     * 
     */
    private Long id;

    /**
     * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
     */
    private Integer productType;

    /**
     * 商品id
     */
    private Long productId;

    /**
     * 商品库存
     */
    private Integer store;

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