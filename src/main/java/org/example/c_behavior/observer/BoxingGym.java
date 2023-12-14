package org.example.c_behavior.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BoxingGym implements Member{
    private List<Says> memberList = new ArrayList<>();

    @Override
    public void hobbyMember(Says says) {
        memberList.add(says);
    }

    @Override
    public void playerMember(Says says) {
        memberList.add(says);
    }

    @Override
    public void memberFired(String talk) {
        memberList.forEach(memberList -> memberList.say(talk));
    }
}
