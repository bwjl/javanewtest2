package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/6/22 下午10:54
 * Description:
 */

public class UserManagerImpl implements UserManager {

    @Override
    public void addUser(String username, String password) {
        System.out.println("调用了新增的方法！");
        System.out.println("传入参数为 userName: " + username + " password: " + password);
    }

    @Override
    public void delUser(String username) {
        System.out.println("调用了删除的方法！");
        System.out.println("传入参数为 userName: " + username);
    }
}
