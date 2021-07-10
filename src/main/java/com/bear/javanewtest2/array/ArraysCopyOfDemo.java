package com.bear.javanewtest2.array;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/7/10 3:55 下午
 * @Description: Arrays.copyOf 数组扩容
 */

public class ArraysCopyOfDemo {

    public static void main(String[] args) {
        String[] hobby = {"eat", "sleep", "game"};
        String[] newHobby = Arrays.copyOf(hobby, 5);
        //[eat, sleep, game, null, null]
        System.out.println(Arrays.toString(newHobby));
    }
}
