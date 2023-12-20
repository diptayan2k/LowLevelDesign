package com.bidder.service;

import com.bidder.models.Auction;
import com.bidder.models.Bid;
import com.bidder.models.User;

import java.util.List;
import java.util.Set;

public class SuperBidder {

    private AuctionService auctionService;
    private UserService userService;

    public SuperBidder(AuctionService auctionService, UserService userService) {
        this.auctionService = auctionService;
        this.userService = userService;
    }

    public void addSeller(String sellerId){
        userService.addSeller(sellerId);
    }

    public void addBuyer(String buyerId){
        userService.addBuyer(buyerId);
    }

    public void createAuction(String auctionId, int low, int high, String sellerId){

        Set<String> sellers = userService.getSellers();
        if(!sellers.contains(sellerId)){
            System.out.println("Seller not found!!");
            return;
        }
        auctionService.createAuction(auctionId, low, high, sellerId);
    }

    public void closeAuction(String auctionId){
        auctionService.closeAuction(auctionId);
    }

    public void createBid(String buyerId, String auctionId, int amount){
        Set<String> buyers = userService.getBuyers();
        if(!buyers.contains(buyerId)){
            System.out.println("Buyer not found!!");
            return;
        }

        auctionService.createBid(buyerId, auctionId, amount);
    }

    public void updateBid(String buyerId, String auctionId, int amount){
        createBid(buyerId, auctionId, amount);
    }

    public void withdrawBid(String buyerId, String auctionId){
        auctionService.withdrawBid(buyerId, auctionId);
    }
}
