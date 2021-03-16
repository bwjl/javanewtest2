package com.bear.javanewtest2.lombok;

import com.bear.javanewtest2.entity.UserBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/19 下午5:35
 * Description: lombok builder 用法
 */

public class LomBokBuilderDemo {

    public static void main(String[] args) {
        UserBuilder userBuilder = UserBuilder.builder()
                .age(18)
                .name("bear")
                .height(180.00)
                .size(15)
                .build();

        System.out.println(userBuilder);

    }

}
