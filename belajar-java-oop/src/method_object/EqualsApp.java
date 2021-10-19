package method_object;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Muhammad";
        first = first + " Kiky";

        System.out.println(first);

        String second = "Muhammad Kiky";
        System.out.println(second);

        /**
         * "==" -> perbandingan memorinya. jd walaupun membandingkan dua variable
         *         yg isinya sama, tp salah satu dari variable isinya tidak dideklarasikan
         *         secara lgsg. Maka td "==" akan membaca sebagai dua variable yg berbeda
         * "equals()" -> untuk perbandingan class String, method equals membandingkan isi
         *              dari variable yg bertipe data String.
         */
        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Muhammad Kiky";
        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
