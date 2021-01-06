package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/17 下午1:54
 * Description:
 */

public class SecondsUnixTimeDemo {

    public static void main(String[] args) {

        long seconds1 = System.currentTimeMillis() / 1000L;

        System.out.println(seconds1);

        Integer seconds = Integer.valueOf((int) (seconds1));

        System.out.println(seconds);
    }
}
