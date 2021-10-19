package record_class;

/**
 * Record sebuah template class yg berisi getter, equals, hashCode, toString, dan constructor dibuatkan
 * secara otomatis oleh java
 *
 * Record dikhususkan untuk menyimpan data dan datanya immutable(tidak bisa ubah krn field bersifat final)
 *
 * By default, saat kita membuat record class, secara otomatis kita akan meng-extends class java.lang.Record.
 * Oleh karena itu, tidak bisa menurunkan ke class lain dan hanya bisa mengimplementasikan dari interface lain
 */

public record LoginRequest(String username, String password) {

    // cara modifikasi constructor
    // tanpa tanda kurung untuk menambahkan sesuatu ke semua tipe constructor
    public LoginRequest {
        System.out.println("Membuat object LoginRequest");
    }

    // constructor overloading -> syaratnya harus memanggil constructor utama
    public LoginRequest (String username) {
        this(username, null);
    }

    // constructor overloading -> syaratnya harus memanggil constructor utama
    public LoginRequest () {
        this(null, null);
    }

    /**
     *
     * Tidak bisa mengganti isi field melalui method, karena field bersifat final
        public void setName(String username) {
            this.username = username;
        }
     */
}
