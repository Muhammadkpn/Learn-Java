package abstraction.abstract_class;

public class Cat extends Animal {
    /**
     * Cat class wajib override method run(), krn dia merupakan abstract method.
     * Jika kita tidak ingin override method run(), kita harus mendefinisikan Cat class
     * sebagai abstract class juga
     */
    public void run() {
        System.out.println("Cat " + name + " is run");
    }
}
