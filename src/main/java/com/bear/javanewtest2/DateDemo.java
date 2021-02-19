package com.bear.javanewtest2;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/3 下午3:41
 * Description: Date 用法
 */

public class DateDemo {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString()); //Thu Dec 03 16:05:24 CST 2020
        System.out.println(date.getTime()); //获取时间戳
        System.out.println(System.currentTimeMillis());
    }
}
