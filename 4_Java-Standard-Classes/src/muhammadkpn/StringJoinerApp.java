package muhammadkpn;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        // Menggabungkan array menjadi sebuah string dengan customisasi di bagian delimiter, prefix, & suffix
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");

        // method to add element in array
        joiner.add("Muhammad");
        joiner.add("Kiky");
        joiner.add("PN");

        String strJoiner = joiner.toString ();
        System.out.println(strJoiner); // result: { Muhammad, Kiky, PN }

        // Menggabungkan dari array
        String[] gabung = {
                "Muhammad", "Kiky", "PN"
        };
        StringJoiner joiner2 = new StringJoiner(", ", "{ ", " }");
        for (var item : gabung) {
            joiner2.add(item);
        }
        String strJoiner2 = joiner2.toString();
        System.out.println(strJoiner2); // result: { Muhammad, Kiky, PN }
    }
}
