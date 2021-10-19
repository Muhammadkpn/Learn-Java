package method_object;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Macbook Air";
        product.category = "Laptop";
        product.price = 22_100_000;

        System.out.println(product.name); // result: Macbook Air. Field type: public -> Selalu accessible
        System.out.println(product.category); // result: Laptop. Field type: protected -> Masih accessible krn berada di package yg sama
        // System.out.println(product.price); // // exception.error: can't access. Field type: private -> hanya bisa akses di class yg sama

        System.out.println(product);

        Product product2 = new Product();
        product2.name = "Macbook Air";
        product2.category = "Laptop";
        product2.price = 22_100_000;

        System.out.println(product.equals(product2)); // result: true. krn method equals sudah dioverride
        System.out.println(product.hashCode() == product2.hashCode());

        System.out.println(product.hashCode()); // result: -859672952 (override) vs 1480010240 (default)
        System.out.println(product2.hashCode()); // result: -859672952 (override) vs 81628611 (default)
    }
}
