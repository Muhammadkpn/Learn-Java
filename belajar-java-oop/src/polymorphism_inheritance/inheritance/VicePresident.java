package polymorphism_inheritance.inheritance;

public class VicePresident extends Manager {
    String role;
    String domisili;

    VicePresident(String role, String name, String city, String province) {
        /**
         * Super digunakan untuk mengakses constructor yg ada pada parent class. Dengan super kita tidak
         * perlu menginisialisasikan lagi property atau method ke dalam child constructor, karena hal itu
         * sudah dilakukan di parent constructor
         *
         * Jika kita ingin membuat constructor di child class, kita harus mendeklarasikan super agar kita
         * bisa mengakses parent constructor.
         *
         * Jika parent class mempunyai default constructor, maka kita tidak perlu untuk mendeklarasikan super
         * ke dalam child constructor
         */

        super(name, city, province);
        this.role = role;
        this.domisili = city + ", " + province + ", " + country;
    }

    public VicePresident(String name) {
        super(name);
    }

    VicePresident() {

    }
    /**
     * Method overriding: Mendefinisikan ulang method parent ke class child-nya
     * Jika method parent sudah di overriding, maka method tsb tidak bisa diakses lg secara langsung
     */
    public void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is VP " + this.name);
    }

    void promotion(String name) {
        System.out.println("Congrats " + name + " on your new role!");
    }
}
