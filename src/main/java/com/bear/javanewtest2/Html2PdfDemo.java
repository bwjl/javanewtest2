package com.bear.javanewtest2;

import com.bear.javanewtest2.wkhtmltopdf.HtmlToPdfInterceptor;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/2/3 下午10:21
 * Description: html转pdf
 */

public class Html2PdfDemo {

    /**
     * wkhtmltopdf Linux安装路径
     */
    public static final String toPdfTool = "/usr/local/bin/wkhtmltopdf";

    public static void main(String[] args) {
        convert("A4", "https://www.baidu.com", "/Users/bear/Desktop/baidu01-java.pdf");
    }


    /**
     * html转pdf
     *
     * @param pageSize
     * @param srcPath  html路径，可以是硬盘上的路径，也可以是网络路径
     * @param destPath pdf保存路径
     * @return 转换成功返回true
     */
    public static boolean convert(String pageSize, String srcPath, String destPath) {
        File file = new File(destPath);
        File parent = file.getParentFile();
        //如果pdf保存路径不存在，则创建路径
        if (!parent.exists()) {
            parent.mkdirs();
        }

        StringBuilder cmd = new StringBuilder();
        cmd.append(toPdfTool);
        cmd.append(" ");
        cmd.append("--page-size ");
        cmd.append(pageSize);
        cmd.append(" ");
        cmd.append(srcPath);
        cmd.append(" ");
        cmd.append(destPath);

        boolean result = true;
        try {
            Process proc = Runtime.getRuntime().exec(cmd.toString());
            HtmlToPdfInterceptor error = new HtmlToPdfInterceptor(proc.getErrorStream());
            HtmlToPdfInterceptor output = new HtmlToPdfInterceptor(proc.getInputStream());
            error.start();
            output.start();
            proc.waitFor();
        } catch (Exception e) {
            result = false;
            e.printStackTrace();
        }

        return result;
    }
}
