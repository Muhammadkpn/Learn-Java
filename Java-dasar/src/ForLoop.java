public class ForLoop {
    public static void main(String[] args) {
        /*
        Perulangan tanpa kondisi
        for(;;){
            System.out.println("Infinite Loop");
        }
        */

        // Perulangan dengan kondisi
        var counter = 1;
        for(; counter <= 10;) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }
        System.out.println(counter);

        // Perulangan dengan init statement
        for (var counter2 = 1; counter2 <= 10;){
            System.out.println("Perulangan ke-" + counter2);
        }

        // Perulangan dengan post statement
        for (var counter3 = 1; counter3 <= 10;){
            System.out.println("Perulangan ke-" + counter3);
        }
    }
}
