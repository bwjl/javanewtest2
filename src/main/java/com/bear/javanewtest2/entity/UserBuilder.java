package com.bear.javanewtest2.entity;

import lombok.Builder;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/22 下午10:33
 * Description: User实体类
 */

@Data
@Builder
public class UserBuilder {

    private String name;
    private Integer age;
    private Double height;
    private int size;

}
