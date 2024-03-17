package com.example.agrify;

import java.io.Serializable;

public class Attribute implements Serializable {
    private int id;
    private int product_id = 0;
    private String size = "";
    private String price = "";
    private int stock = 0;
    private String sku = "";
    private int status = 0;
    private String created_at = "";
    private String updated_at = "";

    public Attribute(int id, int product_id, String size, String price, int stock,
                     String sku, int status, String created_at, String updated_at) {
        this.id = id;
        this.product_id = product_id;
        this.size = size;
        this.price = price;
        this.stock = stock;
        this.sku = sku;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    // Getters and setters for each property
}
