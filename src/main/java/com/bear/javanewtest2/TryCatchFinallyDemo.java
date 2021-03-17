package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/3/17 11:42 下午
 * @Description: Java try catch finally 执行顺序
 */

public class TryCatchFinallyDemo {

    public static void main(String[] args) {

        //有异常
        try {
            isRuntimeException(true);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("有异常finally");
        }

        //无异常
        try {
            isRuntimeException(false);
        } catch (RuntimeException e) {

        } finally {
            System.out.println("无异常finally");
        }

    }

    /**
     * 是否有运行时异常抛出
     */
    public static void isRuntimeException(boolean bool) {
        if (bool) {
            throw new RuntimeException("RuntimeException");
        }
    }
}
