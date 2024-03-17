package com.example.agrify;

public class CartItemResponse {
    private String product_name;
    private double product_price;
    private String size;
    private String quantity;
    private double total;

    public CartItemResponse(String product_name, double product_price, String size, String quantity, double total) {
        this.product_name = product_name;
        this.product_price = product_price;
        this.size = size;
        this.quantity = quantity;
        this.total = total;
    }

    public String getProductName() {
        return product_name;
    }

    public double getProductPrice() {
        return product_price;
    }

    public String getSize() {
        return size;
    }

    public String getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setProductName(String product_name) {
        this.product_name = product_name;
    }

    public void setProductPrice(double product_price) {
        this.product_price = product_price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
