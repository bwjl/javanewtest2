package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/3 下午5:42
 * Description:
 */

public class ObjectTypeDemo {

    public static void main(String[] args) {
        Person person = new Person();
        test(person);
    }

    public static void test(Object object) {
        System.out.println(object); //Person{name='null', age=null}
    }
}
