package com.bear.javanewtest2;

import com.bear.javanewtest2.util.StaticMethodUtil;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/3/15 4:43 下午
 * @Description: static方法与非static方法区别
 */

public class StaticMethodDemo {

    public static void main(String[] args) {

        System.out.println("第一次获取静态方法：" + StaticMethodUtil.getStaticObj().hashCode());
        System.out.println("第二次获取静态方法：" + StaticMethodUtil.getStaticObj().hashCode());

        System.out.println("第一次获取实例方法：" + new StaticMethodUtil().getInstanceObj().hashCode());
        System.out.println("第二次获取实例方法：" + new StaticMethodUtil().getInstanceObj().hashCode());
    }
}
