package me.feathers.demo.order.impl;

import me.feathers.demo.order.OrderService;
import me.feathers.demo.order.vo.BaseOrderResponse;
import me.feathers.demo.order.vo.GetOrderByIdResponse;
import me.feathers.demo.order.vo.Order;

/**
 * 订单接口实现
 * @author Feahters
 * @date 2019/3/13
 */
public class OrderServiceImpl implements OrderService {

    /**
     * 添加订单
     */
    @Override
    public BaseOrderResponse addOrder(Order order) {
        BaseOrderResponse result = new BaseOrderResponse();
        result.setCode("00-00");
        result.setMsg("添加订单成功");
        return result;
    }

    /**
     * 删除订单
     */
    public BaseOrderResponse deleteOrder(String orderId){
        BaseOrderResponse result = new BaseOrderResponse();
        result.setCode("00-00");
        result.setMsg("删除订单成功");
        return result;
    }


    /**
     * 查询订单
     */
    public GetOrderByIdResponse getOrderById(String orderId){
        GetOrderByIdResponse result = new GetOrderByIdResponse();
        result.setCode("00-00");
        result.setMsg("查询成功");
        Order order = new Order();
        order.setOrderId(100L);
        order.setAmount("$100");
        order.setUserId("u123");
        order.setProductName("水晶大白菜");
        result.setOrder(order);
        return result;
    }
    
}
  