package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/14 下午2:23
 * Description:
 */

public class SpiltDemo {

    public static void main(String[] args) {
        String ids = "1,2";

        String id[] = ids.split(",");

        System.out.println(id);

        for (int i = 0; i < id.length; i++) {
            System.out.println(id[i]);
        }
    }
}
