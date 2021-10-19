package introduction;

public class PersonApp {
    public static void main(String[] args) {
        // Cara menginstansiasi object dari sebuah class
        // Constructor tipe pertama (2 parameter)
        Person person1 = new Person("Muhammad Kiky", "Puri Citayam Permai");
        // Constructor tipe kedua (1 parameter)
        var person2 = new Person("David Gadgetin");
        // Constructor tipe ketiga (tanpa parameter)
        Person person3;
        person3 = new Person();
        person3.name = "Iqbal";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person2.name);
        System.out.println(person3.name);

        // cara menambahkan field/properties
        Person person = new Person("Muhammad Kiky");
        person.address = "Puri Citayam Permai";
        person.age = 24;
        // person.city = "Bogor"; // Error, karena city merupakan field constant

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.city);

        // mengubah properties
        person.address = "Pondok Indah Kapuk";
        System.out.println(person.address);

        // call a method
        Person person4 = new Person("");
        person4.sayHelloAge("Budi"); // result: Hello Budi, I'm null years old. Karena properties belum diinisialisasikan
        person.sayHelloAge("Steven");

        person.sayHello("Azzaam");
    }
}
