public class StaticDemo {
    static int staticVariable = 0;

    static {
        System.out.println("This is executed when the class is loaded.");
        staticVariable = 10;
    }

    public static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static variable inside staticMethod: " + staticVariable);
    }


    public static void main(String[] args) {
        // Accessing static variables and methods directly
        System.out.println("Accessing staticVariable directly: " + staticVariable);
        staticMethod();

    }
}

