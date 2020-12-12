package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/12 下午10:16
 * Description: Integer转Long long
 */

public class IntegerToLong {

    public static void main(String[] args) {
        Integer createTime = 1562569600;
        Long time1 = createTime.longValue();
        long time2 = createTime.longValue();
        System.out.println(time1);
        System.out.println(time2);

    }

}
