package abstraction.interfaces;

import reflection.annotation.Fancy;

/**
 * Interface as a contract
 * A contract in a Java class is similar to a contract in the real world - In non-technical terms:
 *
 * It's an agreement that the class will expose certain methods, certain properties, and certain behaviors.
 */
//
@Fancy(name = "Car", tags = {"Application", "Java"})
public interface Car extends HasBrand, IsMaintenance {
    /**
     * seluruh method di interface otomatis jd abstract method, sehingga saat deklarasi
     * kita tidak perlu menggunakan keyword "public abstract"
     */
    void drive();

    int getTier();

    // default method or concrete method -> Class turunannya tidak wajib override
    default boolean isBig() {
        return false;
    }
}
