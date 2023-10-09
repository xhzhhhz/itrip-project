package com.cskt.common.moder.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 酒店房间表
 * @TableName itrip_hotel_room
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItripHotelRoom implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 酒店ID
     */
    private Long hotelId;

    /**
     * 房间名称
     */
    private String roomTitle;

    /**
     * 房间价格
     */
    private BigDecimal roomPrice;

    /**
     * 酒店床型
     */
    private Long roomBedTypeId;

    /**
     * 是否包含早餐
     */
    private Integer isHavingBreakfast;

    /**
     * 1:在线付 2:到店付 3:不限
     */
    private Integer payType;

    /**
     * 满意度（冗余字段，在用户评论后更新）
     */
    private Long satisfaction;

    /**
     * 是否可预订(0:不可以 1:可以)
     */
    private Integer isBook;

    /**
     * 是否可取消(0:不可 1:可以)
     */
    private Integer isCancel;

    /**
     * 是否及时响应(0:不及时 1:及时)
     */
    private Integer isTimelyResponse;

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