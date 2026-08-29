public class MethodOverloading {
    static void main() {
        sayHello();
        sayHello("Dhandy");
        sayHello("Dhandy", "Putra Fahruddin");
    }

    // Tanpa Parameter
    static void sayHello() {
        System.out.println("Hello World");
    }

    // Dengan 1 Parameter
    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    // Dengan 2 Parameter
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
