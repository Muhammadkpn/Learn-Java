package abstraction.abstract_class;

import reflection.annotation.Fancy;

@Fancy(name = "AnimalApp", tags = {"reflection", "java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Kucing Oren";
        animal.run();
    }
}
