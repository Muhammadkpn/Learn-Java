public class WhileLoop {
    public static void main(String[] args) {
        // while hanya memakai kondisi perulangan dan tidak memakai initial dan post statement
        var counter = 1;

        while (counter <= 10) {
            System.out.println("Perulangan ke-" + counter);

            counter++;
        }
    }
}
