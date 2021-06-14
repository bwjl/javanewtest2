package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/6/14 4:21 下午
 * @Description: 实参只能作为形参的子类
 */

public class ParamAsFatherOrSonDemo {

    public static void main(String[] args) {


    }

    public static void doSomething(Object obj) {
        System.out.println("doSomething");
    }

    public static void doOtherThing(Integer num) {
        doSomething(num);
    }

    /**
     * 实参只能作为形参的子类
     *
     * @param obj
     */
    public static void doAnotherThing(Object obj) {
        //doOtherThing(obj); //error
    }

}
