package com.jojoldu.inflearn.intellij.community.chap1.lineedit;

/**
 * Created by jojoldu@gmail.com on 2018. 5. 7.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class LineJoin {

    public String joinString () {
        String profile = "안녕하세요.IntelliJ 강의에 오신것을 환영합니다. ";

        return profile;
    }

    public String createQuery() {
        String query = "SELECT * FROM member WHERE member.name = 'jojoldu'";
        return query;
    }
}
