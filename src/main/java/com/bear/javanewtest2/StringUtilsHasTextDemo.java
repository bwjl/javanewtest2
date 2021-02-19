package com.bear.javanewtest2;

import org.springframework.util.StringUtils;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/6 下午1:00
 * Description: spring StringUtil hasText 用法 过滤了空格
 */

public class StringUtilsHasTextDemo {

    public static void main(String[] args) {

        System.out.println(StringUtils.hasText(null));
        System.out.println(StringUtils.hasText(""));
        System.out.println(StringUtils.hasText("   "));
        System.out.println(StringUtils.hasText(" 123  "));

    }
}
