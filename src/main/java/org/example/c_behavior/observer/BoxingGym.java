package org.example.c_behavior.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BoxingGym implements Member{
    private List<Says> memberList = new ArrayList<>();

    public void hobbyPerson() {
        System.out.println("취미반 등록 요청!");
        processing("취미반 등록 완료");
    }
    public void playerPerson() {
        System.out.println("선수부 등록 요청!");
        processing("선수부 등록 완료");
    }

    @Override
    public void hobbyMember(Says says) {
        memberList.add(says);
    }

    @Override
    public void playerMember(Says says) {
        memberList.add(says);
    }

    @Override
    public void memberFired(Says says) {
        memberList.remove(says);
    }
    @Override
    public void processing(String talk) {
        memberList.forEach(memberList -> memberList.say(talk));
    }
}
