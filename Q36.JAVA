public class ParameterizedConstructor {
    private int num;

    // Parameterized constructor
    public ParameterizedConstructor(int num) {
        this.num = num;
    }

    public void display() {
        System.out.println("The number is: " + num);
    }

    public static void main(String[] args) {
        // Creating an object with a parameterized constructor
        ParameterizedConstructor obj = new ParameterizedConstructor(10);
        obj.display();
    }
}
