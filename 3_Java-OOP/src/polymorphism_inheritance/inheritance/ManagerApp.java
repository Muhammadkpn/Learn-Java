package polymorphism_inheritance.inheritance;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Kiky");
        manager.sayHello("Ghina");

        var vp = new VicePresident("IT", "Kiky", "Bandung", "Jawa Barat");
        vp.sayHello("Azzam");
        System.out.println(vp.name);
        System.out.println(vp.role);
        System.out.println(vp.domisili);
        // toString(), equals(), hashCode(), getClass() -> built-in method from object class
        // Semua method yg ada di class object bisa kita akses di class yg telah dibuat
        System.out.println("toString(): " + vp.toString());
        System.out.println("without toString(): " + vp);
    }
}
