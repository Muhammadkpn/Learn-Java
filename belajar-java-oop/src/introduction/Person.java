package introduction;

class Person {
        String name;
        String address;
        Integer age;
        final String city = "Bogor";

        // Constructor
        Person(String name, String paramAddress) {
                this.name = name; // keyword this membantu untuk menghindari variable shadowing
                address = paramAddress; // memberikan nama parameter yg berbeda dengan var global bisa menghindari variable shadowing
        }

        // Constructor Overloading
        Person(String paramName) {
                // name = paramName; // cara manual
                this(paramName, null); // Memanggil constructor lain agar baris kode tidak boros
        }

        // Constructor Overloading
        Person(){
                this(null); // memanggil constructor yang kedua -> consturctor kedua manggil yg pertama
        }

        // Variable Shadowing
        /**
         * Variable shadowing adalah kejadian ketika mendefinisikan variable local yang namanya sama dengan variable
         * global, sehingga ketika ingin mengakses variable tsb di scope local. Varible local tsb akan menutupi variable
         * global yg telah didefinisikan di scope luarnya.
         *
         * Parameter di constructor introduction.Person sama dengan nama field yang telah dideklarasikan diawal. Oleh karena itu,
         * assignment untuk inisialisasi sebuah properties di dalam method introduction.Person akan merujuk ke parameter di constructor
         * introduction.Person. Bukan ke field yg sudah didefinisikan diatas.
         introduction.Person (String name, String address) {
                 name = name;
                 address = address;
         }
         */

        // Method
        void sayHello (String name) {
                // resolve variable shadowing dengan this.name agar merujuk ke field dari object bukan merujuk ke parameter dari method
                System.out.println("Hello " + name + ", My name is " + this.name);
        }

        void sayHelloAge (String name) {
                System.out.println("Hello " + name + ", I'm " + this.age + " years old");
        }
}
