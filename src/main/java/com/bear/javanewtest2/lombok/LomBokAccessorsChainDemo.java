package com.bear.javanewtest2.lombok;

import com.bear.javanewtest2.entity.UserChain;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/2/5 下午2:03
 * Description:
 */

public class LomBokAccessorsChainDemo {

    public static void main(String[] args) {

        UserChain user = new UserChain().setAge(18).setSex(1).setName("bear");

        System.out.println(user);

    }

}
