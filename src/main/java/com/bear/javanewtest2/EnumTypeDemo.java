package com.bear.javanewtest2;

import com.bear.javanewtest2.enums.ResponseCode;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/4 上午11:27
 * Description:
 */

public class EnumTypeDemo {

    public static void main(String[] args) {
        System.out.println(ResponseCode.FAILED);
        System.out.println((ResponseCode.FAILED).getClass());
        System.out.println(ResponseCode.FAILED.getCode());
        System.out.println((ResponseCode.FAILED.getMsg()).getClass());
    }
}
