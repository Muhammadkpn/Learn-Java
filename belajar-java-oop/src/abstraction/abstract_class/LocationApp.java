package abstraction.abstract_class;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); // Location can't instaniate becasuse location is an abstract class

        City city = new City();
        city.name = "Purwakarta";
        city.sayHello();
        city.sayHello2();

        System.out.println(city.name);
    }
}
