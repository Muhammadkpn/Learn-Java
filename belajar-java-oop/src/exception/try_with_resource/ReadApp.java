package exception.try_with_resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
        BufferedReader reader = null;

        // Manual Close Resource
        try {
            reader = new BufferedReader(
                    new FileReader("README.md")
            );

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error membaca file " + throwable.getMessage());
        } finally {
            // Menutup file setelah dilakukan deteksi dari isi file
            if (reader != null) {
                // reader.close() merupakan turunan dari Throwable jd memiliki kemungkinan exception.error
                try {
                    reader.close();
                    System.out.println("Sukses menutup");
                } catch (IOException exception) {
                    System.out.println("Error menutup resource " + exception.getMessage());
                }
            }
        }

        // Try with Resource -> BufferedReader merupakan turunan dari interface AutoCloseable
        try (BufferedReader reader2 = new BufferedReader(new FileReader("README.md"))){
            while (true) {
                String line = reader2.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error membaca file " + throwable.getMessage());
        }


    }
}
