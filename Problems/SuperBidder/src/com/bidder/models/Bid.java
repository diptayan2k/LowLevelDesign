package com.bidder.models;

public class Bid {

    private String buyerId;
    private int amount;

    public Bid(String buyerId, int amount) {
        this.buyerId = buyerId;
        this.amount = amount;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public int getAmount() {
        return amount;
    }
}
