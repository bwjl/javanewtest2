package com.bear.javanewtest2;

import com.bear.javanewtest2.entity.Users;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/8 下午12:43
 * Description:
 */

public class SetEntityListPropertyDemo {

    public static void main(String[] args) {

        Users users = new Users();

        //users.setUsers(new ArrayList<>(Arrays.asList()));
        users.getUsers().add("bear");

        System.out.println(users.getUsers());

    }
}
