public class Variable {
    public static void main(String[] args) {
        String name; // deklarasi
        name = "Muhammad Kiky Prasetyo Nurdin"; // assign

        System.out.println(name);

        int age = 25; // inisialisasi dari awal
        String city = "Bogor";

        System.out.println(age);
        System.out.println(city);

        // re-assign
        name = "Muhammad Kiky";
        // name = 100; // re-assign harus sesuai dengan tipe data dari variable
        System.out.println(name);

        var firstName = "Muhammad Kiky"; // var bisa digunakan tanpa mendeklarasikan tipe data
        var lastName = "Prasetyo Nurdin";
        // var familyName; // error. var harus lgsg diinisialisasikan nilai

        System.out.println(firstName);
        System.out.println(lastName);

        final String fullName = "Muhammad Kiky Prasetyo Nurdin"; // Mirip const di JavaScript
        // fullName = "Belajar Java Dasar"; // variable fullName tidak bisa diubah.
    }
}
