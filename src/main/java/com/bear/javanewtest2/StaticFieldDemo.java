package com.bear.javanewtest2;

import com.bear.javanewtest2.util.StaticFieldUtil;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/3/15 5:06 下午
 * @Description: static field 共享变量
 */

public class StaticFieldDemo {

    public static void main(String[] args) {
        System.out.println("第一次获取静态字段：" + StaticFieldUtil.user.hashCode());
        System.out.println("第二次获取静态字段：" + StaticFieldUtil.user.hashCode());
    }
}
