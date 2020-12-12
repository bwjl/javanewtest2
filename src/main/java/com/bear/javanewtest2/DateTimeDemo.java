package com.bear.javanewtest2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/12 下午8:50
 * Description: 时间戳、日期转换
 */

public class DateTimeDemo {

    public static void main(String[] args) {
        System.out.println(LocalDate.now()); //2020-12-12
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))); //2020-12-12
        System.out.println(LocalTime.now()); //20:54:22.543
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))); //20:58:16
        System.out.println(LocalDateTime.now()); //2020-12-12T20:53:15.140
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))); //2020-12-12T20:53:15.140

        long time = 1562569600L;

        String dateTime = LocalDateTime.ofEpochSecond(time, 0, ZoneOffset.ofHours(8)).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(dateTime);


    }
}
