package com.cskt.common.moder.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 
 * @TableName itrip_hotel_extend_property
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItripHotelExtendProperty{
    /**
     * 
     */
    private Long id;

    /**
     * 酒店id
     */
    private Long hotelId;

    /**
     * 推广属性
     */
    private Long extendPropertyId;

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