package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    // Getter metodları eklendi
    public double getAverageKmPerLiter() {
        return avgKmPerLitre;  // Getter metodunu ekledik
    }

    public int getCylinders() {
        return cylinders;  // Getter metodunu ekledik
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Igniting fuel engine with " + cylinders + " cylinders.");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": Driving with gasoline, consuming " + avgKmPerLitre + " km/l.");
        runEngine();
    }
}
