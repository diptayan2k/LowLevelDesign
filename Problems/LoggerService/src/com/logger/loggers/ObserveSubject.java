package com.logger.loggers;

import com.logger.observers.Observer;

import java.util.List;

public interface ObserveSubject {

    void setObservers(List<Observer> observers);
}
