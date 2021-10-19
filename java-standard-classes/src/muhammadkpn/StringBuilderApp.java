package muhammadkpn;

public class StringBuilderApp {
    public static void main(String[] args) {
        // Re-assign String konvensional
        String name = "Muhammad ";
        name = name + " Kiky";
        name = name + " PN";

        System.out.println(name);

        /*
         * Terlihat seperti hanya 1 data/object. namun, di memory itu ada 3 data/object. karena,
         * di String Java itu String datanya immutable. Jadi, jika ingin manipulasi
         * String disarankan untuk tidak menggunakan String asli supaya tidak menumpuk
         * di memory
         *
         * alternatif: StringBuilder(non thread safe), StringBuffer(thread safe)
         */

        // StringBuilder -> manipulasi data string ttp dianggap 1 object, sehingga tidak boros memory. Kekurangan -> code jd agak panjang
        StringBuilder builder = new StringBuilder();
        builder.append("Muhammad ");
        builder.append(" Kiky");
        builder.append(" PN");

        String names = builder.toString();
        System.out.println(names);
    }
}
