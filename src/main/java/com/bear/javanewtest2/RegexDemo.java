package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/26 上午11:39
 * Description: 正则仅匹配数字字母组合
 */

public class RegexDemo {

//    var p = /(?!^\d+$)(?!^[a-zA-Z]+$)[0-9a-zA-Z]{4,23}/
//            (?!^\d+$) 排除全数字
//            (?!^[a-zA-Z]+$) 排除全字母
//[0-9a-zA-Z]{4,23} 字符或字母4-23位，不考虑全为数字和全为字符情况。

    public static void main(String[] args) {
        numberAlphaOnly();
    }

    /**
     * 仅匹配数字字母
     */
    public static void numberAlphaOnly() {
        String password1 = "a12314515Z+";
        String password2 = "a12314515Z";

        String regex = "(?!^\\d+$)(?!^[a-zA-Z]+$)[0-9a-zA-Z]{8,16}";

        System.out.println(password1.matches(regex));
        System.out.println(password2.matches(regex));
    }


}
