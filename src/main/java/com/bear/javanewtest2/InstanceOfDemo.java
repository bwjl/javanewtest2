package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/14 下午9:34
 * Description: instanceOf 父类 true
 */

public class InstanceOfDemo {

    public static void main(String[] args) {

        SonInstanceOf sonInstanceOf = new SonInstanceOf();

        System.out.println(sonInstanceOf instanceof GrandFatherInstanceOf);
        System.out.println(sonInstanceOf instanceof FatherInstanceOf);
        System.out.println(sonInstanceOf instanceof SonInstanceOf);
    }

}


class GrandFatherInstanceOf {

}

class FatherInstanceOf extends GrandFatherInstanceOf {

}

class SonInstanceOf extends FatherInstanceOf {

}
