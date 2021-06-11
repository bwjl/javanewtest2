package com.bear.javanewtest2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/6/11 5:13 下午
 * @Description:
 */

public class Slf4jDemo {

    private static final Logger log = LoggerFactory.getLogger(com.bear.javanewtest2.Slf4jDemo.class);

    public static void main(String[] args) {
        String name = "bear";
        log.debug("slf4j");
        log.debug("我的名字：{}", name);
        log.info("我的名字：{}", name);
        log.info("{}：我的名字", "笑嘻嘻");
    }
}
