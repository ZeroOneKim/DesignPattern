package org.example.c_behavior.observer;

public class User1 implements Says {
    @Override
    public void say(String sentence) {
        System.out.println("User1 : " + sentence);
    }
}