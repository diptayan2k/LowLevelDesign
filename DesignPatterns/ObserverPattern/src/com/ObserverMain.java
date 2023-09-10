package com;

import com.observable.IphoneObservable;
import com.observer.EmailObserverImpl;
import com.observer.MessageObserverImpl;

public class ObserverMain {

    public static void main(String[] args) {

        EmailObserverImpl emailObserver = new EmailObserverImpl("abc@gmaiil.com");
        MessageObserverImpl messageObserver = new MessageObserverImpl("7044321498");

        IphoneObservable iphoneObservable = new IphoneObservable(10);
        iphoneObservable.addObserver(emailObserver);
        iphoneObservable.addObserver(messageObserver);

        iphoneObservable.updateCount(0);
        iphoneObservable.updateCount(10);
        iphoneObservable.updateCount(0);
        iphoneObservable.updateCount(5);
    }
}
