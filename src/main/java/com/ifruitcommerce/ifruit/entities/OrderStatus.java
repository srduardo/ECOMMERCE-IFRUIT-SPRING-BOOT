package com.ifruitcommerce.ifruit.entities;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int num;

    OrderStatus(int num){
        this.num = num;
    }
}
