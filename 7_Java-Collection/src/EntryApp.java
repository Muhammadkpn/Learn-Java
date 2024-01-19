import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    /**
     * Entry Interface
     * - Saat kiya menyimpan data di Map, data disimpan dalam pair (Key-value)
     * - Di java collection, implementasi Pair di Map bernama Entry
     * - Entry adalah interface sederhana yg berisikan method untnuk mengambil key dan value
     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Muhammad", "Muhammad Value");
        map.put("Kiky", "Kiky Value");
        map.put("PN", "PN Value");

        // Get key-value of HashMap
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
