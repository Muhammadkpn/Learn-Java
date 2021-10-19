package abstraction.abstract_class;

public abstract class Animal {
    public String name;

    // Saat kita mempunya abstract method, maka semua turunannya wajib membuat override method tsb
    // Access modifier dari abstract method tidak boleh private! //
    public abstract void run();
}
