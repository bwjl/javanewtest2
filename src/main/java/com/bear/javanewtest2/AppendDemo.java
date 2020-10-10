package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/10/10 上午11:58
 * Description: 字符串StringBuffer append用法
 */

public class AppendDemo {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("bear");

        str.append(" love linyu");

        String a = "aname";
        //String b =  "bname";

        String b = "";

        b += a;

        System.out.println(b);

        System.out.println(str);
    }
}
