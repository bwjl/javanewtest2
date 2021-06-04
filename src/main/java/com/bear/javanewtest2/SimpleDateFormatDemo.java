package com.bear.javanewtest2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/6/27 上午9:41
 * Description: SimpleDateFormat yyyy-MM-dd HH:mm:ss
 */

public class SimpleDateFormatDemo {

    public static void main(String[] args) {
        //System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String date1 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(new Date());
        //时间格式化 hh 12小时制
        String date2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
    }
}
