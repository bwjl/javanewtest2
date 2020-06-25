package com.bear.javanewtest2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/6/25 下午8:59
 * Description:
 */

public class DateFormat {
    public static void main(String[] args) {
        //1、普通的时间转换
        String string = new SimpleDateFormat("/yyyyMM/dd/").format(new Date()).toString();
        System.out.println(string);
        System.out.println("-------------------------------");
        //2、日历类的时间操作
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);

    }
}
