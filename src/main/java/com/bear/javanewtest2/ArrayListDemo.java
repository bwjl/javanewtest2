package com.bear.javanewtest2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/13 下午10:49
 * Description:
 */

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("bear");
        list.add("cat");
        list.add("dog");
        list.add("123");
        list.add("456");
        list.add("aaa");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
