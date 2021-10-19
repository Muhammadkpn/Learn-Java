package reflection.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Target -> Memberitahu reflection.annotation bisa digunakan dimana aja.
// TYPE bisa digunakan di Class, interface (including reflection.annotation interface), enum, or record declaration
@Target({ElementType.TYPE})
// Retention -> Memberitahu reflection.annotation apakah bisa digunakan di hasil kompilasi & bisa dibaca oleh reflection?
// RUNTIME -> Annotations are to be recorded in the class file by the compiler and retained by the VM at run time, so they may be read reflectively.
@Retention(RetentionPolicy.RUNTIME)

// Apply in class -> AnimalApp.java
// Apply in interface -> Car
// Apply in method -> Level.java

// Annotation untuk menambahkan informasi berupa metadata dan tidak semua orang butuh reflection.annotation

/**
 * predefined reflection.annotation
 *
 * - @Override -> tanda override ke method parent class
 * - @Depracted -> untuk menandai method tersebut sudah deprecated
 * - @FunctionalInterface -> menandai bahwa class tersebut bisa dibuat sebagai lambda expression
 */
public @interface Fancy {
    // Saat pakai Fancy harus memasukkan attribute name
    String name();
    String[] tags() default {};
}
