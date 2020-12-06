package com.bear.javanewtest2;

import com.bear.javanewtest2.impl.XiaoMing;
import com.bear.javanewtest2.interfaces.Human;
import com.bear.javanewtest2.interfaces.Man;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/6 下午8:51
 * Description: 以接口类型声明的变量实例 只能调用该接口包含的方法
 */

public class ExtendsInterfaceDemo {

    public static void main(String[] args) {
        Human human1 = new XiaoMing();
        Man man = new XiaoMing();
        human1.eat(); //不能调用carryRock
        man.carryRock();

    }
}
