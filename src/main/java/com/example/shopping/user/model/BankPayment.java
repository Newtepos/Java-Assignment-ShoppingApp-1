package com.example.shopping.user.model;

public class BankPayment {
    private String bankHolderNumber;
    private int icNumber;

    public String getBankHolderNumber() {
        return bankHolderNumber;
    }

    public void setBankHolderNumber(String bankHolderNumber) {
        this.bankHolderNumber = bankHolderNumber;
    }

    public int getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(int icNumber) {
        this.icNumber = icNumber;
    }
}
