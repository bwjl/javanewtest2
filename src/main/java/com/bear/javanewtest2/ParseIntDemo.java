package com.bear.javanewtest2;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/5 下午12:22
 * Description: Integer.parseInt(String) 字符串转Integer
 */

public class ParseIntDemo {

    public static void main(String[] args) {

        String classroom = "001";
        System.out.println(Integer.parseInt(classroom));
        System.out.println(Integer.valueOf(classroom));

        int[] array = null;
        System.out.println(Arrays.toString(array));


    }
}
