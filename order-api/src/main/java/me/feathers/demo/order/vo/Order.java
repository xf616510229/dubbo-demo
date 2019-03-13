package me.feathers.demo.order.vo;

import java.io.Serializable;

/**
 * 注意，一定要实现序列化接口
 * @author Feahters
 * @date 2019/3/13
 */
public class Order implements Serializable {

    private String userId;
    
    private Long orderId;

    private String productName;

    private String amount;
    

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId='" + userId + '\'' +
                ", orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
