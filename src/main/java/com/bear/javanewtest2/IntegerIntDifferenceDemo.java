package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/10 下午3:08
 * Description: int 与 Integer 的区别
 */

public class IntegerIntDifferenceDemo {

    private static Integer age;
    private static int size;

    public static void main(String[] args) {

        System.out.println(age);
        System.out.println(size);

        age = 100;
        size = 100;

        System.out.println(age);
        System.out.println(size);

    }
}
