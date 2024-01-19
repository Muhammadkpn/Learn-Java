import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    /**
     * Sorting
     * - Sorting atau pengurutan adalah algoritma yg sudah biasa kita lakukan
     * - Di java collection jg sudah disediakan cara untuk melakukan pengurutan, jadi kita
     * tidak perlu melakukan pengurutan secara manual
     * - Namun, perlu diingat yg bisa di sort hanyalah List. Karena Set, Queue, Deque, dan Map
     * kerjanya sudah khusus jadi pengurutan hanya bisa dilakukan di List
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Eko", "Kurniawan", "Khannedy", "Programmer", "Zaman", "Now"));

        Collections.sort(list);

        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        // Menggunakan method dari Collections. Collections.sort(list, comparator);
        Collections.sort(list, reverse);

        for (var value : list) {
            System.out.println(value);
        }
    }
}
