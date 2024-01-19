import data.Person;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    /**
     * Set -> collection yg berisikan elemen yg unik atau tidak duplikat
     * - Set tidak punya index jd tidak ada jaminan data akan terurut
     * - Set tidak memiliki method baru, hanya ada method dari parentnya (collection/iterable)
     * - Tidak memiliki index, jd untuk mengambil data di Set harus iterasi satu per satu
     * - Urutan parent = Iterable -> Collection -> Set -> EnumSet & (HashSet <- LinkedHashSet)
     *
     *
     */
    public static void main(String[] args) {
        // Set<String> names = new HashSet<>(); // Tidak sesuai urutan
        Set<String> names = new LinkedHashSet<>(); // Sesuai urutan krn dijaga dengan menggunakkan double linked list

        names.add("Muhammad");
        names.add("Kiky");
        names.add("PN");
        names.add("Kiky");
        names.add("PN");

        for (var name : names) {
            System.out.println(name);
        }

        // Set dengan Type Parameternya adalah Person Class
        Set<Person> person = new LinkedHashSet<>();
        person.add(new Person("Depok"));
        person.add(new Person("Cirebon"));
        person.add(new Person("Bogor"));

        for (var item : person) {
            System.out.println(item.getName());
        }
    }
}
