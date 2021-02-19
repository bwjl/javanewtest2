package com.bear.javanewtest2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: bear
 * @Date: 2021/2/19 4:41 下午
 * @Description: Collection stream filter用法
 */

public class StreamFilterDemo {

    public static void main(String[] args) {
        List<Integer> ints1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> ints2 = ints1.stream().filter(num -> num > 2).collect(Collectors.toList());

        System.out.println(ints2);

    }
}
