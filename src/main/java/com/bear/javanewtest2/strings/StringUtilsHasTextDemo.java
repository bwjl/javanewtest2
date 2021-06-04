package com.bear.javanewtest2.strings;

import org.springframework.util.StringUtils;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/6 下午1:00
 * Description: spring StringUtil hasText 用法 过滤了空格
 */

public class StringUtilsHasTextDemo {

    public static void main(String[] args) {

        System.out.println(StringUtils.hasText(null)); //false
        System.out.println(StringUtils.hasText("")); //false
        System.out.println(StringUtils.hasText("   ")); //false
        System.out.println(StringUtils.hasText(" 123  ")); //true

    }
}
