package com.bear.javanewtest2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/8 下午6:28
 * Description: Map.Entry的用法
 */

public class EntryDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "bear");
        map.put("hobby", "eat");

        Set<Map.Entry<String, String>> set = map.entrySet();

        Iterator<Map.Entry<String, String>> iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //System.out.println();

    }
}
