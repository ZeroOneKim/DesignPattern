package org.example.a_creational.builder;

public class BuilderPattern {
    private Boolean noodle;
    private Boolean source;
    private Boolean oil;
    private Boolean vegetable;


    public String getData() {
        String answer = "noodle : " + noodle + " || source : " + source + " || oil : " + oil + " || vegetable : " + vegetable;
        return answer;
    }

    public class Recipe {
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
