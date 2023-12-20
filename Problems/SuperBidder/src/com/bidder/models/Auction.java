package com.bidder.models;

import java.util.HashMap;
import java.util.Map;

public class Auction {

    private String id;
    private String userId;
    private int lowerlim;
    private int higherLim;

    private Map<String, Bid> bids;

    public Auction(String id, int lowerlim, int higherLim, String userId) {
        this.id = id;
        this.userId = userId;
        this.lowerlim = lowerlim;
        this.higherLim = higherLim;
        this.bids = new HashMap<>();
    }

    public void addBid(Bid bid){
        bids.put(bid.getBuyerId(), bid);
    }

    public void updateBid(Bid bid){
        addBid(bid);
    }

    public void withdrawBid(String userId){
        bids.remove(userId);
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public int getLowerlim() {
        return lowerlim;
    }

    public int getHigherLim() {
        return higherLim;
    }

    public Map<String, Bid> getBids() {
        return bids;
    }
}
