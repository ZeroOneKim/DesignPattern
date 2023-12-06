package org.example.b_structure.adapter;

import java.util.List;

public class Adapter implements Doing{
    private final MyFriend myFriend;

    public Adapter(MyFriend myFriend) {
        this.myFriend = myFriend;
    }

    @Override
    public List perform() {
        return myFriend.Action();
    }
}
