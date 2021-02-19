package com.bear.javanewtest2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: bear
 * @Date: 2021/2/19 4:41 下午
 * @Description: Collection stream filter、skip、limit用法
 */

public class StreamFilterDistinctSkipLimitDemo {

    public static void main(String[] args) {
        List<Integer> ints1 = Arrays.asList(1, 2, 2, 3, 4, 5, 6);
        List<Integer> ints2 = ints1.stream().filter(num -> num > 2).collect(Collectors.toList());
        List<Integer> ints3 = ints1.stream().skip(3).collect(Collectors.toList());
        List<Integer> ints4 = ints1.stream().limit(2).collect(Collectors.toList());
        List<Integer> ints5 = ints1.stream().distinct().collect(Collectors.toList());

        System.out.println(ints1);
        System.out.println(ints2);
        System.out.println(ints3);
        System.out.println(ints4);
        System.out.println(ints5);

    }
}
