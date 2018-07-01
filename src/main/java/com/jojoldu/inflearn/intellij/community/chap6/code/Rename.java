package com.jojoldu.inflearn.intellij.community.chap6.code;

public class Rename {

    public void rename() {
        String legacy = "a";

        for (int i = 0; i < 10; i++) {
            System.out.println(legacy);
        }

        System.out.println("변수값: "+legacy);
    }
}
