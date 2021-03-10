package com.bear.javanewtest2; /**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/3/10 3:07 下午
 * @Description: apache log4j
 */


import org.apache.log4j.Logger;

public class Log4jDemo {

    private static final Logger logger = Logger.getLogger(Log4jDemo.class);

    public static void main(String[] args) {
        logger.info("this is a apache log4j log");
        System.out.println("xxx");
    }
}
