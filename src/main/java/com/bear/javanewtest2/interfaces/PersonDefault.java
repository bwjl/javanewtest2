package com.bear.javanewtest2.interfaces;

/**
 * @Author: bear
 * @Date: 2021/2/20 9:38 上午
 * @Description:
 */

public interface PersonDefault {

    /**
     * 吃饭
     */
    default void eat() {
        System.out.println("eat");
    }

    /**
     * 玩耍
     */
    void play();
}
