package method_object;
// package software.developer.salah; // exception.error.

import java.util.Objects;

class Product {
    String name;
    int price;
    String category;
    /**
     *  toString() otomatis dipanggil saat memakai method println. Secara default,
     *  toString() akan menghasilkan: namaclass+@+hashCode. Oleh karena itu,
     *  untuk mengubahnya kita harus melakukan override thd method toString()
     */
    public String toString() {
        return "Product name: " + name + ", price: " + price;
    }

    /**
     * equals() pada object, by default dia akan membandingkan memorinya,
     * sehingga walaupun isi field dari variable-nya bernilai sama. equals()
     * akan tetap menganggap itu berbeda.
     */
    // override method equals secara otomatis via IDE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        /**
         *
         * Cara pertama
            if (price != product.price) return false;
            if (name != null ? !name.equals(product.name) : product.name != null) return false;
            return category != null ? category.equals(product.category) : product.category == null;
         */
        // Cara kedua
         return price == product.price && Objects.equals(name, product.name) && Objects.equals(category, product.category);
    }


    /**
     * hashCode() -> reprenstasi integer object kita sesuai data di memory
     * Hashcode berguna untuk membuat struktur data unique seperti HashMap, set, dll
     * untuk mendapatkan identitas unique object kita.
     * By default, hashCode akan mengembalikan nilai integer sesuai data di memory,
     * namun kita bisa mengoverride jika kita ingin
     */
    @Override
    public int hashCode() {
        /**
         *
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + price;
        return result;
         */
        // Cara kedua
        return Objects.hash(name, price);
    }


    // override method equals secara manual
//    public boolean equals (Object o) {
//        if(o == this) {
//            return true;
//        }
//
//        if (!(o instanceof Product)) {
//            return false;
//        }
//
//        Product product = (Product) o;
//
//        if(this.price != product.price) {
//            return false;
//        }
//
//        if (this.name != null){
//            return this.name.equals(product.name);
//        } else {
//            return product.name == null;
//        }
//    }
}
