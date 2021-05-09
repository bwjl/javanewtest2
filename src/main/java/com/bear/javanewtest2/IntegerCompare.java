package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/19 上午9:39
 * Description:  Integer age1 = 18 java 自动转为new Integer(18)
 * Integer 不使用new 常量池
 */

public class IntegerCompare {

    public static void main(String[] args) {
        Integer age1 = 18;
        Integer age2 = new Integer(18);

        System.out.println(age1 == age2); //false
        System.out.println(age1.equals(age2)); //true

        Integer num1 = 16;
        Integer num2 = 16;

        System.out.println(num1 == num2); //true;
    }
}
