package com.bear.javanewtest2;

import com.bear.javanewtest2.interfaces.PersonDefault;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/18 上午10:57
 * Description: Java8以后 interface default 方法
 */

public class InterfaceDefaultDemo {

    public static void main(String[] args) {
        Person person = new Person();
        person.play();
        person.eat();
    }

    /**
     * 需要static类
     */
    static class Person implements PersonDefault {

        @Override
        public void play() {
            System.out.println("play");
        }
    }
}
