package com.bear.javanewtest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/8 下午2:07
 * Description: List 方法 isEmpty() 判断为空
 */

public class ListIsEmptyDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList());

        System.out.println(list.isEmpty());
    }
}
