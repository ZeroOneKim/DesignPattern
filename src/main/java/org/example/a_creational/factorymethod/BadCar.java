package org.example.a_creational.factorymethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.example.a_creational.factorymethod.MakeCar.cnt;

public class BadCar implements Car{
    public Optional<List> AVANTE_CN7() {
        List<String> list = new ArrayList<>();
        list.add(cnt + " CN7 불량 폐차!!!");
        cnt+=1;
        return Optional.of(list);
    }

    public Optional<List> SONATA() {
        List<String> list = new ArrayList<>();
        list.add(cnt + " SONATA 불량 폐차!!!");
        cnt+=1;
        return Optional.of(list);
    }

    public Optional<List> Grandeur() {
        List<String> list = new ArrayList<>();
        list.add(cnt + " Grandeur 불량 폐차!!!");
        cnt+=1;
        return Optional.of(list);
    }

    public Optional<List> Zenesis() {
        List<String> list = new ArrayList<>();
        list.add(cnt + " Zenesis 불량 폐차!!!");
        cnt+=1;
        return Optional.of(list);
    }
}
