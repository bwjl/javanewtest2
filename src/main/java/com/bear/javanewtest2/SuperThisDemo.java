package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/17 上午9:15
 * Description: super 调用父类方法
 */

public class SuperThisDemo {

    public static void main(String[] args) {

        new son().doSomething();
        new son().doParentSomeThing();

    }

    static class son extends parent {

        @Override
        public void doSomething() {
            System.out.println("I am son");
        }

        public void doParentSomeThing() {
            super.doSomething();
        }

    }

    static class parent {
        public void doSomething() {
            System.out.println("I am parent");
        }

    }

}
