package com.cskt.common.moder.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 
 * @TableName itrip_hotel_feature
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItripHotelFeature{
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long hotelId;

    /**
     * 
     */
    private Long featureId;

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