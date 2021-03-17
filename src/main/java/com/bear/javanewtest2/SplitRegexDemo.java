package com.bear.javanewtest2;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/3/17 4:23 下午
 * @Description: split 正则点 点为正则关键字
 */

public class SplitRegexDemo {

    private static final String SRC_IMAGE = "/Users/bear/Desktop/wxcs1.jpg";

    public static void main(String[] args) {
        String[] ret = SRC_IMAGE.split("\\.");
        String[] ret1 = SRC_IMAGE.split(".");
        String suffix = ret[ret.length - 1];
        System.out.println(suffix);
        System.out.println(Arrays.toString(ret));
        System.out.println(Arrays.toString(ret1));
    }
}
