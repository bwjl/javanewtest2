package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/4 上午12:00
 * Description: super 调用与子类相同属性的父类的属性
 */

public class SuperFieldDemo {

    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getName());
    }

}


class Father {
    public String name = "father";
}

class Son extends Father {
    public String name = "son";

    public String getName() {
        return super.name;
    }
}