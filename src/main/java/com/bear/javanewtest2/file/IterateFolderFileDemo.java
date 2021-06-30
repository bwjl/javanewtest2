package com.bear.javanewtest2.file;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/6/23 10:43 上午
 * @Description: 遍历文件夹文件获取文件名、并且重命名
 */

public class IterateFolderFileDemo {

    private static final String FOLDER_NAME = "/Users/bear/Desktop/gedian/20210623";
    private static final String[] ALLOWED_FILE_EXT = {"jpg", "jpeg", "png"};

    public static void main(String[] args) {
        File folder = new File(FOLDER_NAME);
        File[] files = folder.listFiles();
        for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
            if (files[i].isFile()) {
                //是文件
                String fileName = files[i].getName();
                System.out.println(fileName);

                String[] fileArr = fileName.split("\\.");

                //允许的后缀
                if (Arrays.asList(ALLOWED_FILE_EXT).contains(fileArr[fileArr.length - 1])) {
                    String newName = fileName.substring(0, fileName.lastIndexOf(".")) + "-1"
                            + fileName.substring(fileName.lastIndexOf("."), fileName.length());
                    System.out.println(newName);
                }

            }
        }
    }
}
