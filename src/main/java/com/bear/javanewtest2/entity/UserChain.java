package com.bear.javanewtest2.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/2/18 11:02 上午
 * Description:
 */

@Data
@Accessors(chain = true)
public class UserChain implements Serializable {

    private int age;

    private int sex;

    private String name;

    private Date birthday;

}
