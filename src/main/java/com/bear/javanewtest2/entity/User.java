package com.bear.javanewtest2.entity;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/22 下午10:33
 * Description: User实体类
 */

public class User {

    private String name;
    private Integer age;
    private Double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
