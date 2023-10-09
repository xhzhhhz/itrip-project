package com.cskt.common.moder.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName itrip_hotel_trading_area
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItripHotelTradingArea{
    /**
     * 
     */
    private Long id;

    /**
     * 酒店id
     */
    private Long hotelId;

    /**
     * 商圈id
     */
    private Long areaId;

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