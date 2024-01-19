import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
    /**
     * WeakHashMap
     * - WeakHashMap adalah implementasi Map sama seperti HashMap
     * - WeakHashMap menggunakan weak key, dimana jika tidak digunakan lagi maka secara otomatis
     * data di WeakHashMap akan dihapus
     * - Jika terjadi garbagae collection, bisa dimungkinkan data di WeakHashMap akan dihapus
     * - WeakHashMap cocok digunakan untuk menyimpan data cache di memory secara sementara
     */
    public static void main(String[] args) {
        Map<Integer, Integer> map = new WeakHashMap<>();

        for (int i = 0; i < 1_000_000; i++) {
            map.put(i, i);
        }

        System.gc();

        System.out.println(map.size());
    }
}
