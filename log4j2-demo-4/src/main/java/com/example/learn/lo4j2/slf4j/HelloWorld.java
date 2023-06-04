package com.example.learn.lo4j2.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Date;

public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        Date now = Calendar.getInstance().getTime();
        logger.info("the time of now is {}", now);
    }
}
