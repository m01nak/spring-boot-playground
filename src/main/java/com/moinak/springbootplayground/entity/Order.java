package com.moinak.springbootplayground.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue
    Long id;
    String email;
    String orderState;

    public Order() {}

    public Order(String email, String orderState) {
        this.email = email;
        this.orderState = orderState;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", email=" + email + ", orderState=" + orderState + "]";
    }

    
}
