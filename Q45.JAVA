// Base class Distance
class Distance {
    double miles;

    public Distance(double miles) {
        this.miles = miles;
    }

    public void travelTime() {
        double time = miles / 60; // Time = distance/speed (miles per hour)
        System.out.println("Time to cover " + miles + " miles: " + time + " hours");
    }
}

// Derived class DistanceMKS
class DistanceMKS extends Distance {
    public DistanceMKS(double miles) {
        super(miles);
    }

    @Override
    public void travelTime() {
        double kilometers = miles * 1.60934; // Convert miles to kilometers
        double time = kilometers / 100; // Time = distance/speed (km per second)
        System.out.println("Time to cover " + kilometers + " km: " + time + " seconds");
    }
}

public class Main {
    public static void main(String[] args) {
        Distance distance = new Distance(120);
        distance.travelTime();

        DistanceMKS distanceMKS = new DistanceMKS(120);
        distanceMKS.travelTime();
    }
}
