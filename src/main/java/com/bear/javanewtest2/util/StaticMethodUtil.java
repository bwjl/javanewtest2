package com.bear.javanewtest2.util;

import com.bear.javanewtest2.entity.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/3/15 4:45 下午
 * @Description:
 */

public class StaticMethodUtil {

    /**
     * 方法在该方法所属类型第一次被使用的时候加载、在该类型所在应用程序域卸载的时候卸载、也就是说 static 方法只加载一次、除非整个Domain 被卸载了
     *
     * @return
     */
    public static User getStaticObj() {
        System.out.println("getStaticObj被调用");
        return new User();
    }

    public User getInstanceObj() {
        System.out.println("getStaticObj被调用");
        return new User();
    }
}
