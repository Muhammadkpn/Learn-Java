package muhammadkpn;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        /*
            StringTokenizer lebih irit memory dibanding split, karena Class ini
            memotong string secara bertahap, sehingga kita bisa sebagian string. Tidak seperti method split dari array biasa
            yg memotongnya sekaligus
         */
        String value = "Muhammad Kiky PN";
        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        // method hasMoreTokens -> check apakah ada token yg available untuk di split
        while (tokenizer.hasMoreTokens()) {
            // nextToken() -> return to next token based on delimiter
            String result = tokenizer.nextToken();
            System.out.println(result);
        }

        // example of nextToken
        String value2 = "Muhammad;Kiky;PN";
        // delimiter bisa ditempatkan saat instansiasi atau di param method nextToken()
        StringTokenizer tokenizer1 = new StringTokenizer(value2);
        System.out.println("Next token is: " + tokenizer1.nextToken(";"));

        // countToken
        int countToken = tokenizer1.countTokens();
        System.out.println("Jumlah token: " + countToken);
    }
}
