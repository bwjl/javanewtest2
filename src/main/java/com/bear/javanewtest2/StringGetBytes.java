package com.bear.javanewtest2;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/21 下午1:49
 * Description: 字符串转byte[]
 */

public class StringGetBytes {

    public static void main(String[] args) {

        String tips = "hello world";
        System.out.println(Arrays.toString(tips.getBytes()));

    }
}
