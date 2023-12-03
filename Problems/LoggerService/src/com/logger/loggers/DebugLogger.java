package com.logger.loggers;

public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        super(level);
    }

    @Override
    public void display(String message) {
        observers.forEach((observer)-> observer.display("DEBUG: " + message));
    }
}
