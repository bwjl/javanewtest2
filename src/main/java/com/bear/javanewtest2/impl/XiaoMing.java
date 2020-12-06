package com.bear.javanewtest2.impl;

import com.bear.javanewtest2.interfaces.Man;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/6 下午8:57
 * Description:
 */

public class XiaoMing implements Man {
    @Override
    public void carryRock() {
        System.out.println("XiaoMing can carry rock");
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
