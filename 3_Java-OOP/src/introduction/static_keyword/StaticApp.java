package introduction.static_keyword;

// static import
// cara 1 -> menggunakan keyword static. Tujuannya untuk memperpendek pemanggilan class

import static introduction.static_keyword.Application.PROCESSOR;
import static introduction.static_keyword.Constant.*;
import static introduction.static_keyword.Country.City;

// cara 2
//import introduction.static_keyword.Constant;
//import introduction.static_keyword.Country;
//import introduction.static_keyword.Application;

public class StaticApp {
    public static void main(String[] args) {

        // call a static field
        System.out.println(APPLICATION); // normal call -> Constant.APPLICATION
        System.out.println(VERSION); // normal call -> Constant.VERSION

        // call a static method
        changeVersion(3); // Change static field with static method
        System.out.println(VERSION);
        System.out.println(MathUtil.sum(1, 2, 3, 4, 5));

        // call a static inner class
        City city = new City();
        city.setName("Bogor");
        System.out.println(city.getName());

        // call a static block
        System.out.println(PROCESSOR);

    }
}
