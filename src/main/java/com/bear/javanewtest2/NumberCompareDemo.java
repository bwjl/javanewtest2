package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/10 下午3:13
 * Description:
 */

public class NumberCompareDemo {

    public static void main(String[] args) {
        System.out.println(100 == 100);
        System.out.println(1000 == 1000);

        int a = 100;
        int b = 100;

        System.out.println(a == b);

        Integer c = 1000;
        Integer d = 1000;

        System.out.println(c == d);
        System.out.println(c.equals(d));


    }
}
