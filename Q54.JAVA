class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CountryCapital {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new NoMatchFoundException("Country not found");
            }

            String country = args[0].toLowerCase();
            switch (country) {
                case "usa":
                    System.out.println("Capital: Washington, D.C.");
                    break;
                case "india":
                    System.out.println("Capital: New Delhi");
                    break;
                default:
                    throw new NoMatchFoundException("Capital not found for " + country);
            }
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
