class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

public class TemperatureCheck {
    public static void main(String[] args) {
        try {
            double temperature = Double.parseDouble(args[0]);

            if (temperature > 35) {
                throw new TooHotException("Temperature is too hot");
            } else if (temperature < 5) {
                throw new TooColdException("Temperature is too cold");
            } else {
                System.out.println("Temperature is normal. In Fahrenheit: " + (temperature * 9/5 + 32));
            }
        } catch (TooHotException | TooColdException e) {
            System.out.println(e.getMessage());
        }
    }
}
