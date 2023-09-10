package com.observer;

import com.observable.IphoneObservable;
import com.observable.Observable;

public class MessageObserverImpl implements  Observer{
    String phone;

    public MessageObserverImpl(String phone){
        this.phone = phone;
    }

    @Override
    public void notifyUser(Observable observable) {
        if(observable instanceof IphoneObservable)
            sendMessage("Item " + observable.getProductName() + "in stock, hurry up!!");
    }

    public void sendMessage(String message){
        System.out.println("Message Sent to: " + this.phone + ", message: " + message);
    }
}
