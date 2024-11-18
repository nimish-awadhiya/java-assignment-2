class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class PersonAge {
    public static void main(String[] args) {
        try {
            int age = Integer.parseInt(args[0]);
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative");
            }
            System.out.println("Valid age: " + age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
