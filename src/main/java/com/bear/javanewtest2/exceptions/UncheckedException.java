package com.bear.javanewtest2.exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/2/3 上午11:26
 * Description: 非检查型异常
 */

public class UncheckedException extends RuntimeException {

    public UncheckedException(String message) {
        super(message);
    }
}
