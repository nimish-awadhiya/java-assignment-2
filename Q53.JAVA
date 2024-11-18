public class TestExceptions {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[-1]); // This will throw NegativeArraySizeException

            int result = 10 / 0; // This will throw ArithmeticException
        } catch (NegativeArraySizeException | ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}
