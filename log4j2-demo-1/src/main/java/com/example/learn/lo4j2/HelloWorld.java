package com.example.learn.lo4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * log4j2.xml中Configuration.status用来控制log4j内部实现的日志级别,有别于应用的日志级别
 */
public class HelloWorld {
    private static final Logger logger = LogManager.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        logger.debug("Hello from Log4j 2");

        // in old days, we need to check the log level to increase performance
        /*if (logger.isDebugEnabled()) {
            logger.debug("{}", getNumber());
        }*/

        // with Java 8, we can do this, no need to check the log level
        logger.debug("{}", HelloWorld::getNumber);

    }

    static int getNumber() {
        return 5;
    }
}
