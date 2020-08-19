package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/19 下午1:45
 * Description: final方法不允许被重写
 */

public class FinalStaticMethodDemo extends Coder implements FinalStaticMethodInterfaceDemo {

    @Override
    final void fixBug() {

    }

    @Override
    final static void writeCode() {

    }
}


class Coder {

    /**
     * 改bug
     */
    final void fixBug() {

    }


    /**
     * 写代码
     */
    final static void writeCode() {

    }
}
