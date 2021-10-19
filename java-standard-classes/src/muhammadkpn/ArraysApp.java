package muhammadkpn;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1, 2, 3, 4, 23, 12, 31, 11, 8
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        /*
            binarySearch -> mencari value di array. result < 0 artinya value tidak ditemukan
                algortimanya akan memotong setengah2. method ini lebih cepat dari sequencial
            return value -> index dari value tsb
         */
        System.out.println(Arrays.binarySearch(numbers, 31));
        System.out.println(Arrays.binarySearch(numbers, 11));
        System.out.println(Arrays.binarySearch(numbers, 9));

        // copy array
        int[] result = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 0, 3);
        System.out.println(Arrays.toString(result2));
    }
}
