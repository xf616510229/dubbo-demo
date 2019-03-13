package me.feathers.demo.order.vo;

import java.io.Serializable;

/**
 * @author Feahters
 * @date 2019/3/13
 */
public class BaseOrderResponse implements Serializable {

    private String code;

    private String msg;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "BaseOrderResponse{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
