package com.bear.javanewtest2;

import com.bear.javanewtest2.entity.User;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/2 上午10:08
 * Description:
 */

public class ObjectInitNullPointerExceptionDemo {

    public static void main(String[] args) {
        //User user = null;

        //User user = null

        User user = null;

        user.setName("bear");

        System.out.println(user.getName());

    }
}
