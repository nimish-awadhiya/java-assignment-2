import java.util.Scanner;

public class SumConsecutiveDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();
        int sum = 0;

        for (int i = 0; i < num.length() - 1; i++) {
            int n1 = Integer.parseInt(num.substring(i, i + 2));
            sum += n1;
        }

        System.out.println("Sum: " + sum);
        sc.close();
    }
}
