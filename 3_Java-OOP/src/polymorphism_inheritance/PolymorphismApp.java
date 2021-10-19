package polymorphism_inheritance;

import polymorphism_inheritance.inheritance.Employee;
import polymorphism_inheritance.inheritance.Manager;
import polymorphism_inheritance.inheritance.VicePresident;

public class PolymorphismApp {
    public static void main(String[] args) {
        // Polymorphism I
        /**
         * Polymorphism -> Kemampuan object untuk berubah menjadi bentuk lain.
         * ex:
         * 1. Deklarasi awal variabel employee sebagai inheritance.Employee Class
         * 2. Kemudian kita re-assign ulang dengan instance dari child class (inheritance.Manager, inheritance.VicePresident)
         * 3. Setelah di re-assign, variable employee akan berubah bentuk sesuai dengan child class yg telah diinstansiasi
         */
        // Bentuk awal: inheritance.Employee class
        Employee employee = new Employee("Kiky", "Contract");
        employee.sayHello("Galih");
        System.out.println(employee.name);
        System.out.println(employee.status);

        // Bentuk kedua: berubah menjadi inheritance.Manager class
        employee = new Manager("Bimo");
        employee.sayHello("Diansyah");
        System.out.println(employee.name);
        System.out.println(employee.status); // result: null. Krn status tidak di instansiasi dari constructor tsb dan property status dapat diubah secara manual

        // ubah property status secara manual
        employee.status = "Permanent";
        System.out.println(employee.status); // result: "Permanent". Krn property status sudah diubah secara manual

        // Bentuk ketiga: berubah menjadi inheritance.VicePresident class
        employee = new VicePresident("Nugie");
        employee.sayHello("Abraham");
        employee.welcomeEmployee("Adi");
        // employee.promotion("Kiky"); // exception.error. Tidak bisa mengakses langsung method dari inheritance.VicePresident

        System.out.println(employee.name);
        employee.status = "Internship";
        System.out.println(employee.status);

        // Polymorphism II
        /**
         * Polymorphism tipe kedua: sebuah method yg berisi instansiasi dari sebuah class
         *
         * polymorphism tipe kedua bisa digunakan saat ingin melihat/mengakses perubahan bentuk dari parent
         * dan child class dari method yg telah dioverriding oleh child class-nya.
         */
        sayHello(new Employee("Kiky", "Permanent"));
        sayHello(new Manager("Bimo"));
        sayHello(new VicePresident("Nugie"));
    }

    // sayHello(className paramName)
    static void sayHello(Employee paramEmployee) {
        if(paramEmployee.status != null){
            System.out.println("Your status employee is " + paramEmployee.status);
        }

        // Pengecekan tipe data (Type check & casts) -> (variable_name instanceof dataType)
        if(paramEmployee instanceof VicePresident) {
            // membuat variable yang tipe datanya sama dengan paramEmployee
            VicePresident vicePresident = (VicePresident) paramEmployee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (paramEmployee instanceof Manager) {
            Manager manager = (Manager) paramEmployee;
            System.out.println("Hello inheritance.Manager " + manager.name);
        } else {
            System.out.println("Hello inheritance.Employee " + paramEmployee.name);
        }
    }
}
