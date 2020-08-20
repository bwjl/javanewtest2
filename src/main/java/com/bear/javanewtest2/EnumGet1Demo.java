package com.bear.javanewtest2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/20 下午3:02
 * Description:
 */

public class EnumGet1Demo {

    public static void main(String[] args) {

    }
}

enum People {

    JACK(18, "man", "song"),
    DAVID(19, "man", "write"),
    ALEEN(20, "man", "dink"),
    LILY(20, "women", "dance"),
    ;

    private int i;
    private String man;
    private String song;

    People(int i, String man, String song) {
        this.i = i;
        this.man = man;
        this.song = song;
    }
}
