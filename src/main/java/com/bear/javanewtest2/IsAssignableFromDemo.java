package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/6 上午1:18
 * Description: a类为b类的父类和父接口
 */

public class IsAssignableFromDemo {

    public static void main(String[] args) {

        System.out.println(Father.class.isAssignableFrom(Son.class));

    }

    class Father {

    }

    class Son extends Father {

    }
}
