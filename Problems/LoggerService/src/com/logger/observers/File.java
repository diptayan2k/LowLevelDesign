package com.logger.observers;

public class File extends Observer {
    @Override
    public void display(String message) {
        System.out.println("File message : " + message);
    }
}
