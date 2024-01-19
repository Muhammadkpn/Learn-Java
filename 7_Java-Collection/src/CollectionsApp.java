import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    /**
     * Collections Class
     * ● Collections adalah class yang berisikan utility static method untuk membantu kita menggunakan
     *  Java Collection
     * ● Di materi-materi sebelumnya kita sudah bahas beberapa, seperti membuat immutable collection
     *  misalnya
     * ● Namun sebenarnya masih ada banyak static method yang bisa kita gunakan di class Collections
     * ● https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Collections.html
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Muhammad", "Kiky", "PN"));
        System.out.println(names); // [Muhammad, Kiky, PN]

        Collections.reverse(names);
        System.out.println(names); // [PN, Kiky, Muhammad]

        Collections.shuffle(names);
        System.out.println(names); // [Kiky, Muhammad, PN]
    }
}
