package me.feathers.demo.order;

import com.alibaba.dubbo.container.Main;

import java.io.IOException;

public class App {

    /**
     * 启动dubbo服务
     */
    public static void main(String[] args) throws IOException {
        Main.main(args);
        System.in.read();
    }
    
    /*
    
    摘录启动日志如下：
    2019-03-13 19:54:32,886 INFO [com.alibaba.dubbo.config.AbstractConfig] - 
     [DUBBO] Export dubbo service 
            me.feathers.demo.order.OrderService 
     to url 
            dubbo://10.0.75.1:20880/me.feathers.demo.order.OrderService
                ?anyhost=true&application=order-provider
                    &dubbo=2.5.3&interface=me.feathers.demo.order.OrderService
                    &methods=getOrderById,addOrder,deleteOrder
                    &owner=feathers
                    &pid=11296&side=provider
                    &timestamp=1552478072598
     , dubbo version: 2.5.3, current host: 127.0.0.1
    
    此时，应用 order-provider 已经提供了一个url如上的dubbo服务
     */
}
