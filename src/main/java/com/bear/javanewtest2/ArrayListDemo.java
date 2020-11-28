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

        System.out.println("-----------for-----------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-----------forEach-----------");
        list.forEach(item -> {
            System.out.println(item);
        });

        //list.forEach();

        for (String item : list) {
            System.out.println("foreach:" + item);
        }

//        List<?> list1 = new ArrayList<>();
//        list1.add(18);
//        list1.add("bear"); //list的元素必须同一个类型

//        List<?> list2 = new ArrayList<>(); //必须声明List<?>类型
//        list2.add(1);
//        list2.add(2);

    }

}
