public class KonversiNumber {
    public static void main(String[] args) {
        // Dari tipe data terkecil -> terbesar => Otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // Dari tipe data terbesar -> terkecil => Manual
        int iniInt2 = 1000;
        byte iniByte3 = (byte) iniInt2;
        /* Hal diatas akan menimbulkan number overflow
            Number overflow terjadi jika nilai yang kita ingin konversi melebihi kapasitas maksimal dari tipe data yang
            yang kita tuju, maka nilai yang kita konversi tersebut akan mengulang dari nilai terkecil dari tipe data tersebut.
            Contoh: Jika kita konversi iniInt3 = 1000, maka jika nilainya sudah mencapai nilai maks tipe data byte di 127,
            maka nilainya akan balik ke nilai minimal dari byte, yaitu -128 dan terus berulang hingga mencapai nilai yang
            ingin dikonversi.
         */
    }
}
