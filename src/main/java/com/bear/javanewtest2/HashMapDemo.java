package com.bear.javanewtest2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/13 下午5:15
 * Description: 遍历HashMap
 */

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "bear");
        map.put("name1", "bear1");
        map.put("name2", "bear2");
        map.put("name3", "bear3");

        Set<String> set = map.keySet();

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(value);
        }

    }
}
