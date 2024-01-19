import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    /**
     * Map adalah struktur data collection yg berisikan mapping antara key dan value
     * - key harus unik dan tidak boleh duplikat.
     * - Map mirip dengan Array cuman bedanya key = index(integer), sedangkan Map, key bebas
     *  kita tentukan sendiri
     *
     *  Map (I) -> HashMap, WeakHashMap, IdentityHashMap, LinkedHashMap, & EnumHashMap (C)
     *
     *  HashMap
     *  - Implementasi map yg melakukan distribusi key dengan hashCode() function
     *  - HashMap sgt bergantung dengan hashCode, sehingga kita harus membuat hashCode seunik mungkin
     *    agar nilai hashCode tidak sama. Kalau banyak sama nanti pendistribusian key tidak optimal
     *    sehingga proses get data di Map akan semakin lambat
     *  - Pengecekan data duplikat di HashMap dengan menggunakan method equals.
     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Muhammad");
        map.put("name.middle", "prasetyo");
        map.put("name.middle", "Kiky"); // jika key sudah didefinisikan, maka valuenya akan di-update
        map.put("name.last", "PN");
        map.put("name.age", "");

        Map<String, String> ibody = new HashMap<>();

        String last = map.containsKey("name.age")? map.get("name.last") : "";
        System.out.println(last);
        System.out.println("Test: " + map.containsValue("PN"));

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue() == null || entry.getValue().equals("")) {
                ibody.put(entry.getKey(), "NULL");
            } else {
                ibody.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(ibody.get("name.ageaa"));
        for (Map.Entry<String, String> entry : ibody.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<String, Object> test = new HashMap<>();
        Map<String, Object> test2 = new HashMap<>();
        test2.put("test2", "testing");
        test.put("test2", test2);

        System.out.println(((Map) test.get("test")).containsKey("test2"));
        if (test.containsKey("test") && ((Map) test.get("test")).containsKey("test2")) {
            System.out.println("SUCCESS");
        }
    }
}
