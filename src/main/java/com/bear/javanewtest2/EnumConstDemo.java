package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/20 下午3:12
 * Description: enum 定义常量
 */

public class EnumConstDemo {

    public static void main(String[] args) {
        System.out.println(Size.SMALL); //SMALL ordinal 0
        System.out.println(Size.MIDDLE); //MIDDLE ordinal 1
        System.out.println(Size.BIG); //BIG ordinal 2
        System.out.println("hello"); //BIG

    }
}

enum Size {
    SMALL, MIDDLE, BIG
}
