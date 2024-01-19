import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionDefaultMethodApp {
    /**
     * Default Method
     * ● Di Java 8 ada fitur bernama Default Method, dimana kita bisa menambahkan konkrit method di
     * interface
     * ● Fitur ini banyak sekali digunakan di Java Collection, karena kita tahu semua collection di Java
     * memiliki kontrak interface, sehingga dengan mudah di Java bisa meng-improve kemampuan semua
     * collection hanya dengan menambahkan default method di interface collection nya
     *
     *
     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        // Mengubah seluruh data di collection. List.replaceAll(operator)
        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 10;
            }
        });
        System.out.println(numbers);

        // Melakukan iterasi seluruh data collection. List.forEach(consumer)
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        // Menghapus data di collection menggunakan predicate. List.removeIf(predicate)
        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 500;
            }
        });
        System.out.println(numbers);
    }
}
