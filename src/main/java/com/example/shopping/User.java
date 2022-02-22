package com.example.shopping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private int id;

    private String username;
    private String password;
    private int shippingAddressId;
    private int creditPaymentId;
    private int bankPaymentId;

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getShippingAddressId() {
        return shippingAddressId;
    }

    public int getCreditPaymentId() {
        return creditPaymentId;
    }

    public int getBankPaymentId() {
        return bankPaymentId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setShippingAddressId(int shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }

    public void setCreditPaymentId(int creditPaymentId) {
        this.creditPaymentId = creditPaymentId;
    }

    public void setBankPaymentId(int bankPaymentId) {
        this.bankPaymentId = bankPaymentId;
    }
}
