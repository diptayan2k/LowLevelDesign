package com.bidder.models;

public class Seller extends User {

    public Seller(String userId) {
        super(userId, UserType.SELLER);
    }
}
