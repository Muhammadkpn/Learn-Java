public class MethodReturnValue {
    public static void main(String[] args) {
        var a = 100;
        var b = 100;
        var c = sum(a, b);

        System.out.println(c);

        System.out.println(hitung(10, "-", 15));
        System.out.println(hitung(10, "kurang", 15));

    }
    // secara default method tidak me-return value apapun. Ganti void dengan tipe data yg kita inginkan agar bisa mereturn value
    static int sum (int val1, int val2) {
        var total = val1 + val2;
        return total;
    }

    // return diberbagai kondisi
    static int hitung (int val1, String operasi, int val2){
        switch (operasi){
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            case "*":
                return val1 * val2;
            case "/":
                return val1 / val2;
            default:
                return 0;
        }
    }
}
