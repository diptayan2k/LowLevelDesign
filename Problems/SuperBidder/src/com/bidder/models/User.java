package com.bidder.models;

public abstract class User {

    private String userId;
    private UserType type;

    public User(String userId, UserType type) {
        this.userId = userId;
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public UserType getType() {
        return type;
    }
}
