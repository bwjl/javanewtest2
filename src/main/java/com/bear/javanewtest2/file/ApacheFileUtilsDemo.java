package com.bear.javanewtest2.file;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/6/10 11:59 上午
 * @Description: FileUtils.touch 生成或打开已存在的文件
 */

public class ApacheFileUtilsDemo {

    public static void main(String[] args) throws IOException {

        String excelFileName = "/Users/bear/Desktop/apache1.xlsx";

        //生成的excel无法打开
        //FileUtils.touch(new File(excelFileName));
        String fileDir = "/Users/bear/Desktop/" + new SimpleDateFormat("yyyyMM/dd").format(new Date())
                + "/";
        FileUtils.touch(new File(fileDir));
    }
}
