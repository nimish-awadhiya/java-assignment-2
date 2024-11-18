// Interface 1
interface Interface1 {
    void method1();
    void method2();
}

// Interface 2
interface Interface2 {
    void method3();
    void method4();
}

// Interface 3
interface Interface3 {
    void method5();
    void method6();
}

// Combined interface extending the 3 interfaces
interface NewInterface extends Interface1, Interface2, Interface3 {
    void method7();
}

// Concrete class implementing the new interface
class MyClass implements NewInterface {
    public void method1() {
        System.out.println("Method1 from Interface1");
    }

    public void method2() {
        System.out.println("Method2 from Interface1");
    }

    public void method3() {
        System.out.println("Method3 from Interface2");
    }

    public void method4() {
        System.out.println("Method4 from Interface2");
    }

    public void method5() {
        System.out.println("Method5 from Interface3");
    }

    public void method6() {
        System.out.println("Method6 from Interface3");
    }

    public void method7() {
        System.out.println("Method7 from NewInterface");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.method7();
    }
}
