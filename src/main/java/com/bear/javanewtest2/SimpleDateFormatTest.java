package com.bear.javanewtest2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/6/27 上午9:41
 * Description:
 */

public class SimpleDateFormatTest {

    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
