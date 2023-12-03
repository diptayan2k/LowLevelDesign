package com.logger;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    public void display(String message) {
        observers.forEach((observer)-> observer.display("ERROR: " + message));
    }
}
