package org.example.a_creational;

import org.example.a_creational.singleton.SimpleSingleton;
import org.example.a_creational.singleton.Singleton;

/**
 * 프로그래밍 기법 : Singleton
 */
public class SingletonCall {
    SimpleSingleton simpleSingleton = SimpleSingleton.getOb();
    Singleton singleton = Singleton.getKey();

    /**
     * 1번 방식의 경우에는 클래스 로딩시 인스턴스를 생성한다. 빠르게 접근할 수 있으나,
     * 클래스 호출 시 항상 인스턴스가 생성되므로 자원낭비가 발생할 수 있다.
     *
     * 그에 반하여 2번 방식은, 클래스 호출 시 항상 같은 인스턴스를 Return 하므로 성능적으로 이점이 있다.
     *
     * @see : https://readystory.tistory.com/116
     */
    public static void main(String[] args) {
        SingletonCall S = new SingletonCall();

        S.simpleSingletonExe();     //1번 예시
        S.singleton();              //2번 예시


    }
    public String simpleSingletonExe() {
        return simpleSingleton.getPort();
    }
    public String singleton() {
        return singleton.getSecretKey();
    }
}
