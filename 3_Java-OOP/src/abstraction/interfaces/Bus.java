package abstraction.interfaces;

public class Bus implements Car {
    public void drive() {
        System.out.println("Bus drive");
    }

    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "Hino";
    }

    public boolean isMaintenance() {
        return false;
    }

    // concrete method -> tidak wajib dioverride
    public boolean isBig() {
        return true;
    }
}
