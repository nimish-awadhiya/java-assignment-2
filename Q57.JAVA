class TooOlderException extends Exception {
    public TooOlderException(String message) {
        super(message);
    }
}

class TooYoungerException extends Exception {
    public TooYoungerException(String message) {
        super(message);
    }
}

public class EmployeeRecruitment {
    public static void main(String[] args) {
        try {
            int age = Integer.parseInt(args[0]);
            if (age > 45) {
                throw new TooOlderException("Too old for recruitment");
            } else if (age < 20) {
                throw new TooYoungerException("Too young for recruitment");
            } else {
                System.out.println("Eligible for recruitment");
            }
        } catch (TooOlderException | TooYoungerException e) {
            System.out.println(e.getMessage());
        }
    }
}
