package com.jojoldu.inflearn.intellij.community.chap1.view;

public class ViewArguments {

    public void viewArguments() {
        EmailSender emailSender = new EmailSender(1L, "", "");

        EmailSender.receive("", "");
    }
}
