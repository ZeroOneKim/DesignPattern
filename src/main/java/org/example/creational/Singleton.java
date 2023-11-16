package org.example.creational;

public class Singleton {
    private Singleton() {
    }

    private static class SingletonClass{
        private static final Singleton singleton = new Singleton();
    }



}
