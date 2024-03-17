package com.example.agrify;

import java.util.List;

public class GetCartItemsResponse {
    private List<CartItemResponse> carts;

    public GetCartItemsResponse(List<CartItemResponse> carts) {
        this.carts = carts;
    }

    public List<CartItemResponse> getCarts() {
        return carts;
    }

    public void setCarts(List<CartItemResponse> carts) {
        this.carts = carts;
    }
}
