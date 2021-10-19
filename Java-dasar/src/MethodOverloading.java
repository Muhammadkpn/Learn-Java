public class MethodOverloading {
    public static void main(String[] args) {

        // method tanpa parameter
        sayHello();
        // method dengan satu parameter
        sayHello("Kiky");
        // method dengan dua parameter
        sayHello("Muhammad", "Kiky");
    }

    // MethodOverLoading adalah membuat method dengan nama yg sama. Namun, dengan parameter yg berbeda.
    // Kalau parameter sama akan terdeteksi error
    static void sayHello () {
        System.out.println("Hello");
    }

    static void sayHello (String name) {
        System.out.println("Hello " + name);
    }

    static void sayHello (String firstName, String lastName) {
        System.out.println("Hello " + firstName + lastName);
    }
}
