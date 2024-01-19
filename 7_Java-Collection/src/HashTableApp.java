import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    /**
     * HashTable
     * - HashTable adalah implementasi dari Map yg mirip dengan HashMap
     * - Sama seperti Vector, semua method di HashTable memiliki kata kunci synchronized,
     * sehingga performanya lebih lambat dibandingkan HashMap
     * - Dan karena di versi Java baru sudah ada juga ConcurrentHashMap, sehingga penggunaan
     * HashTable sudah jarang sekali ditemui
     */
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("Eko", "Eko");
        map.put("Budi", "Budi");
        map.put("Joko", "Joko");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
