package com.logger.observers;

public class Consolle implements Observer {
    @Override
    public void display(String message) {
        System.out.println("Console message: " + message);
    }
}
