public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        int age;
        // age = null; // error. Tipe data primitif tidak bisa di assign dengan null
        age = 0;

        System.out.println(age);

        Integer umur;
        umur = null; // Tipe data bukan primitif bisa di assign dengan nilai null
        System.out.println(umur);

        /* konversi primitif to non-primitif*/
        int iniInt = 100;

        Integer intObject = iniInt; // konversi primitif ke non-primitif dengan tipe data yang sama

        short iniShort = intObject.shortValue(); // konversi primitif -> non-primitif dengan tipe data yang berbeda
        long iniLong = intObject.longValue();
        float iniFloat = intObject.floatValue();

        System.out.println(iniShort);

    }
}
