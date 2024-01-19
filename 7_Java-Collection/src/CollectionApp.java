import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    /**
     * Collection merupakan child dari Iterable interface dan parent dari semua java collection.
     * Collection -> Kontrak untuk manipulasi data (menambah, menghapus, dan mengecek isi data)
     * - Iterable digunakan untuk kontrak meng-iterasi data secara sequential
     * - Tidak ada direct implementation dari Collection, krn Collection terbagi lagi menjadi 3 (List, Set, dan Queue)
     */
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Muhammad");
        collection.add("Kiky PN");
        collection.addAll(List.of("is", "a", "Software Engineer")); // tambah data sekaligus

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE LIST");
        collection.remove("Software Engineer"); // Data yg ingin dihapus case sensitive krn pake equals
        collection.removeAll(List.of("is", "a")); // Remove element in the list at once

        System.out.println(collection); // result: [Muhammad, Kiky PN]

        System.out.println(collection.contains("Muhammad")); // check collection contains a speficic element
        System.out.println(collection.containsAll(List.of("Muhammad", "Kiky PN"))); // check collection contains several element at once
        System.out.println(collection.size()); // size of collection
    }
}
