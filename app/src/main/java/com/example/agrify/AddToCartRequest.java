package com.example.agrify;

public class AddToCartRequest {
    private int userId;
    private int productId;
    private String size;
    private int quantity;

    public AddToCartRequest(int userId, int productId, String size, int quantity) {
        this.userId = userId;
        this.productId = productId;
        this.size = size;
        this.quantity = quantity;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
