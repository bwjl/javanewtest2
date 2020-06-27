package com.bear.javanewtest2;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/6/25 下午9:19
 * Description:
 */

public class randomUUIDTest {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString()); //aee13330-46a5-41c5-833e-91590a54d422
        System.out.println(UUID.randomUUID().toString().replace("-", "")); //e29e3d61b47948a0b4a661a050715b1f
    }
}
