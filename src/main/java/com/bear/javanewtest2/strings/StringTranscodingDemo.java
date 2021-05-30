package com.bear.javanewtest2.strings;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/5/29 11:23 下午
 * @Description: 字符串转码
 */

public class StringTranscodingDemo {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String hobby = "我爱写代码";
        System.out.println(new String(hobby.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
        System.out.println(new String(hobby.getBytes("GB2312"), "GB2312"));
        //GB2312转UTF8乱码
        System.out.println("GB2312转UTF8：" + new String(hobby.getBytes("GB2312"), StandardCharsets.UTF_8));
        //UTF-8转IOS-8859-1乱码
        System.out.println(new String(hobby.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1));
        System.out.println(hobby.length());
        //UTF-8
        System.out.println(System.getProperty("file.encoding"));
    }
}
