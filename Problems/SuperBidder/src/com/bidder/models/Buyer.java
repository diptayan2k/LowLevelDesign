package com.bidder.models;

public class Buyer extends User{

    public Buyer(String userId) {
        super(userId, UserType.BUYER);
    }
}
