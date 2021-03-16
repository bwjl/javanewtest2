package com.bear.javanewtest2.lombok;

import lombok.SneakyThrows;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/3/16 10:59 上午
 * @Description: @SneakThrows 隐藏Exception类 检查型异常
 */

public class LombokSneakThrowsDemo {

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println(LombokSneakThrowsDemo.class.newInstance());
    }
}
