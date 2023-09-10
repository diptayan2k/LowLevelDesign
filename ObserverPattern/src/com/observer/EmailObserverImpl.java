package com.observer;

import com.observable.IphoneObservable;
import com.observable.Observable;

public class EmailObserverImpl implements Observer{

    String emailId;

    public EmailObserverImpl(String email){
        this.emailId = email;
    }

    @Override
    public void notifyUser(Observable observable) {
        if(observable instanceof IphoneObservable)
            sendEmail("Item " + observable.getProductName() + " in stock, hurry up!!");
    }

    public void sendEmail(String message){
        System.out.println("Email Sent to: " + this.emailId + ", message: " + message);
    }
}
