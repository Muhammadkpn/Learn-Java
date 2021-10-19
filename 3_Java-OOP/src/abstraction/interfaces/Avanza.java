package abstraction.interfaces;

/**
 * Implementasi multiinterface dalam satu class
 * "public class Avanza implements Car, IsMaintenance"
 */
public class Avanza implements Car {
    // Semua method di parent Class wajib dideklarasikan supaya tidak menimbulkan exception.error
    // @Override
    public void drive() {
        System.out.println("Avanza drive");
    }

    // @Override
    public int getTier() {
        return 4;
    }

    // method getBrand() merupakan method dari interface HasBrand yg merupakan parent
    // dari interface Car. Method dari parent interface jg wajib dideklarasikan saat
    // implementasi interface di class Avanza
    // @Override
    public String getBrand() {
        return "Toyota";
    }

    // method isMaintenance() dari interface IsMaintenance dan jg wajib dideklarasikan
    // @Override
    public boolean isMaintenance() {
        return false;
    }
}
