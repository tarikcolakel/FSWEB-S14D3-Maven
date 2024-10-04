package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public int getBatterySize() {
        return batterySize; // Getter metodunu ekledik
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge; // Getter metodunu ekledik
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Starting electric motor with " + batterySize + " kWh battery.");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": Driving electrically, consuming " + avgKmPerCharge + " km per charge.");
        runEngine();
    }
}
