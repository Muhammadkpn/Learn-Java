package encapsulation.packages_modifier;

// import digunakan untuk mengakses class di package yg berbeda. syaratnya class tsb harus bertipe public

// import semua class yg ada didalam package
// import data.*;
//default import automatically -> semua package yg ada di java.lang sudah auto import

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Asus Zenbook Duo", "Gadget", 25_000_000);

        System.out.println(product.name); // result: Asus Zenbook Duo. Field type: public -> selalu accessible
        // System.out.println(product.category); // exception.error: can't access. Field type: protected -> hanya bisa akses di package yg sama
        // System.out.println(product.price); // exception.error: can't access. Field type: private -> hanya bisa akses di class yg sama

        Data data = new Data();
    }
}
