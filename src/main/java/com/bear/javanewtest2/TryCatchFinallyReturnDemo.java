package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/3/18 9:45 上午
 * @Description: finally为最终返回值
 */

public class TryCatchFinallyReturnDemo {

    public static void main(String[] args) {
        System.out.println(returnTest());
    }

    public static int returnTest() {
        try {
            return 123;
        } catch (Exception e) {
            return 456;
        } finally {
            return 789;
        }
    }
}


