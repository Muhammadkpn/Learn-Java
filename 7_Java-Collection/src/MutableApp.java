import data.Person;

import java.util.List;

public class MutableApp {
    /**
     * Mutable -> Bisa diubah
     * Person Class bersifat mutable.
     * - Namun, method getHobbies me-return Immutable List.sehingga, jika kita ingin menggunakan
     *   method tsb, maka method tsb tidak bisa diubah
     * - Jika ingin mengubah field data List dari Person bisa melalui method person yg mengubah List melalui
     *   field data tersebut, yaitu method setHobby
     */
    public static void main(String[] args) {
        Person person = new Person("Kiky");

        person.addHobby("Sleeping");
        person.addHobby("Traveling");

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }

        person.setHobby(0, "Hiking");
        System.out.println(person.getHobbies());

        doSomethingWithHobbies(person.getHobbies());
    }

    public static void doSomethingWithHobbies (List<String> hobbies) {
        // ERROR -> parameter hobbies akan error jika diberikan argument immutableList
        // hobbies.add("Bukan Hobby");

        System.out.println(hobbies);
    }
}
