package com.bidder.service;

import com.bidder.models.Auction;
import com.bidder.models.Bid;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AuctionService {

    private static Map<String, Auction> auctions;

    public AuctionService() {
        auctions = new HashMap<>();
    }

    public void createAuction(String id, int low, int high, String userId){
        Auction auction = new Auction(id, low, high, userId);
        auctions.put(auction.getId(), auction);
        System.out.println("Auction created successfully!!");
    }

    public void createBid(String userId, String auctionId, int amount){
        Auction auction = auctions.get(auctionId);
        if(auction.getLowerlim() > amount || auction.getHigherLim() < amount){
            System.out.println("Bid not in limit!!");
        } else {
            Bid bid = new Bid(userId, amount);
            auction.addBid(bid);
            System.out.println("Bid created successfully!!");
        }
    }

    public void updateBid(String userId, String auctionId, int amount){
        createBid(userId, auctionId, amount);
    }

    public void closeAuction(String auctionId){
        Auction auction = auctions.get(auctionId);
        Map<String, Bid> bids = auction.getBids();
        Map<Integer, Integer> frequency = new TreeMap<>();
        for (Map.Entry<String, Bid> entry : bids.entrySet()){
            Integer amount = entry.getValue().getAmount();
            Integer val = frequency.getOrDefault(entry.getValue().getAmount(), null);
            if(val == null){
                frequency.put(amount, 1);
            }
            else {
                frequency.put(amount, val + 1);
            }
        }

        Integer highestUniqueBid  = null;

        for(Map.Entry<Integer, Integer> entry : frequency.entrySet()){
            if(entry.getValue() == 1){
                highestUniqueBid = entry.getKey();
            }
        }

        String winner = null;

        for (Map.Entry<String, Bid> entry : bids.entrySet()){
            if(entry.getValue().getAmount() == highestUniqueBid){
                winner = entry.getKey();
            }
        }
        auctions.remove(auctionId);
        if(winner!=null){
            System.out.println("Winner id :" + winner);
        }else{
            System.out.println("Winner not found!!");
        }

    }

    public Auction getAuction(String auctionId){
        if(!auctions.containsKey(auctionId)){
            System.out.println("Auction does exist!!");
            return null;
        }
        return auctions.get(auctionId);
    }

    public void withdrawBid(String buyerId, String auctionId){
        Auction auction = auctions.get(auctionId);
        auction.withdrawBid(buyerId);
    }
}
