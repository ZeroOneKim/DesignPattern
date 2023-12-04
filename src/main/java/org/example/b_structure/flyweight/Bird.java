package org.example.b_structure.flyweight;

public class Bird implements FeatureOfBird {
    private int size;
    private int speed;

    public Bird(int size) {
        this.size = size;
    }
    public void setSpeed(int speed) { this.speed = speed; }


    public void search() {
        System.out.println("Size : " + size + "     Speed : " + speed);
    }
}
