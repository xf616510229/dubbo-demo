package me.feathers.demo.order.impl;

import me.feathers.demo.order.OrderService;
import me.feathers.demo.order.vo.BaseOrderResponse;
import me.feathers.demo.order.vo.GetOrderByIdResponse;
import me.feathers.demo.order.vo.Order;

/**
 * 订单接口实现 
 * version:2.0
 * @author Feahters
 * @date 2019/3/13
 */
public class OrderServiceImpl2 implements OrderService {

    /**
     * 添加订单
     */
    @Override
    public BaseOrderResponse addOrder(Order order) {
        BaseOrderResponse result = new BaseOrderResponse();
        result.setCode("00-00");
        result.setMsg("添加订单成功version2.o");
        return result;
    }

    /**
     * 删除订单
     */
    public BaseOrderResponse deleteOrder(String orderId){
        BaseOrderResponse result = new BaseOrderResponse();
        result.setCode("00-00");
        result.setMsg("删除订单成功version2.o");
        return result;
    }


    /**
     * 查询订单
     */
    public GetOrderByIdResponse getOrderById(String orderId){
        GetOrderByIdResponse result = new GetOrderByIdResponse();
        result.setCode("00-00");
        result.setMsg("查询成功version2.o");
        Order order = new Order();
        order.setOrderId(100L);
        order.setAmount("$100");
        order.setUserId("u123");
        order.setProductName("水晶大白菜version2.o");
        result.setOrder(order);
        return result;
    }
    
}
  