public class Array {
    public static void main(String[] args) {
        String[] stringArray; // or String stringArray[]
        stringArray = new String[3];

        stringArray[0] = "Muhammad";
        stringArray[1] = "Kiky";
        stringArray[2] = "PN";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // Mengubah nilai
        stringArray[2] = "Sadikin";

        System.out.println(stringArray[2]);

        String[] stringArray2 = new String[3];

        String[] namaPanjang = {
                "Muhammad", "Kiky", "PN"
        };

        // Tidak bisa menghapus nilai array, tp kita bisa ubah nilainya ke null
        namaPanjang[2] = null;

        // deklarasi langsung dengan menggunakan keyword new
        int[] arrayInt = new int[] {
                1, 2, 3, 4, 5
        };

        // deklarasi langsung tanpa menggunakan keyword new
        long[] arrayLong = {
                10L, 20L, 30L
        };
        arrayLong[0] = 0;

        // panjang array
        System.out.println(arrayLong.length);

        String[][] members = {
                {"Eko", "Kurniawan"},
                {"Budi", "Nugraha"},
                {"Joko"}
        };
        System.out.println(members[0]); // tidak bisa. result: [Ljava.lang.String;@e9e54c2
        System.out.println(members[0][1]);
        System.out.println(members[2][0]);

        int[][] intArray = new int[3][3];
        intArray[0][0] = 0;
        intArray[0][1] = 1;
        /*
            Jika kita tidak mengisi element dari salah satu index,
            maka hasilnya array otomatis terisi default value dari tipe data tersebut
        */
        // intArray[0][2] = 2;
        intArray[1][0] = 10;
        intArray[1][1] = 11;
        intArray[1][2] = 12;
        intArray[2][0] = 20;
        intArray[2][1] = 21;
        intArray[2][2] = 22;
        System.out.println(intArray[0][2]);
    }
}
