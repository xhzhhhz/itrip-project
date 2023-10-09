package com.cskt.common.moder.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 实时库存表
 * @TableName itrip_hotel_temp_store
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItripHotelTempStore{
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Integer hotelId;

    /**
     * 商品id
     */
    private Long roomId;

    /**
     * 记录时间
     */
    private Date recordDate;

    /**
     * 库存
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