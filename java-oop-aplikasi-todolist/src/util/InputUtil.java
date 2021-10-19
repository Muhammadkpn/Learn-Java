package util;

import java.util.Scanner;

public class InputUtil {
    // default field untuk deklarasikan Scanner Class
    private static Scanner scanner = new Scanner(System.in);

    public static String input (String info) {
        // untuk menambahkan info di dalam form input
        System.out.print(info + ": ");
        String data = scanner.nextLine();
        return data;
    }
}
