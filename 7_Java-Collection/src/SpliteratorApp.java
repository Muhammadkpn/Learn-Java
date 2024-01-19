import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
    /**
     * Spliterator Interface
     * - Spliterator adalah interface yang bisa digunakan untuk melakukan partisi data collection
     * - Biasanya ini digunakan ketika kita akan memproses collection dalam jumlah besar, lalu agar lebih
     * cepat di split menjadi beberapa dan diproses secara paralel agar lebih cepat
     * - Penggunaan Spliterator biasanya erat kaitannya dengan Java Thread atau Java Concurrency,
     * namun di materi ini kita tidak akan membahas tentang itu, lebih fokus ke Spliterator
     */
    public static void main(String[] args) {
        List<String> list = List.of("Eko", "Kurniawan", "Khannedy", "Programmer", "Zaman", "Now");

        // Split 1 list dibagi dua
        Spliterator<String> spliterator1 = list.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        // estimate size
        System.out.println(spliterator1.estimateSize());
        System.out.println(spliterator2.estimateSize());

        // iterasi satu per satu
        spliterator1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
