package com.bear.javanewtest2;

import org.apache.commons.lang.RandomStringUtils;

import java.util.Arrays;
import java.util.Random;

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
//        System.out.println(salt1);
//        System.out.println(salt2);
//        System.out.println(salt3);

        System.out.println(randomAlphaNumber(6));
    }

    /**
     * 随机生成数字字母
     */
    public static String randomAlphaNumber(int count) {
        String str = "ABCDEFGHIJKMNPQRSTUVWXYZabcdefghijkmnpqrstuvwxyz23456789";
        String[] strArray = str.split("");

        //System.out.println(Arrays.toString(strArray));
        //System.out.println(strArray);

        Random random = new Random();

        String randomStr = "";
        for (int i = 0; i < count; i++) {
            randomStr += strArray[random.nextInt(strArray.length)];
        }

        return randomStr;

    }
}
