import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        // Apply polymorphism -> berubah bentuk dari Iterable menjadi List
        Iterable<String> names = List.of("Muhammad", "Kiky", "PN"); //

        // Iterable
        // for-each bisa dilakukan krn ada method iterator() di interface Iterable.
        // Iterator = interface yg mendefinisikan cara mengakses element di collection secara sequential
        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("=====Manual ITERATOR=====");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
