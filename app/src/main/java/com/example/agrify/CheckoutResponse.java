package com.example.agrify;

public class CheckoutResponse {
    private String message;
    private String order_id;

    public CheckoutResponse(String message, String order_id) {
        this.message = message;
        this.order_id = order_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}
