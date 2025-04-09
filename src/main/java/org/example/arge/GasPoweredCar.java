package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double averageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Gas engine starting with " + cylinders + " cylinders.";
    }
    @Override
    public String drive() {
        return getClass().getSimpleName() + " -> Driving on gasoline...\n" + runEngine();
    }
    @Override
    protected String runEngine() {
        return getClass().getSimpleName() + " -> Running at " + averageKmPerLiter + " km per litre.";
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }
}
