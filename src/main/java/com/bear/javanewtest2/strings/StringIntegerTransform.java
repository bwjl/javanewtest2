package com.bear.javanewtest2.strings;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/9 下午3:21
 * Description: String 与 Integer 相互转换
 */

public class StringIntegerTransform {

    public static void main(String[] args) {

        Integer b = 10;
        System.out.println(String.valueOf(b));
        System.out.println(b.toString());
        System.out.println(Integer.toString(b));

        String a = "1";
        System.out.println(Integer.valueOf(a));

    }

}
