package introduction.static_keyword;

public class Application {
    public static final int PROCESSOR;

    // Static block akan di eksekusi sekali sebelum class Application di load
    // Static block hanya bisa mengakses static variable atau static method
    static {
        System.out.println("Mengakses class Application");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
