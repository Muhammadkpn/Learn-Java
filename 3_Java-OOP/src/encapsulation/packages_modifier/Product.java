package encapsulation.packages_modifier;
// package software.developer.salah; // exception.error.

class Product {
    // proctected -> hanya bisa diakses di class yg sama atau diturunannya
    // private -> hanya bisa diakses di class yg sama
    public String name;
    protected String category;
    private int price;

    // Constructor Product dibuat public agar bisa diakses diseluruh tempat
    Product(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    Product () {
        this(null, null, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
