// Base class Num
class Num {
    int number;

    public Num(int number) {
        this.number = number;
    }

    public void shownum() {
        System.out.println("Number: " + number);
    }
}

// Derived class HexNum
class HexNum extends Num {

    public HexNum(int number) {
        super(number);
    }

    @Override
    public void shownum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

public class Main {
    public static void main(String[] args) {
        Num num = new Num(255);
        num.shownum();

        HexNum hexNum = new HexNum(255);
        hexNum.shownum();
    }
}
