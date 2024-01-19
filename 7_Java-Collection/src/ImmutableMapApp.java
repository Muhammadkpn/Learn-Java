import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    /**
     * - Sama seperti List dan Set, Map pun punya tipe data Immutable
     * - Collections.emptyMap() -> Membuat immutable map kosong
     * - Collections.unmodifiableMap(map) -> Mengubah mutable map menjadi immutable
     * - Collections.singletonMap(key, value) -> Membuat map dengan satu jumlah key-value
     * - Map.of(...) -> Membuat immutable map dari key-value
     */
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        System.out.println(empty);

        Map<String, String> singleton = Collections.singletonMap("name", "Eko");
        // singleton.put("age", "24"); // Error, krn Map tsb bersifat immutable
        System.out.println(singleton);

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Eko"); // Data di map masih bisa ditambah, krn map masih bersifat mutable
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
        // immutable.put("age", "24"); // map tidak bisa ditambah krn map sudah menjadi immutable
        System.out.println(immutable);

        Map<String, String> map = Map.of(
                "first", "Eko",
                "middle", "Kurniawan",
                "last", "Khannedy"
        ); // immutable list from several element
        // map.put("a", "A"); // error -> map tsb bersifat immutable
        System.out.println(map);

    }
}
