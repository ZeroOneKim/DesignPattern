package org.example.c_behavior.observer;

public class User3 implements Says {
    public void say() {
        System.out.println("User3 한테 이벤트 알림이 왔습니다.");
    }

    public String toString() { return "User3 !!!"; }
}
