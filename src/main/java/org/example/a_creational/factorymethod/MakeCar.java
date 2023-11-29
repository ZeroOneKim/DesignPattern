package org.example.a_creational.factorymethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MakeCar implements Car {
    public static int cnt = 1;

    public Optional<List> AVANTE_CN7() {
        List<String> list = new ArrayList<>();
        list.add(cnt + "CN7 생성");
        cnt+=1;
        return Optional.of(list);
    }

    public Optional<List> SONATA() {
        List<String> list = new ArrayList<>();
        list.add(cnt + "SONATA 생성");
        cnt+=1;
        return Optional.of(list);
    }

    public Optional<List> Grandeur() {
        List<String> list = new ArrayList<>();
        list.add(cnt + "Grandeur 생성");
        cnt+=1;
        return Optional.of(list);
    }

    public Optional<List> Zenesis() {
        List<String> list = new ArrayList<>();
        list.add(cnt + "Zenesis 생성");
        cnt+=1;
        return Optional.of(list);
    }
}
