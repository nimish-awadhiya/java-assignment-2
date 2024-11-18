import java.util.Scanner;

// Base class
class ThreeDObject {
    public double wholeSurfaceArea() {
        return 0.0;
    }

    public double volume() {
        return 0.0;
    }
}

// Derived class Box
class Box extends ThreeDObject {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}

// Derived class Cube
class Cube extends Box {
    public Cube(double side) {
        super(side, side, side);
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * Math.pow(super.volume(), 2 / 3.0);
    }

    @Override
    public double volume() {
        return Math.pow(super.volume(), 1 / 3.0);
    }
}

// Derived class Cylinder
class Cylinder extends ThreeDObject {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

// Derived class Cone
class Cone extends ThreeDObject {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    @Override
    public double volume() {
        return (1 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Box
        System.out.println("Enter dimensions for Box:");
        System.out.print("Length: ");
        double length = sc.nextDouble();
        System.out.print("Width: ");
        double width = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Cylinder
        System.out.println("Enter dimensions for Cylinder:");
        System.out.print("Radius: ");
        double radius = sc.nextDouble();
        System.out.print("Height: ");
        height = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Cone
        System.out.println("Enter dimensions for Cone:");
        System.out.print("Radius: ");
        radius = sc.nextDouble();
        System.out.print("Height: ");
        height = sc.nextDouble();
        Cone cone = new Cone(radius, height);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        sc.close();
    }
}
