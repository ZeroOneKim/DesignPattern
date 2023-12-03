package org.example.a_creational.builder;

/**
 * Builder 패턴.
 * 1. 이와 같은 프로그래밍 작성 패턴은 두 클래스 간의 관계에 대한 파악을 쉽게 할 수 있다.
 * 2. inner class 의 경우 static으로 선언 하여 주는이유가 정적 내부 클래스는 외부 클래스의 인스턴스 없이도 생성할 수 있는데, 만일 일반
 *    내부 클래스로 구성한다면 내부 클래스를 생성하기도 전에 외부 클래스를 인스턴스화 해야 한다.
 */
public class BuilderPattern {
    private Boolean noodle;
    private Boolean source;
    private Boolean oil;
    private Boolean vegetable;


    public String getData() {
        String answer = "noodle : " + noodle + " || source : " + source + " || oil : " + oil + " || vegetable : " + vegetable;
        return answer;
    }

    public static class Recipe {
        private BuilderPattern builderPattern = new BuilderPattern();

        Boolean noodle;
        Boolean source;
        Boolean oil;
        Boolean vegetable;

        public Recipe chkNoodle(Boolean chk) {
            builderPattern.noodle = chk;
            return this;
        }
        public Recipe chkSource(Boolean chk) {
            builderPattern.source = chk;
            return this;
        }
        public Recipe oil(Boolean chk) {
            builderPattern.oil = chk;
            return this;
        }
        public Recipe vegetable(Boolean chk) {
            builderPattern.vegetable = chk;
            return this;
        }

        public BuilderPattern build() {
            return builderPattern;
        }
    }

    public Recipe builder() {
        return new Recipe();
    }
}
