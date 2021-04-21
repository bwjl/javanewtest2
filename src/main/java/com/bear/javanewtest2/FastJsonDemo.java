package com.bear.javanewtest2;

import com.alibaba.fastjson.JSON;
import com.bear.javanewtest2.entity.User;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/22 下午10:28
 * Description: alibaba FastJson
 */

public class FastJsonDemo {

    public static void main(String[] args) {
        obj2Json();
        json2Obj();
    }

    /**
     * 对象转json字符串
     */
    private static void obj2Json() {
        User user = new User();
        user.setAge(18);
        user.setHeight(1.80);
        //user.setName("bear");

        System.out.println(JSON.toJSONString(user));
    }

    /**
     * json字符串转对象
     */
    private static void json2Obj() {
        String string = "{\"age\":18,\"height\":1.8,\"name\":\"bear\"}";

        System.out.println(JSON.parseObject(string, User.class));
    }
}
