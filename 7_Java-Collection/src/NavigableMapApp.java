import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    /**
     * NavigableMap
     * - NavigableMap adalah turunan dari SortedMap
     * - Namun NagivableMap memiliki kemampuan navigasi berdasarkan operasi kurang dari, lebih dari
     * dan sejenisnya
     * - Misal, kita ingin mengambil data yang lebih dari key x atau kurang dari key y, ini bisa dilakukan di
     * NavigableMap
     * - Map (I) -> SortedMap (I) -> NavigableMap (I) -> TreeMap (C)
     */
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Muhammad", "Muhammad");
        map.put("Kiky", "Kiky");
        map.put("PN", "PN");
        System.out.println(map.lowerKey("Kiky")); // Urutan key yg kurang dari Kiky
        System.out.println(map.higherKey("Kiky"));

        NavigableMap<String, String> mapDesc = map.descendingMap(); // method dari navigableMap
        for (var key : mapDesc.keySet()){
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap(); // create empty immutable navMap
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        // immutable.put("Eko", "Eko"); error
    }
}
