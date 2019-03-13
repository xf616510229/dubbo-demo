package me.feathers.demo.order;

import me.feathers.demo.order.vo.GetOrderByIdResponse;
import me.feathers.demo.order.vo.Order;
import me.feathers.demo.order.vo.BaseOrderResponse;

/**
 * 订单接口
 * @author Feahters
 * @date 2019/3/13
 */
public interface OrderService {

    /**
     * 添加订单
     */
    BaseOrderResponse addOrder(Order order);

    /**
     * 删除订单
     */
    BaseOrderResponse deleteOrder(String orderId);


    /**
     * 查询订单
     */
    GetOrderByIdResponse getOrderById(String orderId);
    
}
  