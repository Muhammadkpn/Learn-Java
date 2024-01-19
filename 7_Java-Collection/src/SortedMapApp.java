import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    /**
     * - SortedMap adalah implementasi Map dengan data key diurutkan sesuai dengan Comparable
     * key atau bisa menggunakan Comparator
     * - SortedMap cocok untuk kasus yg posisi key pada Map harus berurut
     * - Map (I) -> SortedMap (I) -> TreeMap (C)
     */
    public static void main(String[] args) {
        // Comparator untuk mengurutkan Map
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // descending order
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator); // add comparator when instantiate the object

        sortedMap.put("Eko", "Setiawan");
        sortedMap.put("Joko", "Karnavian");
        sortedMap.put("Budi", "Wijaya");

        // keySet() -> return Set key of map, values() -> return Set value of map, entrySet() -> return pair of key & value of map
        for (var key : sortedMap.entrySet()) {
            System.out.println(key);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap(); // create immutable sortedMap kosong
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap); // convert mutable to immutable

        // immutable.put("Nugraha", "Nugraha"); // error
    }
}
