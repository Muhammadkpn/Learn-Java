public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
        System.out.println(1 * 2 * 3 * 4 * 5);

        loopingRecursive(50000); // akan mengalami error StackOverFlow di looping ke 20rb-an
    }

    static int factorialLoop (int value) {
        var result = 1;
        for (int counter = 1; counter <= value; counter++){
            result *= counter;
        }
        return result;
    }

    static int factorialRecursive (int counter) {
        if (counter == 1) {
            return 1;
        } else {
            return counter * factorialRecursive(counter - 1);
        }
    }

    /*
        error StackOverFlow => ketika sebuah method dipanggil, maka Java akan menyimpannya di dalam stack.
        ketika method tsb memanggil method lain, maka stack akan menumpuk terus dan jika pemanggilan method
        terlalu dalam akan terjadi error StackOverFlow
    */
    static void loopingRecursive (int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loopingRecursive(value - 1);
        }
    }
}
