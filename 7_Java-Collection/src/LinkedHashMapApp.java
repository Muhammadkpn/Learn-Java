import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    /**
     * LinkedHashMap
     * - Implementasi Map dengan menggunakan double linked list
     * - Data di LinkedHashMap akan lebih terprediksi karena datanya akan disimpan berurutan dalam
     * linked list sesuai urutan kita menyimpan data
     * - Namun perlu diperhatikan, proses get data di LinkedHashMap akan semakin lambat karena harus
     * melakukan iterasi data linked list terlebih dahulu
     * - Gunakan LinkedHashMap jika memang kita lebih mementingkan iterasi data Map nya
     */
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Muhammad");
        map.put("last", "Kiky");
        map.put("middle", "PN");

        // Get key of map
        Set<String> keys = map.keySet();
        for (var key : keys) {
            System.out.println(key); // Data akan di print berurutan
        }
    }
}
