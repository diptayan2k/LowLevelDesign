package com.logger;

import com.logger.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractLogger {

    private int level;
    private AbstractLogger nextAbstractLogger;
    protected List<Observer> observers;

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public AbstractLogger(int level) {
        this.level = level;
        observers = new ArrayList<>();
    }

    public void setNextLogger(AbstractLogger nextAbstractLogger) {
        this.nextAbstractLogger = nextAbstractLogger;
    }

    abstract public void display(String message);

    public void log(int level, String message){
        if(level == this.level) {
            display(message);
        }
        if (nextAbstractLogger != null)
            nextAbstractLogger.log(level, message);
    }

}
