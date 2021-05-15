package com.bear.javanewtest2;

import com.bear.javanewtest2.entity.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/5/15 8:42 下午
 * @Description: getClass 获取class对象
 */

public class GetClassDemo {

    public static void main(String[] args) {
        User user = new User();
        Class class1 = user.getClass();

        System.out.println(user);
        System.out.println(class1);
    }
}
