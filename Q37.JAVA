public class ConstructorOverloading {
    private int num1;
    private int num2;

    // Constructor with one parameter
    public ConstructorOverloading(int num1) {
        this.num1 = num1;
        System.out.println("Constructor with one parameter: " + num1);
    }

    // Constructor with two parameters
    public ConstructorOverloading(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Constructor with two parameters: " + num1 + ", " + num2);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorOverloading obj1 = new ConstructorOverloading(5);
        ConstructorOverloading obj2 = new ConstructorOverloading(5, 10);
    }
}
