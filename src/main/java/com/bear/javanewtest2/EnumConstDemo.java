package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/20 下午3:12
 * Description: enum 定义常量
 */

public class EnumConstDemo {

    public static void main(String[] args) {
        System.out.println(Size.SMALL); //SMALL
        System.out.println(Size.MIDDLE); //MIDDLE
        System.out.println(Size.BIG); //BIG

    }
}

enum Size {
    SMALL, MIDDLE, BIG
}
