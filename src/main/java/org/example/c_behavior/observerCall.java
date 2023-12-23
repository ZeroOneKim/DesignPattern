package org.example.c_behavior;

import org.example.c_behavior.observer.*;

public class observerCall {
    public static void main(String[] args ){
        BoxingGym BG = new BoxingGym();

        Says user1 = new User1();
        Says user2 = new User2();
        Says user3 = new User3();

        BG.registerBoxing(user1);
        BG.registerBoxing(user2);
        BG.registerBoxing(user3);
        BG.notifyMessage();
        System.out.println("");

        BG.removeBoxing(user3);
        BG.notifyMessage();
    }
}
