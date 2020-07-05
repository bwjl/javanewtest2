package com.bear.javanewtest2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/2 上午11:26
 * Description: Class 对象
 */

public class ReflectClass {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<UserManagerImpl> class1 = UserManagerImpl.class;
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

        //获取field
        Field[] fields = class1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("获取成员变量：" + field);
        }

        //获取方法
        Method[] methods = class1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("获取成员方法：" + method);
        }

        //获取构造方法
        Constructor[] constructors = class1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("获取构造器：" + constructor);
        }

        //通过反射调用方法
        Method method = class1.getMethod("addUser", String.class, String.class);
        UserManager userManager2 = (UserManager) class1.newInstance();
        method.invoke(userManager2, "bear", "123456");

    }
}
