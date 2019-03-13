package me.feathers.demo.client;

import me.feathers.demo.order.OrderService;
import me.feathers.demo.order.vo.BaseOrderResponse;
import me.feathers.demo.order.vo.Order;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        // 调用服务

        // 1. 从spring容器中获取远程服务代理对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order-consumer.xml");

        // 2. 调用下单接口
        OrderService services = (OrderService) context.getBean("orderServices");

        Order order = new Order();
        order.setProductName("哈哈");
        order.setUserId("u112000");
        order.setAmount("$1");
        order.setOrderId(123L);
        BaseOrderResponse response = services.addOrder(order);
        
        // 3. 展示响应
        System.out.println(response);
        System.in.read();
    }
}
