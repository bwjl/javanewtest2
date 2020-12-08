package com.bear.javanewtest2;

import com.bear.javanewtest2.interfaces.Worker;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/8 上午9:33
 * Description: interface 字段必须初始化
 */

public class InterfaceFieldMustInitDemo {

    private static String name;

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(Worker.name);
    }
}
