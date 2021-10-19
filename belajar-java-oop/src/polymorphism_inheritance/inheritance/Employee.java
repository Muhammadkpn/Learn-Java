package polymorphism_inheritance.inheritance;

public class Employee {
    public String name;
    public String status;

    public Employee(String name, String status){
        this.name = name;
        this.status = status;
    }
    Employee(String name){
        this.name = name;
    }

    public void welcomeEmployee(String name) {
        System.out.println("Hello " + name.toString() + " Welcome to my company"); // otomatis memanggil method toString() yg merupakan method dari String class
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is inheritance.Employee " + this.name);
    }
}
