package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {

        CarSkeleton gasCar = new GasPoweredCar("Toyota Corolla", "Efficient gas car", 14.5, 4);
        CarSkeleton electricCar = new ElectricCar("Tesla Model 3", "Fully electric car", 400.0, 75);
        CarSkeleton hybridCar = new HybridCar("Toyota Prius", "Hybrid vehicle", 20.0, 40, 4);

        System.out.println(gasCar.startEngine());
        System.out.println(gasCar.drive());

        System.out.println();

        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());

        System.out.println();

        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());

    }
}