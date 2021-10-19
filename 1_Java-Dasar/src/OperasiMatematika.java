public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        int c = a + b;

        System.out.println("c = " + c);
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + a * b);
        System.out.println("a / b = " + a / b);
        System.out.println("a % b = " + a % b);

        int d = 100;

        d += 10;
        System.out.println(d);

        d -= 10;
        System.out.println(d);

        d *= 10;
        System.out.println(d);

        int e = 100;

        e++;
        System.out.println(e);

        e--;
        System.out.println(e);
    }
}
