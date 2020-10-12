package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/10/12 上午10:55
 * Description: StringBuffer 字符串变量 更改后内存地址是不变的
 */

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("abc");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.hashCode());

        stringBuffer.append("de");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.hashCode());


    }
}
