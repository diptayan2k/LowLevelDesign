package com.bookMyShow.models;

import java.util.List;

public class Booking {

    private String id;
    private Show show;
    private User user;
    private List<Seat> seats;
    private int price;


    public Booking(String id, Show show, User user, List<Seat> seats, int price) {
        this.id = id;
        this.show = show;
        this.user = user;
        this.seats = seats;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
