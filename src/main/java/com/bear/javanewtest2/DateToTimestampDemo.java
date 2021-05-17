package com.bear.javanewtest2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/5/17 2:38 下午
 * @Description: 日期字符串转时间戳
 */

public class DateToTimestampDemo {

    public static void main(String[] args) throws ParseException {
        String str = "2019-03-13 13:54:00";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(str);
        long time = date.getTime();
        Integer publishTime = (int) time;

        Long longTime = new Long(time);
        System.out.println(longTime.toString().substring(0, longTime.toString().length() - 3));

        System.out.println((int) (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str).getTime() / 1000L));

    }
}
