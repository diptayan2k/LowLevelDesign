package com.atm.models;

public class Account {

    private String customerName;
    private String accountNo;
    private int balance;

    public Account(String customerName, String accountNo, int balance) {
        this.customerName = customerName;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
