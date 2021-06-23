package com.bear.javanewtest2.file;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/6/23 10:43 上午
 * @Description: 遍历文件夹文件获取文件名
 */

public class IterateFolderFileDemo {

    private static final String FOLDER_NAME = "/Users/bear/Desktop/gedian/20210623";

    public static void main(String[] args) {
        File folder = new File(FOLDER_NAME);
        File[] files = folder.listFiles();
        for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
            System.out.println(files[i].getName());
        }
    }
}
