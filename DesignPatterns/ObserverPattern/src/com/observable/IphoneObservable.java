package com.observable;

import com.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable{

    private List<Observer> observers;
    private int count;
    private String name;

    public IphoneObservable(int count){
        this.count = count;
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void updateCount(int count) {
        if(this.count == 0 && count > 0){
            notifyUsers();
        }
        this.count = count;
    }

    @Override
    public void notifyUsers() {
        for(Observer observer: observers){
            observer.notifyUser(this);
        }

    }

    @Override
    public String getProductName() {
        return "Iphone";
    }
}
