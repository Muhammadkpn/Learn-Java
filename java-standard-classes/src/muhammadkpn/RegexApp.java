package muhammadkpn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String name = ";Muhammad; ;Kiky; PN Matematika, ;Universitas; Padjadjaran";

        // Print substring yg diawali dan diakhiri tanda ";"
        Pattern pattern = Pattern.compile("[;][a-zA-Z]*[;]"); // Untuk kompilasi dari pattern yg telah dibuat
        Matcher matcher = pattern.matcher(name); // untuk melakukan pencarian sesuai pattern yg kita buat

        while (matcher.find()) {
            String result = matcher.group(); // menyimpan hasil pencarian regex
            System.out.println(result);
        }
    }
}
