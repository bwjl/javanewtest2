package com.bear.javanewtest2.strings;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/22 上午9:52
 * Description: StringBuilder 用法
 */

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "bear";
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("bear:" + stringBuilder.append("age18"));
        System.out.println(stringBuilder.append("man"));
    }
}
