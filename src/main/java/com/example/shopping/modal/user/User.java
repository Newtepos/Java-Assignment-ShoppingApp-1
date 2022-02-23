package com.example.shopping.modal.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String username;
    private String password;
    private boolean setLoggedIn;
    private int shippingAddressId;
    private int creditPaymentId;
    private int bankPaymentId;


    public User() {
    }

    public User(String username, String password) {
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

    public boolean isSetLoggedIn() {
        return setLoggedIn;
    }

    public void setSetLoggedIn(boolean setLoggedIn) {
        this.setLoggedIn = setLoggedIn;
    }
}
