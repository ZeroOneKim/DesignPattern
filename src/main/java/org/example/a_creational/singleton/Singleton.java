package org.example.a_creational.singleton;

/**
 * Bill Pugh Singleton
 */
public class Singleton {
    private String secretKey;

    private static class SingletonInner {
        private static final Singleton singleton = new Singleton();
    }

    private Singleton() {
        this.secretKey = "1A2b3C4EKeyvAlUe";
    }

    public static Singleton getKey() {
        return SingletonInner.singleton;
    }

    public String getSecretKey() {
        return this.secretKey;
    }
}
