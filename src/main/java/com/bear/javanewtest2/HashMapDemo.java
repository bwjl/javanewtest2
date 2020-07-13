package com.bear.javanewtest2;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/13 下午5:15
 * Description: 遍历HashMap
 */

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        Map<String, String> map1 = new LinkedHashMap<String, String>();
        map.put("name", "bear");
        map.put("name1", "bear1");
        map.put("name2", "bear2");
        map.put("name3", "bear3");

        map1.put("name", "bear");
        map1.put("name1", "bear1");
        map1.put("name2", "bear2");
        map1.put("name3", "bear3");

        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(value);
        }

        System.out.println("--------HashMap---------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + ";value:" + value);
        }

        System.out.println("--------LinkedHashMap---------");
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println("key:" + entry.getKey() + ";value:" + entry.getValue());
        }

    }
}
