package muhammadkpn;

public class StringApp {
    public static void main(String[] args) {
        String name = "Muhammad Kiky Prasetyo Nurdin";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        // variable nameLowerCase & nameUpperCase tidak merubah variable name-nya
        System.out.println(name); // result: Muhammad Kiky Prasetyo Nurdin
        System.out.println(nameLowerCase); // result: muhammad kiky prasetyo nurdin
        System.out.println(nameUpperCase); // result: MUHAMMAD KIKY PRASETYO NURDIN

        System.out.println("================");

        System.out.println(name.length()); // result: 29. length -> panjang string
        System.out.println(name.startsWith("Kiky")); // result: false. startsWith -> compare elemen diawal string vs value
        System.out.println(name.endsWith("Nurdin")); // result: true. endsWith -> compare elemen diakhir string vs value

        System.out.println("================");

        // convert string to array
        String[] names = name.split(" ");
        for(var value : names) {
            // print every element in array
            System.out.println(value);
        }

        System.out.println("================");

        // isBlank -> true: isi string kosong atau hanya spasi
        System.out.println("  d".isBlank()); // result: false.
        System.out.println("".isBlank()); // result: true.

        // isEmpty -> true: length dari string = 0
        System.out.println(" ".isEmpty()); // result: false
        System.out.println("".isEmpty()); // result: true

        // chartAt -> ambil element string di index tertentu
        System.out.println(name.charAt(2));

        // convert string to array tipe char -> setiap 1 elemen, ada 1 karakter
        char[] chars = name.toCharArray();
        for(var value : chars) {
            System.out.println(value);
        }


    }
}
