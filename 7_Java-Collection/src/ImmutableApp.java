import data.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    /**
     * Immutable List -> Data didalam list tidak bisa ditambah, dihapus, ataupun diedit.
     * Namun, kita harus ingat bahwa yg tidak bisa diubah adalah data List-nya bukan reference
     * objectnya.
     * Jadi, jika kita punya immutable List yg berisi data Person, field dari Person
     * masih bisa berubah. Tetapi, isi dari elemen immutable list tidak bisa diubah
     * Hal ini cocok ketika kita ingin sembarangan code bisa mengubah element di List
     */
    public static void main(String[] args) {
        // immutable list berisi 1 element
        List<String> one = Collections.singletonList("One");

        // immutable list kosong
        List<String> empty = Collections.emptyList();

        // mengubah mutable list jd immutable
        List<String> mutable = new ArrayList<>();
        mutable.add("satu");
        mutable.add("dua");
        List<String> immutable = Collections.unmodifiableList(mutable);
        // Sudah tidak bisa di modifikasi lagi karena list tsb immutable
        // immutable.add("tiga");
        // immutable.set(0, "lima");
        // immutable.remove(0);

        // Membuat immutable list dari element-element
        List<String> elements = List.of("Muhammad", "Kiky");

        // Mengubah data immutable list melalui reference Object-nya
        List<Person> immutablePerson = List.of(new Person("Muhammad"), new Person("Kiky"));
        System.out.println(immutablePerson.get(0).getName()); // result: Muhammad

        immutablePerson.get(0).setName("Tulus");
        System.out.println(immutablePerson.get(0).getName()); // result: Tulus

        Person person = new Person("Muhammad");
        person.addHobby("Coding");
        person.addHobby("Tidur");

        /*
            Jika getter hobby dari person adalah mutable list, maka kita bisa
            add data list tanpa melalui setter dari object Person.
            Untuk mencegah hal itu, kita bisa membuat getter hobby menjadi
            immutable list
         */
        doSomethingWithHobbies(person.getHobbies());

        System.out.println("================");
        for (String hobby : person.getHobbies()) {
            System.out.println(hobby);
        }


    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Makan");
    }
}
