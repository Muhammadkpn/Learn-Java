import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    /**
     * IdentittyHashMap
     * - IdentittyHashMap adalah implementasi Map sama seperti HashMap
     * - Yang membedakan adalah cara pengecekan kesamaan datanya, tidak menggunakan function
     * equals, melainkan menggunakan operator == (reference equality)
     * - Artinya data dianggap sama, jika memang lokasi di memory tersebut sama
     */
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        boolean result1 = key1.equals(key2);
        boolean result2 = key1 == key2;

        System.out.println("key1.equals(key2) ? " + result1);
        System.out.println("key1 == key2 ? " + result2);

        map.put(key1, "Kiky");
        map.put(key2, "Kiky");

        System.out.println(map);
        System.out.println(map.size());


    }
}
