package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/3/15 10:29 下午
 * @Description: Java大括号作用域私有
 */

public class BracesVarScopeDemo {

    public static void main(String[] args) {

        System.out.println(getName());

    }

    public static String getName() {
        if (true) {
            String name = "bear";
            return name;
        }

        //return name;

        return "";
    }
}
