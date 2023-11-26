package org.example.a_creational;

import org.example.a_creational.prototype.Prototype;

import static java.lang.System.out;

/**
 * DB를 자주 접근하는경우 사용할 수 있을 것으로 보인다.
 * 여러개의 객체가 동일한 데이터베이스 정보를 쓸 때, 매번 접근하는 건 비효율 적일 수 있다.
 * 해당 정보를 프로토타입 패턴으로 복제하여 객체를 만들면 DB접근할 필요가 없어져 빠른 처리가 가능할 것으로 보인다.
 *
 * 정보가 많으면 메모리의 사용량이 늘어나는 우려가 발생할 수 있다.
 */
public class PrototypeCall {
    public static void main(String[] args) {
        Prototype obj = new Prototype();
        obj.loadCriminal();

        Prototype cri = obj.prototype();
        obj.getCriminal().add("Criminal Boss");

        obj.getCriminal()
                .stream()
                .forEach(out::println);

    }
}
