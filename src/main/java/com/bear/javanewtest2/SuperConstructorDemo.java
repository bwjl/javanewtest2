package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/4 上午12:00
 * Description: super 调用与子类相同构造方法的父类的构造方法
 */

public class SuperConstructorDemo {

    public static void main(String[] args) {
        Son2 son1 = new Son2("bear");
        Son2 son2 = new Son2();
        Son2 son3 = new Son2("bear", 19);
        //System.out.println(son1.getFatherName());
    }

}

class Father2 {

    Father2(String name, int age) {
        System.out.println("I am father constructor1");
    }

    Father2(String name) {
        System.out.println("I am father constructor3");
    }

//    Father2() {
//        System.out.println("I am father constructor2");
//    }


}

class Son2 extends Father2 {

//    Son2(String name, int age) {
//        super(name, age); //调用父类构造函数
//    }

    Son2() {
        super("hello");
        System.out.println("I am Son constructor1");
    }

    Son2(String name) {
        super("hello");
        System.out.println("I am Son constructor2");
    }

    Son2(String name, int age) {
        super("hello");
        System.out.println("I am Son constructor3");
    }
}