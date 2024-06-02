package com.ifruitcommerce.ifruit.entities;

import java.io.Serializable;

public class OrderItem implements Serializable{
    private static final long serialVersionUID = -78412369548928L;
    private Integer quantity;
    private Double price;

    public OrderItem() { }

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
