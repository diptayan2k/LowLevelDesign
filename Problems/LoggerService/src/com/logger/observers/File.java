package com.logger.observers;

public class File implements Observer {
    @Override
    public void display(String message) {
        System.out.println("File message : " + message);
    }
}
