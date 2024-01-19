import data.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    /**
     * List interface -> struktur data collection (bisa diduplikat, data berurutan, memiliki index)
     * Urutan: Iterable(I) -> Collection(I) -> List(I) -> ArrayList(C) & LinkedList(C)
     *
     * Implementasi list
     * ArrayList Class:
     * - Default size = 10
     * - Jika kapasitasnya penuh, maka akan dibuat array baru dengan ukuran lama + data baru
     * - Lambat jika add data saat sudah penuh & lambat saat remove krn harus geser data dibelakang data yg dihapus
     * - Add -> cepat jika kapasitas array masih cukup
     * - get & set-> cepat krn tinggal gunakan index array
     * LinkedList:
     * - Implementasi List dengan struktur data Double Linked List
     * - Berbentuk sebuah node yang ada notasi next & prev
     * - Add -> Cepat karena hanya menambah node diakhir
     * - get & set -> lambat krn harus diperiksa dari node awal sampai ketemu indexnya
     */
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(30); // default size = 10
        // List<String> string2 = new LinkedList<>(); // Bisa pake LinkedList juga, tergantung kebutuhan
        strings.add("Muhammad");
        strings.add("Kiky");
        strings.add("PN");

        strings.set(0, "Hainan"); // ganti index ke-1 menjadi Hainan

        strings.remove(1); // remove index ke-1
        System.out.println(strings.get(1)); // get data index ke-1

        for (var value : strings) {
            System.out.println(value);
        }

//        Iterator itr = strings.iterator();
//        while(itr.hasNext()) {
//
//        }

        // Array List dengan Type Parameternya adalah Person Class
        List<Person> people = new ArrayList<>();
        people.add(new Person("Tampubolon"));

        List<Person> people1 = new ArrayList<>();
        people1.add(new Person("Simatupang1"));
        people1.add(new Person("Simatupang2"));
        people.addAll(people1);

        List<Person> people2 = new ArrayList<>();
        people2.add(new Person("Situmorang1"));
        people2.add(new Person("Situmorang2"));
        people.addAll(people2);

        for (var person : people) {
            System.out.println(person.getName());
        }
//        people.clear();
//        System.out.println(people);

        int ctr = 0;
        int count = 0;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName() == "Simatupang") {
                people.remove(i);
            }
        }
        for (int i = 0; i < people.size(); i++) {
            ctr++;
            count = i;
            if (people.get(i).getName() == "Simatupang") {
                people.remove(i);
            }
        }
        System.out.println("ctr vs count : " + ctr + " vs " + count);
    }
}
