package com.logger;

public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        super(level);
    }

    @Override
    public void display(String message) {
        observers.forEach((observer)-> observer.display("INFO: " + message));
    }
}
