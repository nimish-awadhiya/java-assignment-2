class Counter {
    static int count = 0; // static variable to keep track of count

    public Counter() {
        count++; // Increment static count for each object created
    }

    public static void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        Counter.displayCount(); // Displays: Count: 2
    }
}
