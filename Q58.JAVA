class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}

public class UserValidation {
    public static void main(String[] args) {
        try {
            String username = args[0];
            String password = args[1];

            if (username.length() < 6) {
                throw new InvalidUserException("Username must be at least 6 characters");
            }

            if (!password.equals("password123")) {
                throw new InvalidUserException("Invalid password");
            }

            System.out.println("Login successful");

        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }
    }
}
