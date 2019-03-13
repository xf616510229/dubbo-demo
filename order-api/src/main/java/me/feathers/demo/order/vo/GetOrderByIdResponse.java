package me.feathers.demo.order.vo;

/**
 * @author Feahters
 * @date 2019/3/13
 */
public class GetOrderByIdResponse extends BaseOrderResponse {

    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "GetOrderByIdResponse{" +
                "order=" + order +
                '}';
    }
}
