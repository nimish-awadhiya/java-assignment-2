// Base class Animal
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class Mammal
class Mammal extends Animal {
    public void giveBirth() {
        System.out.println("Mammals give birth");
    }
}

// Further derived class Dog
class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();   // From Animal
        dog.giveBirth(); // From Mammal
        dog.bark();    // From Dog
    }
}
