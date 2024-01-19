import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        // membuat immutable set kosong
        Set<String> empty = Collections.emptySet();

        // membuat immutable set berisi 1 element
        Set<String> one = Collections.singleton("Kiky");

        // mengubah mutable jd immutable
        Set<String> mutable = new HashSet<>();
        mutable.add("Muhammad");
        mutable.add("Kiky");

        Set<String> immutable = Collections.unmodifiableSet(mutable);
        immutable.add("Halo"); // error

        // membuat immutable set dari element-element
        // Set<String> set = Set.of("Muhammadkpn", "Immutable", "Immutable");
        Set<String> set = Set.of("Muhammadkpn", "Immutable");
        set.add("prasnurdin"); // error
        set.remove("prasnurdin"); // error
    }
}
