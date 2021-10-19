package polymorphism_inheritance.inheritance.variable_hiding;

public class ParentApp {
    public static void main(String[] args) {
        /**
         * Field dengan nama yg sama di parent & child class -> Variable Hiding
         *      -- Field di parent & child tidak terikat
         * Method dengan nama yg sama di parent & child class -> Method Overriding
         *      -- Method di parent & child saling berhubungan
         */
        Child child = new Child();
        child.name = "Sandhika";
        child.doIt(); // result: Do it in child
        System.out.println(child.name); // result: Sandhika

        // Upcasting from child to parent class
        Parent parent = (Parent) child; // it's same with polymorphism_inheritance.inheritance.variable_hiding.Parent parent = new polymorphism_inheritance.inheritance.variable_hiding.Child();
        parent.name = "Galih";
        /**
         * class-nya polymorphism_inheritance.inheritance.variable_hiding.Parent, namun krn parent merupakan konversi dari child dan
         * doIt() merupakan  method overriding, maka method doIt() yg terpanggil oleh
         * di variable parent adalah method doIt dari class child
         */
        parent.doIt(); // result: Do it in child
        /**
         * property name di parent & child tidak terikat, maka saat dipanggil jg
         * hasilnya akan berbeda. Makanya, tidak disarankan memakai nama field yg
         * sama dengan parent class-nya
         */
        System.out.println(parent.name); // result: Galih

        Parent parent2 = new Parent();
        parent2.name = "Donny";
        parent2.age = 32;
        parent2.doIt();
        System.out.println("parent2.name: " + parent2.name + ", parent2.age: " + parent2.age);

        parent2 = new Child();
        parent2.name = "children";
        parent2.doIt();
        System.out.println("parent2.name: " + parent2.name + ", parent2.age: " + parent2.age);

        // Upcasting -> convert from child to parent
        Child c = new Child();
        c.name = "Halo";
        c.height = "212 cm";
        c.age = 13;
        System.out.println("name: " + c.name);
        System.out.println("height: " + c.height);
        System.out.println("age: " + c.age);
        c.doIt(); // result: Do it from child

        // DataType variable = ChildObject
        Parent p = c; // this is convert implicitly. convert explicitly -> polymorphism_inheritance.inheritance.variable_hiding.Parent p = (polymorphism_inheritance.inheritance.variable_hiding.Parent) c;
        p.age = 123;
        // p.height; // -> can't access all field in child. Can only access overriden method or inherited field
        System.out.println(p.name);
        System.out.println(p.age);
        p.doIt(); // result: Do it from child

        // Downcasting -> convert from parent to child
        Child c2 = (Child) p; // p is an instance of polymorphism_inheritance.inheritance.variable_hiding.Parent class.
        c2.height = "200cm";
        System.out.println(c2.age); // result: 123. Inherited from p.age
        System.out.println(c2.height);
        c2.doIt(); // result: Do it from child

        // downcasting from zero
        Parent p2 = new Parent();
        p2.age = 21;
        p2.doIt(); // result: Do it from parent

        // p2 di reassign ke child object dengan tipe datanya masih polymorphism_inheritance.inheritance.variable_hiding.Parent
        p2 = new Child();
        ((Child) p2).height = "213cm";
        p2.doIt(); // result: Do it from child
        System.out.println(((Child) p2).height); // result: 213cm
    }
}
