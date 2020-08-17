package com.bear.javanewtest2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/18 上午12:27
 * Description: 响应Map
 */

public class ResponseMapDemo {
    public static void main(String[] args) {
        //ResponseMap responseMap = new ResponseMap();
        System.out.println(ResponseMap.map);
    }
}


class ResponseMap {

//    public final static Map<Integer, String> map = new HashMap<Integer, String>(){
//        {
//            map.put(200, "获取成功");
//            map.put(201, "操作成功");
//        }
//    };

    public final static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(200, "获取成功");
        map.put(201, "操作成功");
    }

}
