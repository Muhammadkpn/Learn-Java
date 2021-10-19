package muhammadkpn;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String original = "Muhammad Kiky PN";
        System.out.println("Original: " + original);

        byte[] originalByte = original.getBytes(); // convert to byte array
        System.out.println("byte array: " + originalByte);

        String encoded = Base64.getEncoder().encodeToString(originalByte);
        System.out.println("encoded: " + encoded);

        byte[] decodeBytes = Base64.getDecoder().decode(encoded);
        System.out.println("decode byte array: " + decodeBytes);
        String decode = new String(decodeBytes);
        System.out.println("decoded: " + decode);
    }
}
