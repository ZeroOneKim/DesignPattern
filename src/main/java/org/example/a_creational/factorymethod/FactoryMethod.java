package org.example.a_creational.factorymethod;


import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class FactoryMethod {
    public static void main(String[] args) {
        MakeCar makeCar = new MakeCar();
        BadCar badCar  = new BadCar();

        List<String> factory = new ArrayList<>();

        factory.add(String.valueOf(badCar.AVANTE_CN7()));
        factory.add(String.valueOf(makeCar.SONATA()));
        factory.add(String.valueOf(makeCar.AVANTE_CN7()));
        factory.add(String.valueOf(badCar.Grandeur()));
        factory.add(String.valueOf(makeCar.Grandeur()));
        factory.add(String.valueOf(makeCar.AVANTE_CN7()));
        factory.add(String.valueOf(makeCar.Zenesis()));

        factory.stream().forEach(out::println);
    }
}

