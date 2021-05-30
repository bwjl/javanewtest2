package com.bear.javanewtest2.strings;

import lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/5/30 12:04 下午
 * @Description: 验证GBK、GB2312两个字节，UTF-8一个字节，unicode 4个字节
 */


public class StringGetBytesDemo {

    @SneakyThrows
    public static void main(String[] args) {
        String name = "熊";
        System.out.println(Arrays.toString(name.getBytes(StandardCharsets.UTF_8)));
        //GBK 简体中文、繁体中文
        System.out.println(Arrays.toString(name.getBytes("GBK")));
        //GB2312 仅简体中文
        System.out.println(Arrays.toString(name.getBytes("GB2312")));
        //unicode 4个字节
        System.out.println(Arrays.toString(name.getBytes("unicode")));
    }
}
