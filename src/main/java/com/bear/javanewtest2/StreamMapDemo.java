package com.bear.javanewtest2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/19 下午5:02
 * Description: Collection stream 用法
 */

public class StreamMapDemo {

    public static void main(String[] args) {
        //List<UserChain> list =
        List<Integer> ints = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> ints2 = ints.stream().map(num -> num * 2).collect(Collectors.toList());

        System.out.println(ints2.toString());
    }

}
