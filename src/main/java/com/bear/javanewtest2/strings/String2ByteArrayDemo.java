package com.bear.javanewtest2.strings;

import lombok.SneakyThrows;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/19 下午2:08
 * Description: 字符串转字节数组
 */
public class String2ByteArrayDemo {

    public static void main(String[] args) {
        String name = "I love bear";

        byte[] nameArray = name.getBytes();

        String[] strings = {};

        System.out.println(Arrays.toString(nameArray));
        //System.out.p


    }
}
