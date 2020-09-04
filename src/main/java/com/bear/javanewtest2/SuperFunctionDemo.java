package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/4 上午12:00
 * Description: super 调用与子类相同方法的父类的方法
 */

public class SuperFunctionDemo {

    public static void main(String[] args) {
        Son1 son1 = new Son1();
        System.out.println(son1.getFatherName());
    }

}

class Father1 {
    public String name = "father";

    public String getName() {
        return name;
    }
}

class Son1 extends Father1 {
    public String name = "son";

    public String getName() {
        return super.name;
    }

    public String getFatherName() {
        return super.getName();
    }
}