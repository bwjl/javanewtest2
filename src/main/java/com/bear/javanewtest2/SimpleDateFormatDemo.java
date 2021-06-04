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

//   1、yy表示Year, Y表示Week Year，计算方式不一样，通常使用【y】
//
//　　2、MM是为了和分钟的m区分，Month in year
//
//　　3、dd是Day in month，D是Day in year
//
//　　4、HH是24小时制Hour in day,hh是12小时制Hour in am/pm
//
//　　5、mm是分，Minute in hour
//
//　　6、ss是秒Second in minute，S是Millisecond
//
//　　7、aa是Am/pm marker

        //System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String date1 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(new Date());
        //时间格式化 hh 12小时制
        String date2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        //SS代表毫秒
        String date3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:SS").format(new Date());
        String date4 = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
    }
}
