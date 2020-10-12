package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/10/12 上午10:58
 * Description: StringBuilder 创建字符串变量 非线程安全
 */

public class StringBuilderDemo1 {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("efg");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.hashCode());

        stringBuilder.append("hi");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.hashCode());
    }

}
