package muhammadkpn;

public class SystemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // Get current time with milisecond format
        System.out.println(System.nanoTime()); // Get current time with nanosecond format

        // Get environment in local
        System.out.println(System.getenv("USERNAME"));

        System.gc(); // Menjalankan Java garbage collection

        System.exit(1); // Menghentinkan program java

        System.out.println("Hello"); // Tidak dieksekusi, program sudah dihentikan
    }
}
