package org.example.c_behavior.observer;

public class User3 implements Says {
    @Override
    public void say(String sentence) {
        System.out.println("요청 사항 : " + sentence);
    }
}
