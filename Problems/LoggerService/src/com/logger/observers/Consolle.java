package com.logger.observers;

public class Consolle extends Observer {
    @Override
    public void display(String message) {
        System.out.println("Console message: " + message);
    }
}
