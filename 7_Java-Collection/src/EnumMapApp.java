import java.util.EnumMap;
import java.util.Map;

public class EnumMapApp {
    /**
     * EnumMap
     * - EnumMap adalah implementasi Map dimana key nya adalah enum
     * - Karena data enum sudah pasti unik, oleh karena itu cocok dijadikan key di Map
     * - Algoritma pendistribusian key dioptimalkan untuk enum, sehingga lebih optimal dibandingkan
     * menggunakan hashCode() method
     */
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {

        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "Muhammad Kiky");
        map.put(Level.FREE, "Muhammad Kiky PN"); // Jika key duplikat, maka sebelumnya akan di replace
        map.put(Level.VIP, "Nurdin");


        System.out.println(map);
        for (var key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
