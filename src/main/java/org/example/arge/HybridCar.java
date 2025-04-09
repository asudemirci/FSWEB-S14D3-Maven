package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " starting hybrid system...";
    }

    @Override
    public String drive() {
        return getClass().getSimpleName() + " driving efficiently with hybrid system...\n" + runEngine();
    }

    @Override
    protected String runEngine() {
        return getClass().getSimpleName() + " battery: " + batterySize + " kWh, " + cylinders + " cylinders, " +
                avgKmPerLiter + " km/l efficiency.";
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }
}
