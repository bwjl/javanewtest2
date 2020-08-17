package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/17 下午3:53
 * Description: static代码块优先于construct执行
 */

public class StaticConstructOrderDemo {

    public static void main(String[] args) {
        //System.out.println(age);
        new User();
    }
}

class User {

    static Integer age = 18;

    public User() {
        System.out.println("Construct code");
    }

    static {
        System.out.println("Static block code");
    }
}
