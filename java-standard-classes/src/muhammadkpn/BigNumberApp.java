package muhammadkpn;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        // BigNumber untuk menggunakan angka yg lebih besar dari Long (Integer) atau Double (Decimal)
        // BigInteger & BigDecimal merupakan class biasa jadi untuk operasi matematikanya menggunakan built-in dari method tsb
        BigInteger a = new BigInteger("10000000000000000000000000000000");
        BigInteger b = new BigInteger("10000000000000000000000000000000");

        BigInteger c = a.add(b); // method class BigInteger untuk operasi pertambahan
        System.out.println(c); // result: 20000000000000000000000000000000

        BigDecimal d = new BigDecimal("00000000000000000000.213");
        BigDecimal e = new BigDecimal("-00000000000000000000.213");

        BigDecimal f = d.min(e); // method class BigDecimal untuk mencari nilai terkecil
        System.out.println(f); // result: -0.213
    }
}
