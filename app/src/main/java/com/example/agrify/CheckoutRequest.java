package com.example.agrify;

public class CheckoutRequest {
    private String name;
    private String payment_gateway;
    private String accept;

    public CheckoutRequest(String name, String payment_gateway, String accept) {
        this.name = name;
        this.payment_gateway = payment_gateway;
        this.accept = accept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPayment_gateway() {
        return payment_gateway;
    }

    public void setPayment_gateway(String payment_gateway) {
        this.payment_gateway = payment_gateway;
    }

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }
}
