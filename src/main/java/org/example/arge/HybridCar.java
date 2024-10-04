package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    // Getter metodları eklendi
    public double getAvgKmPerLiter() {
        return avgKmPerLitre;  // AvgKmPerLitre getter metodunu ekledik
    }

    public int getBatterySize() {
        return batterySize;  // BatterySize getter metodunu ekledik
    }

    public int getCylinders() {
        return cylinders;  // Cylinders getter metodunu ekledik
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Starting hybrid engine with " + cylinders + " cylinders and " + batterySize + " kWh battery.");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": Driving in hybrid mode, consuming " + avgKmPerLitre + " km/l and using battery.");
        runEngine();
    }
}
