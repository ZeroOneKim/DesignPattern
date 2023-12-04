package org.example.b_structure;

import org.example.b_structure.flyweight.Bird;

import java.util.HashMap;

/**
 * 구조 패턴 - flyweight
 *
 * 실행 시 객체 인스턴스의 개수를 줄여서 메모리를 절약할 수 있음.
 * 여러 가상 객체의 상태를 한 곳에 집중 시켜놓을 수 있으므로, 필요의 경우 객체를 중복 생성하지 않고 재사용이 가능하다.
 */
public class FlyweightCall {
    private static final HashMap<Integer, Bird> birdSize = new HashMap<>();
    private static int[] sizes = {10, 30, 70, 120};
    static int num = 1;

    public static void main(String[] args) {
        createAndFly(10);
        createAndFly(10);
        createAndFly(30);
        createAndFly(30);
        createAndFly(30);
        createAndFly(70);
        createAndFly(120);
    }

    private static void createAndFly(int size) {
        Bird bird = birdSize.get(size);

        if (bird == null) {
            bird = new Bird(size);
            birdSize.put(size, bird);
            System.out.print(num+". 새로 생성!! : " + size + "\t\t");
        } else {
            System.out.print(num+". 객체 이미 있음!!: " + size + "\t\t");
        }
        num += 1;
        bird.setSpeed(20);
        bird.search();
    }

}
