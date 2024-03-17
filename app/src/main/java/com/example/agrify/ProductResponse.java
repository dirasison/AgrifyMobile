package com.example.agrify;

import java.util.List;

public class ProductResponse {
    private List<ProductDataClass> products;

    public ProductResponse(List<ProductDataClass> products) {
        this.products = products;
    }

    public List<ProductDataClass> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDataClass> products) {
        this.products = products;
    }
}
