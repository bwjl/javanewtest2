package com.bear.javanewtest2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/7/1 3:52 下午
 * @Description: 读取properties文件
 */

public class PropertiesDemo {

    public static void main(String[] args) throws IOException {
        InputStream is = PropertiesDemo.class.getClassLoader().getResourceAsStream("log4j.properties");
        Properties properties = new Properties();
        properties.load(is);
        System.out.println(properties.getProperty("log4j.rootLogger"));
        is.close();

    }
}
