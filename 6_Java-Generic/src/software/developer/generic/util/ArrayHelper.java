package software.developer.generic.util;

public class ArrayHelper {
    // Generic method -> Deklarasi parameter type di method tsb & hanya bisa diakses di method tsb
    public static <T> int count (T[] array) {
        return array.length;
    }
}
