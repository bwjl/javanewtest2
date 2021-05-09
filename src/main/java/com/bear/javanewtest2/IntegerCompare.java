package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/19 上午9:39
 * Description:  Integer age1 = 18 java 自动转为new Integer(18)
 * Integer 不使用new 常量池一个字节大小 范围-127～128
 */

public class IntegerCompare {

    public static void main(String[] args) {
        Integer age1 = 18;
        Integer age2 = new Integer(18);

        System.out.println(age1 == age2); //false
        System.out.println(age1.equals(age2)); //true

        Integer num1 = 16;
        Integer num2 = 16;

        Integer num3 = 128;
        Integer num4 = 128;

        Integer num5 = 127;
        Integer num6 = 127;

        System.out.println(num1 == num2); //true;
        System.out.println(num3 == num4); //false
        System.out.println(num5 == num6); //true
    }
}
