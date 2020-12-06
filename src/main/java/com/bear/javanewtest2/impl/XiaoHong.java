package com.bear.javanewtest2.impl;

import com.bear.javanewtest2.interfaces.Woman;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/6 下午8:58
 * Description:
 */

public class XiaoHong implements Woman {
    @Override
    public void makeUp() {
        System.out.println("XiaoHong can makes up");
    }

    @Override
    public void eat() {
        System.out.println("XiaoMing can eat");
    }

    @Override
    public void sleepNight() {
        System.out.println("XiaoMing can sleepNight");
    }
}
