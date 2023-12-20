package com.bidder.service;

import com.bidder.models.Buyer;
import com.bidder.models.Seller;
import com.bidder.models.User;
import com.bidder.models.UserType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UserService {

    private static Map<String, User> users;

    public UserService() {
        users = new HashMap<>();
    }

    public void addBuyer(String userId){
        User buyer = new Buyer(userId);
        users.put(buyer.getUserId(), buyer);

    }

    public void addSeller(String userId){
        User seller = new Seller(userId);
        users.put(seller.getUserId(), seller);
    }

    public User getUser(String userID){
        return users.get(userID);
    }

    public Set<String> getSellers(){

        return users.entrySet()
                .stream()
                .filter(data -> data.getValue().getType().equals(UserType.SELLER))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    public Set<String> getBuyers(){

        return users.entrySet()
                .stream()
                .filter(data -> data.getValue().getType().equals(UserType.BUYER))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }


}
