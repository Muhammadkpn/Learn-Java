package encapsulation.packages_modifier;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Macbook Air"; // public -> bebas akses dimana saja
        product.category = "Laptop"; // protected -> bisa diakses asal di package yg sama
        // product.price = 22_100_000; // exception.error: can't access. Field type: private -> hanya bisa akses di class yg sama
        product.setPrice(22_100_000); // private field bisa diubah melalui setter

        System.out.println(product.name); // result: Macbook Air. Field type: public -> Selalu accessible
        System.out.println(product.category); // result: Laptop. Field type: protected -> Masih accessible krn berada di package yg sama
        // System.out.println(product.price); // // exception.error: can't access. Field type: private -> hanya bisa akses di class yg sama
        System.out.println(product.getPrice()); // result: 22_100_000. private field bisa diambil melalui getter

        Product product2 = new Product("Macbook Air", "Laptop", 22_100_000);

        System.out.println(product2.name); // result: Macbook Air. Field type: public -> Selalu accessible
        System.out.println(product2.category); // result: Laptop. Field type: protected -> Masih accessible krn berada di package yg sama
        // System.out.println(product2.price); // // exception.error: can't access. Field type: private -> hanya bisa akses di class yg sama
    }
}
