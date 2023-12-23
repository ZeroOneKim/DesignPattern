package org.example.c_behavior.observer;

public interface Member {

    void registerBoxing(Says says);
    void removeBoxing(Says says);
    void notifyMessage();

}
