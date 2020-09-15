package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/15 上午11:44
 * Description: 内部类调用内部字段
 */

public class InnerClassInvokeFieldDemo {

    private static String name = "bear";

    public static void main(String[] args) {

        InnerClass innerClass = (new InnerClassInvokeFieldDemo()).new InnerClass();

        innerClass.doSomething();
    }

    public class InnerClass {
        public void doSomething() {
            name = "dog";
            System.out.println(name);
        }

    }


}
