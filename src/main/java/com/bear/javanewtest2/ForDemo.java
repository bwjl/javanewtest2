package com.bear.javanewtest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/8 上午11:01
 * Description: forEach 循环修改item 不能修改原对象
 */

public class ForDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("bear", "dog"));
        System.out.println(list);
        for (String item : list) {
            if (item == "bear") {
                item = "newBear";
            }
        }
        System.out.println(list);


    }
}
