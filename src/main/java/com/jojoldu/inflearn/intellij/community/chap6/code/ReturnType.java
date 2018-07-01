package com.jojoldu.inflearn.intellij.community.chap6.code;

public class ReturnType {
    public void print() {
        String num = calculate();
        System.out.println(num);
    }

    public String calculate() {
        return "1";
    }
}
