package muhammadkpn;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {
        // UUID -> Class untuk format standard dalam membuat unique value
        for (var i = 0; i < 100; i++) {
            // Secepat apapun kita meng-generate nilai UUID, nilainya akan selalu unique
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();

            System.out.println(key);
        }
    }
}
