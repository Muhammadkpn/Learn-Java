import data.Person;
import data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    /**
     * SortedSet
     * turunan dari Set, namun di SortedSet elemen yang dimasukkan ke dalam SortedSet akan otomatis diurutkan
     * - Jika element merupakan turunan dari interface Comparable, maka secara otomatis akan diurutkan berdasarkan
     * comparable tsb
     * - Jika element bukan turunan dari interface Comparable, maka kita bisa gunakan Comparator untuk memberi tahu
     * SortedSet cara mengurutkan element-elementnya.
     *  - Urutan = Iterable(I) -> Collection(I) -> Set(I) -> SortedSet(I) -> NavigableSet(I) -> TreeSet(C)
     */
    public static void main(String[] args) {
        // TreeSet -> implementation of SortedSet
        SortedSet<Person> people = new TreeSet<>(new PersonComparator()); // menambahkan comparator
        // SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Muhammad Kiky"));
        people.add(new Person("Gunadi"));
        people.add(new Person("Sadikin"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        // Convert to immutable SortedSet
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        // sortedSet.add(new Person("Kiky"));
    }
}
