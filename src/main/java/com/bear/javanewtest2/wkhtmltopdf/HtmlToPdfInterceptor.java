package com.bear.javanewtest2.wkhtmltopdf;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/2/3 下午10:23
 * Description:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 当java调用wkhtmltopdf时，用于获取wkhtmltopdf返回的内容
 */
public class HtmlToPdfInterceptor extends Thread {
    private InputStream is;

    public HtmlToPdfInterceptor(InputStream is) {
        this.is = is;
    }

    @Override
    public void run() {
        try {
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line.toString()); //输出内容
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
