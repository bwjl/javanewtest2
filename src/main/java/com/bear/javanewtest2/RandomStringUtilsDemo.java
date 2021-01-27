package com.bear.javanewtest2;

import org.apache.commons.lang.RandomStringUtils;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/27 下午5:40
 * Description: apache RandomStringUtils 随机字符串
 */

public class RandomStringUtilsDemo {

    public static void main(String[] args) {
        String salt1 = RandomStringUtils.random(4);
        //字母、数字
        String salt2 = RandomStringUtils.randomAlphanumeric(4);
        String salt3 = RandomStringUtils.randomNumeric(4);
        System.out.println(salt1);
        System.out.println(salt2);
        System.out.println(salt3);
    }
}
