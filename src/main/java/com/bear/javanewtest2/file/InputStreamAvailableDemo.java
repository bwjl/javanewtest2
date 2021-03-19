package com.bear.javanewtest2.file;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/3/19 3:16 下午
 * @Description: 通过InputStream.available 获取文件大小
 */

public class InputStreamAvailableDemo {

    private static final String fileName = "/Users/bear/Desktop/3.png";

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(new File(fileName));
        System.out.println(inputStream.available());
    }
}
