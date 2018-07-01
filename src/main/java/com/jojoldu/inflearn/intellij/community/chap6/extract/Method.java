package com.jojoldu.inflearn.intellij.community.chap6.extract;

import java.util.List;

public class Method {

    public void extractMethod(List<Book> books) {
        for (Book book : books) {
            for (String s : book.getAuthors()) {
                if("jojoldu".equals(s)){
                    System.out.println("담당자가 맞습니다.");
                }
            }
        }

    }

    public static class Book {
        private String title;
        private long price;
        private List<String> authors;

        public String getTitle() {
            return title;
        }

        public long getPrice() {
            return price;
        }

        public List<String> getAuthors() {
            return authors;
        }
    }
}
