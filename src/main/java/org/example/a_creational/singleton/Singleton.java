package org.example.a_creational.singleton;

/**
 * Bill Pugh Singleton
 */
public class Singleton {
    private String secretKey;

    // 2 - 호출이 되는순간 생성자를 호출하며 인스턴스 생성.
    private static class SingletonInner {
        private static final Singleton singleton = new Singleton();
    }
    // 3 - 생성자 > 값 할당
    private Singleton() {
        this.secretKey = "1A2b3C4EKeyvAlUe";
    }

    // 1
    public static Singleton getKey() {
        return SingletonInner.singleton;
    }

    public String getSecretKey() {
        return this.secretKey; // 4 - 값을 return
    }
}
