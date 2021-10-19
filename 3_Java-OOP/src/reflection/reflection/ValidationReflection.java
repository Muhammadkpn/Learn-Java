package reflection.reflection;

import exception.runtime_exception.BlankException;
import reflection.annotation.NotBlank;

import java.lang.reflect.Field;

public class ValidationReflection {
    // Kelas apapun bisa dipake oleh method ini
    public static void validationReflection(Object object){
        // Reflection: untuk melihat struktur aplikasi kita pada saat berjalan
        // getClass() salah satu method reflection yg berguna untuk mengakses reflection class dari sebuah object
        Class aClass = object.getClass();
        // Untuk mendapatkan semua field yg ada di reflection
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            // Untuk meminta paksa akses dari variable yg private
            field.setAccessible(true);
            if(field.getAnnotation(NotBlank.class) != null) {
                // Buat try catch agar tidak perlu melakukan try catch lagi diluar method
                try {
                    // validated
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
                        // pakai BlankException biar ga wajib trycatch
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}
