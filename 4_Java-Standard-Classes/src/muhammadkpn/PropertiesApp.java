package muhammadkpn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    /*
        Kebanyakan aplikasi Java akan menyimpapn konfigurasi file dalam bentuk properties file
        Properties file untuk menyimpan konfigurasi aplikai kita.
        Properties Class -> class yg bisa kita gunakan untuk mengambil atau menyimpan
        informasi ke file properties
     */

    public static void main(String[] args) {
        // Membaca key di file properties
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);
        } catch (FileNotFoundException e) {
            // Jenis error 1
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException exception) {
            // Jenis error 2
            System.out.println("Loading data from file is failed");
            exception.printStackTrace();
        }

        // Menyimpan data ke file properties. Bisa tanpa membuat filenya terlebih dahulu
        try {
            Properties properties = new Properties();
            // Menyimpan key & value ke variable properties
            properties.put("name.first", "Muhammad");
            properties.put("name.middle", "Kiky");
            properties.put("name.last", "PN");

            // method untuk menyimpan hasil penulisan informasi ke dalam file properties
            properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");
        } catch (FileNotFoundException e) {
            // Jenis error 1
            System.out.println("Error membuat file properties");
            e.printStackTrace();
        } catch (IOException exception) {
            // Jenis error 2
            System.out.println("Error menyimpan file properties");
            exception.printStackTrace();
        }
    }
}
