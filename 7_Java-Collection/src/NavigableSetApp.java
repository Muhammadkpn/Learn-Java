import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {

    /**
     * NavigableSet -> Turunan dari SortedSet
     * - Menambah method untuk melakukan navigasi pencarian element, seperti mencari elemen yg
     * lebih besar dari, kurang dari, membalikkan urutan set, dll.
     */
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Muhammad", "Kiky", "Software Engineer"));

        NavigableSet<String> namesReverse = names.descendingSet(); // Urutkan by descending

        for (var name : namesReverse) {
            System.out.println(name);
        }

        /*
        Returns a view of the portion of this set whose elements are greater than or equal *if inclusive = true
        .tailSet(E toElement, boolean inclusive) -> toElement akan dibandingkan dengan setiap element di NavigableSet
         */
        NavigableSet<String> kiky = namesReverse.tailSet("Muhammad Kiky", true); // Split of NavigableSet
        System.out.println(kiky);

        // Returns a view of the portion of this set whose elements are less than or equal *if inclusive = true
        NavigableSet<String> muhammad = names.headSet("aadm", true);
        System.out.println(muhammad);

        // Immutable NavigableSet
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names); // mengubah mutable navigable set menjadi immutable
        NavigableSet<String> emptyNavSet = Collections.emptyNavigableSet(); // immutable navigable set kosong

    }
}
