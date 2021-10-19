public class Continue {
    public static void main(String[] args) {
        // continue untuk skip perulangan di index ke-i
        for (var counter = 1; counter <= 100; counter++){
            if(counter % 2 == 0){
                continue;
            }
            System.out.println("Perulangan Ganjil " + counter);
        }
    }
}
