package abstraction.interfaces;

public class CarApp {
    public static void main(String[] args) {
        // Harus melalui proses polymorphism, tidak bisa di instansiasi secara lgsg
        // krn Car merupakan interface. Mirip seperti abstract class
        Car car = new Avanza();
        System.out.println(car.country);
        System.out.println(car.getTier());
        car.drive();
    }
}
