package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
        this.name = "Unknown";
        this.description = "No description";
    }
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " Starting generic engine...";
    }
    public String drive() {
        return getClass().getSimpleName() + " -> Driving...\n" + runEngine();
    }
    protected String runEngine() {
        return getClass().getSimpleName() + " -> Running generic engine logic...";
    }

}
