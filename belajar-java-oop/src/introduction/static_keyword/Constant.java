package introduction.static_keyword;

public class Constant {
    // Biasanya static nama variable huruf besar dan sifatnya final
    public static String APPLICATION = "Belajar Java";
    public static int VERSION = 1;

    public static void changeVersion(int version) {
        VERSION = version;
    }
    public void changeWithoutStatic(int version) {
        VERSION = version;
    }
}
