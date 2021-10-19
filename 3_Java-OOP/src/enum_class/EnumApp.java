package enum_class;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Kiky");
        customer.setLevel(Level.VIP); // set level in customer class based on enumartions on Level class

        System.out.println(customer.getName()); // result: Kiky
        System.out.println(customer.getLevel()); // result: VIP
        System.out.println(customer.getLevel().getDescription()); // result: VIP Level

        // conversion from enum to string
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        // Cari nilai enum di sebuah enum class. Jika nilai enum tidak ada? Error!
        // conversion from string to enum.
        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Get all option of enum");
        for (var value: Level.values()) {
            System.out.println(value);
        }

    }
}
