package org.example.a_creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototype implements ProtoImplCrimainal{
    private List<String> criminalList;

    public Prototype() {
        criminalList = new ArrayList<String>();
    }

    public Prototype(List<String> list) {
        this.criminalList = list;
    }

    public Prototype prototype() {
        return null;
    }
}
