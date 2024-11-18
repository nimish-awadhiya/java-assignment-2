class Parent {
    public static void display() {
        System.out.println("Parent class static method.");
    }
}

class Child extends Parent {
    public static void display() {
        System.out.println("Child class static method.");
    }

    public static void main(String[] args) {
        Parent.display();  // Outputs: Parent class static method.
        Child.display();   // Outputs: Child class static method.
    }
}
