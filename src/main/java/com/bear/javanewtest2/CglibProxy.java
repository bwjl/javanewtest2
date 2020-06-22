package com.bear.javanewtest2;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/6/22 下午11:14
 * Description: Cglib 代理
 */

public class CglibProxy implements MethodInterceptor {
    private Object target;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib代理开始");
        method.invoke(target, objects);
        System.out.println("cglib代理结束");

        return null;
    }

    /**
     * 获取代理对象
     *
     * @return
     */
    public Object getProxyObj(Object target) {
        this.target = target;

        Enhancer enhancer = new Enhancer();
        //设置父类,因为Cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(target.getClass());

        enhancer.setCallback(this);// 设置回调
        Object result = enhancer.create();//创建并返回代理对象
        return result;

    }

    public static void main(String[] args) {

        //获取代理对象
        CglibProxy cglibProxy = new CglibProxy();
        UserManager userManager = (UserManager) cglibProxy.getProxyObj(new UserManagerImpl());

        userManager.delUser("bear");

    }
}
