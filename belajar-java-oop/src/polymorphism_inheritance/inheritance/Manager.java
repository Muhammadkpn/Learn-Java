package polymorphism_inheritance.inheritance;

public class Manager extends Employee {
    String city;
    String province;
    final String country = "Indonesia";

    public Manager(String name) {
        super(name);
    }

    Manager(String name, String city, String province){
        super(name);
        this.city = city;
        this.province = province;
    }

    // Default Constructor: constructor tanpa parameter
    public Manager() {
        super(null);
    }
    public void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is inheritance.Manager " + this.name);
    }

    public void callManager() {
        System.out.println("Hello, My manager!");
    }
}
