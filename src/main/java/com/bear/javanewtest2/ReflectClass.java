package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/2 上午11:26
 * Description: Class 对象
 */

public class ReflectClass {

    public static void main(String[] args) throws ClassNotFoundException {
        Class class1 = UserManagerImpl.class;
        Class class2 = Class.forName("com.bear.javanewtest2.UserManagerImpl");
        UserManager userManager = new UserManagerImpl();
        UserManager userManager1 = new UserManagerImpl(); //一个类只有一个Class实例，无论通过哪种方式获取，得到的都是同一个Class对象
        Class class3 = userManager.getClass();
        Class class4 = userManager1.getClass();

        System.out.println(class1);
        System.out.println(class2);
        System.out.println(class3);

        System.out.println(class1 == class2);
        System.out.println(class2 == class3);
        System.out.println(class3 == class4);

    }
}
