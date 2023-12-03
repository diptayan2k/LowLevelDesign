package com.logger;

import com.logger.observers.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Logger {

    public static volatile Logger logger;
    private static Map<Integer, AbstractLogger> levelMap;
    public AbstractLogger abstractLogger;

    private Logger(AbstractLogger abstractLogger){
        this.abstractLogger = abstractLogger;
        levelMap = new HashMap<>();
    }

    public static Logger getInstance(){
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null){
                    InfoLogger infoLogger = new InfoLogger(1);
                    ErrorLogger errorLogger = new ErrorLogger(2);
                    DebugLogger debugLogger = new DebugLogger(3);

                    infoLogger.setNextLogger(errorLogger);
                    errorLogger.setNextLogger(debugLogger);
                    logger = new Logger(infoLogger);

                    levelMap.put(1, infoLogger);
                    levelMap.put(2, errorLogger);
                    levelMap.put(3, debugLogger);
                }
            }
        }

        return logger;
    }

    public void addObserver(Integer level, Observer observer){
        AbstractLogger abstractLogger = levelMap.get(level);
        List<Observer> observerList = abstractLogger.getObservers();
        observerList.add(observer);
    }

    public  void info(String message){
        abstractLogger.log(1, message);
    }

    public void error(String message){
        abstractLogger.log(2, message);
    }

    public void debug(String message){
        abstractLogger.log(3, message);
    }

}
