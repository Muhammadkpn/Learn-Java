package polymorphism_inheritance.inheritance.variable_hiding;

/**
 * Variable Hiding *
 * Field name di child independen dan tidak terikat dengan field name di parent class
**/

class Parent {
    String name;
    int age;

    void doIt () {
        System.out.println("Do it from parent");
    }
    void doItNow () {
        System.out.println("Do it from parent right now");
    }
}

class Child extends Parent {
    String name;
    String height;

    void doIt () {
        System.out.println("Do it from child");
        System.out.println("Parent (" + super.name + ") vs Child (" + this.name + ")");
    }

    void doInChild() {
        System.out.println("Only do it the method in CHILD");
    }
}
