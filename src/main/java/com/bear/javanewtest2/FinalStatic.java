package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/19 上午11:54
 * Description: final修饰的属性表明是一个常数（创建后不能被修改）
 */

public class FinalStatic {

    private final static Integer age1 = 18;
    private static Integer age2 = 30;

    public static void main(String[] args) {
        //age1 = 19; //Cannot assign a value to final variable 'age1'
        age2 = 31;

        System.out.println(age2);
    }
}
