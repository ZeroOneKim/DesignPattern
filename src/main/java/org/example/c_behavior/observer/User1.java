package org.example.c_behavior.observer;

public class User1 implements Says {
    public void say() {
        System.out.println("User1 한테 이벤트 알림이 왔습니다.");
    }

    public String toString() { return "User1 !!!"; }
}