package org.example.c_behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class BoxingGym implements Member{
    List<Says> saysList = new ArrayList<>();

    public void registerBoxing(Says says) {
        saysList.add(says);
        System.out.println(says + " 복싱짐 등록 완료");
    }

    public void removeBoxing(Says says) {
        saysList.remove(says);
        System.out.println(says + " 복싱짐 등록 취소");
    }

    public void notifyMessage() {
        for(Says says : saysList) {
            says.say();
        }
    }

}
