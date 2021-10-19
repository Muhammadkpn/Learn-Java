package introduction.static_keyword;

public class MathUtil {
    // static method -> bisa diakses tanpa instansiasi class MathUtil
    public static int sum(int... values) {
        int total = 0;
        for (var value: values){
            total += value;
        }
        return total;
    }
}
