package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/15 上午11:44
 * Description: 在当前类main方法中调用内部非静态内部类
 */

public class InnerClassInvokeInMainDemo {

    private static String name = "bear";

    public static void main(String[] args) {

        InnerClass innerClass = (new InnerClassInvokeInMainDemo()).new InnerClass();

        innerClass.doSomething(name);
    }

    public class InnerClass {
        public void doSomething(String name) {
            System.out.println(name);
        }

    }


}
