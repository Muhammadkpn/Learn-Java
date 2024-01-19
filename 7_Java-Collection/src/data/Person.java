package data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public List<String> getHobbies() {
        // protect to avoid mutable data and change data without authorization
        // convert to immutable list
//        return Collections.unmodifiableList(hobbies);

        return hobbies;
    }

    public void setHobby(Integer index, String hobby) {
        hobbies.set(index, hobby);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
