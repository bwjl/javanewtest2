package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/10/12 上午10:47
 * Description: String 为字符串常量
 * Description: Java中对String对象进行的操作实际上是一个不断创建新的对象并且将旧的对象回收的一个过程，所以执行速度很慢
 */

public class StringConstDemo {

    public static void main(String[] args) {

        String str1 = "bear1";
        System.out.println(str1);
        System.out.println(str1.hashCode());

        str1 += "love";
        System.out.println(str1);
        System.out.println(str1.hashCode());


    }
}
