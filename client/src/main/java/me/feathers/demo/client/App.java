package me.feathers.demo.client;

import com.alibaba.dubbo.rpc.RpcContext;
import me.feathers.demo.order.OrderService;
import me.feathers.demo.order.vo.BaseOrderResponse;
import me.feathers.demo.order.vo.Order;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

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
        //BaseOrderResponse response = services.addOrder(order);
        //异步调用
        services.addOrder(order);
        Future<BaseOrderResponse> future = RpcContext.getContext().getFuture();
        BaseOrderResponse response = null;
        try {
            response = future.get(); // 阻塞
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        // 3. 展示响应
        System.out.println(response);
        System.in.read();
    }
}
