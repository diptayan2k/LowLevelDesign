package com.logger;

import com.logger.observers.Consolle;
import com.logger.observers.File;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        File file = new File();
        Consolle consolle = new Consolle();

        logger.addObserver(1, file);
        logger.addObserver(1, consolle);
        logger.addObserver(2, file);

        logger.info("this is info");
        logger.error("this is error");
        logger.debug("this is debug");
    }
}