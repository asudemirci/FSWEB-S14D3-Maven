package org.example.company;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " ford engine starting...";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " ford is accelerating...";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " ford is braking...";
    }
}
