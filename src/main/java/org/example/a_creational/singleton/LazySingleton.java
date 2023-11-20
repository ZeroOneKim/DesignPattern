package org.example.a_creational.singleton;

public class LazySingleton {
    private String phone;

    private static class LazySingletonHolder {
        private static final LazySingleton exe = new LazySingleton();
    }

    private LazySingleton() {
        this.phone = "010-5454-5454";
    }

    public static LazySingleton canExe() {
        return LazySingletonHolder.exe;
    }

    public String getPhone() {
        return this.phone;
    }
}
