package com.bear.javanewtest2;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/28 下午7:22
 * Description: Random类
 */

public class RandomDemo {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println(random.nextInt());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        //System.out.println(random.nextBytes());

    }
}
