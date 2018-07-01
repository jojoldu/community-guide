package com.jojoldu.inflearn.intellij.community.chap6.extract;

public class InnerClass {

    public void moveInnerClass() {
        Team team = new Team("개발팀", "develop");
        System.out.println(team.getCode());
    }

    public static class Team {
        private String name;
        private String code;

        public Team(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }
    }
}
