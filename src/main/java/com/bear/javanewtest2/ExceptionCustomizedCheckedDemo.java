package com.bear.javanewtest2;

import com.bear.javanewtest2.exceptions.CheckedException;
import com.bear.javanewtest2.exceptions.UncheckedException;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/2/3 上午11:12
 * Description: 自定义检查型异常
 */

public class ExceptionCustomizedCheckedDemo {

    public static void main(String[] args) throws CheckedException {
        (new ExceptionCustomizedCheckedDemo()).new Father().test(1);
        (new ExceptionCustomizedCheckedDemo()).new Father().test(-1);
    }

    class Father {
        public void test(int age) throws CheckedException {
            if (age > 0) {
                throw new CheckedException("检查型异常");
            }
            if (age <= 0) {
                throw new UncheckedException("非检查型异常");
            }
        }
    }
}
