package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Powering on battery...";
    }

    @Override
    public String drive() {
        return getClass().getSimpleName() + " -> Driving silently on electricity...\n" + runEngine();
    }
    @Override
    protected String runEngine() {
        return getClass().getSimpleName() + " -> Battery size: " + batterySize + " kWh, range: " + avgKmPerCharge + " km.";
    }


}
