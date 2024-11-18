class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Will throw ArithmeticException
            if (result == 0) {
                throw new CustomArithmeticException("Result is zero");
            }
        } catch (ArithmeticException | CustomArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
