package com.bear.javanewtest2.strings;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/6/25 下午9:10
 * Description: (String).substring 截取字符串 获取文件后缀
 */

public class SubstringDemo {
    public static void main(String[] args) {
        String fileName = "195454u6us36fab63s131f.jpeg";
        System.out.println(fileName.substring(fileName.lastIndexOf(".") + 1));
        System.out.println(fileName.charAt(0));
        System.out.println(fileName.substring(0, 2));
    }
}
