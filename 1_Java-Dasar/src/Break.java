public class Break {
    public static void main(String[] args) {
        // break akan menghentikan proses looping walaupun kondisi looping masih memenuhi
        var counter = 1;

        while (true) {
            System.out.println("Perulangan ke-" + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }

        System.out.println("Perulangan berhenti");
    }
}
