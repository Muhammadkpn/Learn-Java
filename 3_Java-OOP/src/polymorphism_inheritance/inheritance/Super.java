package polymorphism_inheritance.inheritance;

class Shape {
    public String name;
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    // Super can be used to invoke field parent
    String name = super.name;
    // Method overriding from parent
    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        // Akses method parent yg sudah di overriding dengan menggunakan keyword super
        return super.getCorner();
    }
}