package org.example.a_creational;

import org.example.a_creational.singleton.SimpleSingleton;

public class SingletonCall {
    SimpleSingleton simpleSingleton = SimpleSingleton.getOb();

    public static void main(String[] args) {




    }
    public void SimpleSingletonExe() {
        simpleSingleton.getEmailId();
        simpleSingleton.getPasswordSMTP();
        simpleSingleton.getPort();
    }
}
