import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Muhammad", "Muhammad Value");
        map.put("Kiky", "Kiky Value");
        map.put("PN", "PN Value");

        // forEach with java lambda
        map.forEach((key, value) -> System.out.println(key + ":" + value));
        // Standard
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });
    }
}
