// Parent class Vehicle
class Vehicle {
    protected String regnNumber, color, ownerName;
    protected double speed;

    public void showData() {
        System.out.println("This is a vehicle class");
    }
}

// Subclass Bus
class Bus extends Vehicle {
    private String routeNumber;

    public Bus(String regnNumber, String color, String ownerName, double speed, String routeNumber) {
        this.regnNumber = regnNumber;
        this.color = color;
        this.ownerName = ownerName;
        this.speed = speed;
        this.routeNumber = routeNumber;
    }

    public void showData() {
        super.showData();
        System.out.println("Bus Route: " + routeNumber);
    }
}

// Subclass Car
class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, String color, String ownerName, double speed, String manufacturerName) {
        this.regnNumber = regnNumber;
        this.color = color;
        this.ownerName = ownerName;
        this.speed = speed;
        this.manufacturerName = manufacturerName;
    }

    public void showData() {
        super.showData();
        System.out.println("Car Manufacturer: " + manufacturerName);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Bus bus = new Bus("1234", "Red", "John", 60, "Route 10");
        Car car = new Car("5678", "Blue", "Jane", 120, "Toyota");

        bus.showData(); // Display Bus data
        car.showData(); // Display Car data
    }
}
