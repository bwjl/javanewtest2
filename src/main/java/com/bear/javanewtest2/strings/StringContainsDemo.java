package com.bear.javanewtest2.strings;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/3/19 4:33 下午
 * @Description: string.contains 包含某段字符串判断
 */

public class StringContainsDemo {


    public static void main(String[] args) {
        String contentType = "multipart/form-data; boundary=--------------------------907201013825265333914340";

        System.out.println(contentType.contains("multipart"));
        System.out.println(contentType.contains("x-www-form-urlencoded"));
    }

}
