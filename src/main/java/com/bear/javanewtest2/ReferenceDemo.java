package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/11 下午10:15
 * Description: Java对象作为形参数 默认引用传值
 */

public class ReferenceDemo {

    public static void main(String[] args) {

        Person person = new Person();
        objectFunc(person);

        System.out.println(person.toString());

        Integer age = 18;
        System.out.println(age);


    }

    public static void objectFunc(Person person) {
        person.setName("bear");
    }

    public static void IntegerFunc(Integer age) {
        age = 28;
    }
}
