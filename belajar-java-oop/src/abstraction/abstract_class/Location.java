package abstraction.abstract_class;

// abstract class -> class tidak bisa diakses secara lgsg. Hrus melalui child-nya.
public abstract class Location {
    public String name;

    public void sayHello() {
        System.out.println("sayHello without abstract method");
    }
    public abstract void sayHello2();
}
