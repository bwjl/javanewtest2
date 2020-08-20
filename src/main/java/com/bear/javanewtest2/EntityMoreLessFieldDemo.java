package com.bear.javanewtest2;

import com.alibaba.fastjson.JSON;
import com.bear.javanewtest2.entity.User;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/20 下午10:09
 * Description: 实体类多一个或少一个字段
 */

public class EntityMoreLessFieldDemo {

    public static void main(String[] args) {

        //多字段
        String moreFieldString = "{\"age\":18,\"height\":1.8,\"name\":\"bear\",\"sex\":\"man\"}";

        //少字段
        String lessFieldString = "{\"age\":18,\"height\":1.8}";


        User moreFieldUser = JSON.parseObject(moreFieldString, User.class);
        User lessFieldUser = JSON.parseObject(lessFieldString, User.class);

        System.out.println(moreFieldUser); //{"age":18,"height": 1.8 ,"name":bear}
        System.out.println(lessFieldUser); //{"age":18,"height": 1.8 ,"name":null}

    }
}
