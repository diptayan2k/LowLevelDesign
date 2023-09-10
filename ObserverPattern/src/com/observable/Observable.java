package com.observable;

import com.observer.Observer;

public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void updateCount(int count);

    void notifyUsers();

    String getProductName();
}
