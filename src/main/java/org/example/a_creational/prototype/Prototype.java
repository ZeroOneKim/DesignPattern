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
        List<String> tempList = new ArrayList<String>();
        for (String criminal : this.criminalList) {
            tempList.add(criminal);
        }
        return new Prototype(tempList);
    }

    public void loadCriminal() {
        criminalList.add("Bad Kim");
        criminalList.add("Bad Lee");
    }

    public List<String> getCriminal() {
        return criminalList;
    }

}
