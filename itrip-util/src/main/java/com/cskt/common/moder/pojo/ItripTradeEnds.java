package com.cskt.common.moder.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单支付完成后，系统需对该订单进行后续处理，如减库存等。处理完成后，删除此表中的订单记录
 * @TableName itrip_trade_ends
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItripTradeEnds{
    /**
     * 订单ID
     */
    private Long id;

    /**
     * 订单编号(注意非支付宝交易编号tradeNo)
     */
    private String orderNo;

    /**
     * 标识字段(默认0：未处理；1：处理中)
     */
    private Integer flag;

    /**
     * 逻辑删除（0:未删除；1：删除）
     */
    private Integer isDeleted;

}