import java.util.List;
import java.util.Vector;

public class VectorApp {
    /**
     * Vector
     * ● Vector class adalah implementasi dari interface List (Mirip dengan List)
     * ● Cara kerja Vector mirip dengan ArrayList, yang membedakan adalah semua method di Vector
     * menggunakan kata kunci synchronized yang artinya dia thread safe
     * ● Namun problemnya adalah, karena semua method menggunakan kata kunci synchronized, secara
     * otomatis impact nya ke-performance yang menjadi lambat dibandingkan menggunakan ArrayList
     * ● jika kita ingin membuat List yang bisa digunakan di proses paralel? Di versi Java
     * baru, sudah disediakan yang lebih canggih untuk itu.
     * oleh karena itu penggunakan Vector sudah jarang sekali ditemui sekarang
     */
    public static void main(String[] args) {
        List<String> list = new Vector<>();

        list.add("Muhammad");
        list.add("Kiky");
        list.add("PN");

        for (var value : list){
            System.out.println(value);
        }
    }
}
