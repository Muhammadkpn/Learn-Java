import java.util.Arrays;
import java.util.List;

public class ArrayApp {
    /**
     * Collection Interface
     * ● Interface Collection memiliki method toArray() untuk melakukan konversi collection ke Array
     * ● Ini sangat cocok jika kita ingin mengubah collection ke Array, misal saja karena mau memanggil
     * method yang memang parameternya tipenya array, bukan collection
     *
     * toArray method di collection
     * Object[] toArray() -> Mengubah collection menjadi array
     * T[] toArray(T[]) -> Mengubah collection menjadi array T
     */
    public static void main(String[] args) {
        List<String> names = List.of("Eko", "Kurniawan", "Khannedy");

        Object[] objects = names.toArray(); // convert to array without set a specific data type
        String[] strings = names.toArray(new String[]{}); // convert to array with set a specific data type

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
    }
}
